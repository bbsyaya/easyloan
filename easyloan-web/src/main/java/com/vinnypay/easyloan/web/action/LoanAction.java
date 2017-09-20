package com.vinnypay.easyloan.web.action;

import com.vinnypay.easyloan.enums.ReturnCode;
import com.vinnypay.easyloan.result.ApplyResult;
import com.vinnypay.easyloan.result.BaseResult;
import com.vinnypay.easyloan.result.LoanResult;
import com.vinnypay.easyloan.result.LoanStepResult;
import com.vinnypay.easyloan.domainservice.LoanService;
import com.vinnypay.easyloan.web.constants.KeyConstant;
import com.vinnypay.easyloan.web.convert.ExceptionConvert;
import com.vinnypay.easyloan.web.convert.ObjectConvert;
import com.vinnypay.easyloan.web.domain.AjaxResponse;
import com.vinnypay.easyloan.web.param.PageParam;
import com.vinnypay.easyloan.web.processor.ProcessAjaxResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: LoanAction, v1.0 2017/9/7 16:32 Vinny Exp $
 */
@Controller
@RequestMapping("/loan")
public class LoanAction extends BaseAction {

    @Resource(name = "loanService")
    private LoanService loanService;

    @RequestMapping("/addApply.do")
    @ResponseBody
    public AjaxResponse addApply(@RequestParam("cloanNo") String cloanNo, @RequestParam("operationType") String operationType){
        AjaxResponse ajaxResponse = new AjaxResponse();
        logger.info("[addApply]请求入参:cloanNo:{}, operationType:{}", cloanNo, operationType);
        try {

            BaseResult result = loanService.addApply(cloanNo, operationType);

            if (result.isSuccess()) {
                ProcessAjaxResponse.ProcessResponse(true, ajaxResponse, result, ReturnCode.SUCCESS);
            } else {
                ProcessAjaxResponse.ProcessResponse(false, ajaxResponse, result, ReturnCode.FAIL);
            }

        } catch (Exception e) {
            logger.error("执行[addApply]异常:", e);
            ExceptionConvert.convertException(ajaxResponse, e);
        }
        logger.info("[addApply]返回结果:{}", ajaxResponse);
        return ajaxResponse;
    }

    @RequestMapping("/getLoanStep.do")
    @ResponseBody
    public AjaxResponse getLoanStep(@RequestParam("cloanNo") String cloanNo) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        logger.info("[getLoanStep]请求入参:cloanNo:{}", cloanNo);

        try {
            LoanStepResult result = loanService.getLoanStepList(cloanNo);

            if (result.isSuccess()) {
                ProcessAjaxResponse.ProcessResponse(true, ajaxResponse, result, ReturnCode.SUCCESS);
                Map<String, Object> dataMap = new HashMap<>();
                dataMap.put(KeyConstant.CLOAN_STEP_LIST, result.getLoanStepList());
                ajaxResponse.setData(dataMap);
            } else {
                ProcessAjaxResponse.ProcessResponse(false, ajaxResponse, result, ReturnCode.FAIL);
            }

        } catch (Exception e) {
            logger.error("执行[getLoanStep]异常:", e);
            ExceptionConvert.convertException(ajaxResponse, e);
        }

        logger.info("[getLoanStep]返回结果:{}", ajaxResponse);
        return ajaxResponse;
    }

    @RequestMapping("/getLoanList.do")
    @ResponseBody
    public AjaxResponse getLoanList(PageParam pageParam){
        AjaxResponse ajaxResponse = new AjaxResponse();
        logger.info("[getLoanList]请求入参:{}", pageParam);
        try {
            commonValidator.validateWithException(pageParam);
            LoanResult result = loanService.getLoanList(ObjectConvert.convertToQueryPage(pageParam), null);

            if (result.isSuccess()) {
                ProcessAjaxResponse.ProcessResponse(true, ajaxResponse, result, ReturnCode.SUCCESS);
                Map<String, Object> dataMap = new HashMap<>();
                dataMap.put(KeyConstant.TOTAL_COUNT, result.getQueryPage() == null ? 0 : result.getQueryPage().getTotalCount());
                dataMap.put(KeyConstant.CLOAN_LIST, result.getLoanList());
                ajaxResponse.setData(dataMap);
            } else {
                ProcessAjaxResponse.ProcessResponse(false, ajaxResponse, result, ReturnCode.FAIL);
            }

        } catch (Exception e) {
            logger.error("执行[getLoanList]异常:", e);
            ExceptionConvert.convertException(ajaxResponse, e);
        }

        logger.info("[getLoanList]返回结果:{}", ajaxResponse);
        return ajaxResponse;

    }

    @RequestMapping("/getTagLoanList.do")
    @ResponseBody
    public AjaxResponse getTagLoanList(PageParam pageParam, String tag){
        AjaxResponse ajaxResponse = new AjaxResponse();
        logger.info("[getTagLoanList]请求入参:{}", pageParam);
        try {
            commonValidator.validateWithException(pageParam);
            LoanResult result = loanService.getLoanList(ObjectConvert.convertToQueryPage(pageParam), tag);

            if (result.isSuccess()) {
                ProcessAjaxResponse.ProcessResponse(true, ajaxResponse, result, ReturnCode.SUCCESS);
                Map<String, Object> dataMap = new HashMap<>();
                dataMap.put(KeyConstant.CLOAN_LIST, result.getLoanList());
                dataMap.put(KeyConstant.TOTAL_COUNT, result.getQueryPage() == null ? 0 : result.getQueryPage().getTotalCount());
                ajaxResponse.setData(dataMap);
            } else {
                ProcessAjaxResponse.ProcessResponse(false, ajaxResponse, result, ReturnCode.FAIL);
            }

        } catch (Exception e) {
            logger.error("执行[getTagLoanList]异常:", e);
            ExceptionConvert.convertException(ajaxResponse, e);
        }

        logger.info("[getTagLoanList]返回结果:{}", ajaxResponse);
        return ajaxResponse;

    }

    @RequestMapping("/getApplyList.do")
    @ResponseBody
    public AjaxResponse getApplyList(PageParam pageParam, @RequestParam("operationType") String operationType){
        AjaxResponse ajaxResponse = new AjaxResponse();
        logger.info("[getApplyList]请求入参:{}", pageParam);
        try {
            commonValidator.validateWithException(pageParam);
            ApplyResult result = loanService.getApplyList(ObjectConvert.convertToQueryPage(pageParam), operationType);

            if (result.isSuccess()) {
                ProcessAjaxResponse.ProcessResponse(true, ajaxResponse, result, ReturnCode.SUCCESS);
                Map<String, Object> dataMap = new HashMap<>();
                dataMap.put(KeyConstant.CLOAN_USER_LIST, result.getApplyList());
                dataMap.put(KeyConstant.TOTAL_COUNT, result.getQueryPage() == null ? 0 : result.getQueryPage().getTotalCount());
                ajaxResponse.setData(dataMap);
            } else {
                ProcessAjaxResponse.ProcessResponse(false, ajaxResponse, result, ReturnCode.FAIL);
            }

        } catch (Exception e) {
            logger.error("执行[getApplyList]异常:", e);
            ExceptionConvert.convertException(ajaxResponse, e);
        }

        logger.info("[getApplyList]返回结果:{}", ajaxResponse);
        return ajaxResponse;

    }

}
