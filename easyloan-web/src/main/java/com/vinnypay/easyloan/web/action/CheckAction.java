package com.vinnypay.easyloan.web.action;

import com.vinnypay.easyloan.enums.ReturnCode;
import com.vinnypay.easyloan.result.AppVersionResult;
import com.vinnypay.easyloan.result.BaseResult;
import com.vinnypay.easyloan.result.CheckResult;
import com.vinnypay.easyloan.domainservice.CheckService;
import com.vinnypay.easyloan.web.convert.ExceptionConvert;
import com.vinnypay.easyloan.web.convert.ObjectConvert;
import com.vinnypay.easyloan.web.domain.AjaxResponse;
import com.vinnypay.easyloan.web.param.VerifyMobileCodeParam;
import com.vinnypay.easyloan.web.processor.ProcessAjaxResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: CheckAction, v1.0 2017/9/14 13:59 Vinny Exp $
 */
@Controller
@RequestMapping("/")
public class CheckAction extends BaseAction {

    @Resource(name = "checkService")
    private CheckService checkService;

    @RequestMapping("/getAppVersion.do")
    @ResponseBody
    public AjaxResponse getAppVersion(@RequestParam("appName") String appName) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        logger.info("[getAppVersion]请求:appName:{}", appName);
        try {

            AppVersionResult result = checkService.getAppVersion(appName);

            if (result.isSuccess()) {
                ProcessAjaxResponse.ProcessResponse(true, ajaxResponse, result, ReturnCode.SUCCESS);
                ajaxResponse.setData(result.getAppVersionInfo());
            } else {
                ProcessAjaxResponse.ProcessResponse(false, ajaxResponse, result, ReturnCode.FAIL);
            }

        } catch (Exception e) {
            logger.error("执行[getAppVersion]异常:", e);
            ExceptionConvert.convertException(ajaxResponse, e);
        }

        logger.info("[getAppVersion]返回结果:{}", ajaxResponse);
        return ajaxResponse;
    }

    @RequestMapping("/getCheckStatus.do")
    @ResponseBody
    public AjaxResponse getCheckStatus(HttpServletRequest request) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        logger.info("[getCheckStatus]请求...");
        try {

            CheckResult result = checkService.getCheckStatus();

            if (result.isSuccess()) {
                ProcessAjaxResponse.ProcessResponse(true, ajaxResponse, result, ReturnCode.SUCCESS);
                ajaxResponse.setData(result);
            } else {
                ProcessAjaxResponse.ProcessResponse(false, ajaxResponse, result, ReturnCode.FAIL);
            }

        } catch (Exception e) {
            logger.error("执行[getCheckStatus]异常:", e);
            ExceptionConvert.convertException(ajaxResponse, e);
        }

        logger.info("[getCheckStatus]返回结果:{}", ajaxResponse);
        return ajaxResponse;
    }

    @RequestMapping("/getMobileCode.do")
    @ResponseBody
    public AjaxResponse getMobileCode(@RequestParam("sendType") String sendType, @RequestParam("mobileNo") String mobileNo) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        logger.info("[getMobileCode]请求:sendType:{},mobileNo:{}", sendType, mobileNo);
        try {

            BaseResult result = checkService.getMobileCode(sendType, mobileNo);

            if (result.isSuccess()) {
                ProcessAjaxResponse.ProcessResponse(true, ajaxResponse, result, ReturnCode.SUCCESS);
            } else {
                ProcessAjaxResponse.ProcessResponse(false, ajaxResponse, result, ReturnCode.FAIL);
            }

        } catch (Exception e) {
            logger.error("执行[getMobileCode]异常:", e);
            ExceptionConvert.convertException(ajaxResponse, e);
        }

        logger.info("[getMobileCode]返回结果:{}", ajaxResponse);
        return ajaxResponse;
    }

    @RequestMapping("/verifyMobileCode.do")
    @ResponseBody
    public AjaxResponse verifyMobileCode(VerifyMobileCodeParam verifyMobileCodeParam) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        logger.info("[verifyMobileCode]请求:{}", verifyMobileCodeParam);
        try {

            commonValidator.validateWithException(verifyMobileCodeParam);

            BaseResult result = checkService.verifyMobileCode(ObjectConvert.convertToMobileCodeInfo(verifyMobileCodeParam));

            if (result.isSuccess()) {
                ProcessAjaxResponse.ProcessResponse(true, ajaxResponse, result, ReturnCode.SUCCESS);
            } else {
                ProcessAjaxResponse.ProcessResponse(false, ajaxResponse, result, ReturnCode.FAIL);
            }

        } catch (Exception e) {
            logger.error("执行[verifyMobileCode]异常:", e);
            ExceptionConvert.convertException(ajaxResponse, e);
        }

        logger.info("[verifyMobileCode]返回结果:{}", ajaxResponse);
        return ajaxResponse;
    }
    
}
