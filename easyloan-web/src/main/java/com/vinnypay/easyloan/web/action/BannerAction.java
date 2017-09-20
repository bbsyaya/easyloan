package com.vinnypay.easyloan.web.action;

import com.vinnypay.easyloan.domain.QueryPage;
import com.vinnypay.easyloan.enums.ReturnCode;
import com.vinnypay.easyloan.result.BannerResult;
import com.vinnypay.easyloan.domainservice.BannerService;
import com.vinnypay.easyloan.web.constants.KeyConstant;
import com.vinnypay.easyloan.web.convert.ExceptionConvert;
import com.vinnypay.easyloan.web.domain.AjaxResponse;
import com.vinnypay.easyloan.web.param.BannerParam;
import com.vinnypay.easyloan.web.processor.ProcessAjaxResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>合作机构控制器</p>
 *
 * @author Vinny
 * @version $Id: BannerAction, v1.0 2017/9/11 17:08 Vinny Exp $
 */
@Controller
@RequestMapping("/banner")
public class BannerAction extends BaseAction{

    @Resource(name = "bannerService")
    private BannerService bannerService;

    @RequestMapping("/getBannerList.do")
    @ResponseBody
    public AjaxResponse getBannerList(BannerParam param) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        logger.info("[getBannerList]请求入参:{}", param);
        try {
            commonValidator.validateWithException(param);

            BannerResult result = bannerService.getBannerList(new QueryPage());

            if (result.isSuccess()) {
                ProcessAjaxResponse.ProcessResponse(true, ajaxResponse, result, ReturnCode.SUCCESS);
                Map<String, Object> dataMap = new HashMap<>();
                dataMap.put(KeyConstant.BANNER_LIST, result.getBannerList());
                dataMap.put(KeyConstant.TOTAL_COUNT, result.getQueryPage() == null ? 0 : result.getQueryPage().getTotalCount());
                ajaxResponse.setData(dataMap);
            } else {
                ProcessAjaxResponse.ProcessResponse(false, ajaxResponse, result, ReturnCode.FAIL);
            }

        } catch (Exception e) {
            logger.error("执行[getBannerList]异常:", e);
            ExceptionConvert.convertException(ajaxResponse, e);
        }

        logger.info("[getBannerList]返回结果:{}", ajaxResponse);
        return ajaxResponse;
    }

}
