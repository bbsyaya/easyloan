package com.vinnypay.easyloan.web.action;

import com.vinnypay.easyloan.enums.ReturnCode;
import com.vinnypay.easyloan.result.AuthCustomerResult;
import com.vinnypay.easyloan.result.BaseResult;
import com.vinnypay.easyloan.result.CustomerResult;
import com.vinnypay.easyloan.result.LoginResult;
import com.vinnypay.easyloan.domainservice.CustomerService;
import com.vinnypay.easyloan.web.convert.ExceptionConvert;
import com.vinnypay.easyloan.web.convert.ObjectConvert;
import com.vinnypay.easyloan.web.domain.AjaxResponse;
import com.vinnypay.easyloan.web.param.AuthCustomerParam;
import com.vinnypay.easyloan.web.param.CustomerParam;
import com.vinnypay.easyloan.web.param.MobileCodeParam;
import com.vinnypay.easyloan.web.param.QueryCustomerParam;
import com.vinnypay.easyloan.web.processor.ProcessAjaxResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: CustomerAction, v1.0 2017/9/12 12:51 Vinny Exp $
 */
@Controller
@RequestMapping("/customer")
public class CustomerAction extends BaseAction{

    @Resource(name = "customerService")
    private CustomerService customerService;

    @RequestMapping("/updateAuthCustomer.do")
    @ResponseBody
    public AjaxResponse updateAuthCustomer(AuthCustomerParam authCustomerParam) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        logger.info("[updateAuthCustomer]请求入参:{}", authCustomerParam);
        try {

            commonValidator.validateWithException(authCustomerParam);

            AuthCustomerResult result = customerService.updateAuthCustomerInfo(ObjectConvert.convertToMobileCodeInfo(authCustomerParam));

            if (result.isSuccess()) {
                ProcessAjaxResponse.ProcessResponse(true, ajaxResponse, result, ReturnCode.SUCCESS);
                ajaxResponse.setData(result.getAuthCustomerInfo());
            } else {
                ProcessAjaxResponse.ProcessResponse(false, ajaxResponse, result, ReturnCode.FAIL);
            }

        } catch (Exception e) {
            logger.error("执行[updateAuthCustomer]异常:", e);
            ExceptionConvert.convertException(ajaxResponse, e);
        }

        logger.info("[updateAuthCustomer]返回结果:{}", ajaxResponse);
        return ajaxResponse;

    }

    @RequestMapping("/getAuthCustomer.do")
    @ResponseBody
    public AjaxResponse getAuthCustomer(QueryCustomerParam queryCustomerParam) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        logger.info("[getAuthCustomer]请求入参:{}", queryCustomerParam);
        try {

            commonValidator.validateWithException(queryCustomerParam);

            AuthCustomerResult result = customerService.getAuthCustomerInfo(queryCustomerParam.getClientType(),
                    queryCustomerParam.getSessionKey(), queryCustomerParam.getAppVersion(), queryCustomerParam.getBusinessLine());

            if (result.isSuccess()) {
                ProcessAjaxResponse.ProcessResponse(true, ajaxResponse, result, ReturnCode.SUCCESS);
                ajaxResponse.setData(result.getAuthCustomerInfo());
            } else {
                ProcessAjaxResponse.ProcessResponse(false, ajaxResponse, result, ReturnCode.FAIL);
            }

        } catch (Exception e) {
            logger.error("执行[getAuthCustomer]异常:", e);
            ExceptionConvert.convertException(ajaxResponse, e);
        }

        logger.info("[getAuthCustomer]返回结果:{}", ajaxResponse);
        return ajaxResponse;

    }

    @RequestMapping("/retrievePwd.do")
    @ResponseBody
    public AjaxResponse retrievePwd(MobileCodeParam mobileCodeParam) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        logger.info("[retrievePwd]请求入参:{}", mobileCodeParam);
        try {

            commonValidator.validateWithException(mobileCodeParam);

            BaseResult result = customerService.retrievePwd(ObjectConvert.convertToMobileCodeInfo(mobileCodeParam));

            if (result.isSuccess()) {
                ProcessAjaxResponse.ProcessResponse(true, ajaxResponse, result, ReturnCode.SUCCESS);
            } else {
                ProcessAjaxResponse.ProcessResponse(false, ajaxResponse, result, ReturnCode.FAIL);
            }

        } catch (Exception e) {
            logger.error("执行[retrievePwd]异常:", e);
            ExceptionConvert.convertException(ajaxResponse, e);
        }

        logger.info("[retrievePwd]返回结果:{}", ajaxResponse);
        return ajaxResponse;

    }


    @RequestMapping("/register.do")
    @ResponseBody
    public AjaxResponse register(MobileCodeParam mobileCodeParam) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        logger.info("[register]请求入参:{}", mobileCodeParam);
        try {

            commonValidator.validateWithException(mobileCodeParam);

            LoginResult result = customerService.registerUser(ObjectConvert.convertToMobileCodeInfo(mobileCodeParam));

            if (result.isSuccess()) {
                ProcessAjaxResponse.ProcessResponse(true, ajaxResponse, result, ReturnCode.SUCCESS);
                ajaxResponse.setData(result);
            } else {
                ProcessAjaxResponse.ProcessResponse(false, ajaxResponse, result, ReturnCode.FAIL);
            }

        } catch (Exception e) {
            logger.error("执行[register]异常:", e);
            ExceptionConvert.convertException(ajaxResponse, e);
        }

        logger.info("[register]返回结果:{}", ajaxResponse);
        return ajaxResponse;

    }

    @RequestMapping("/getCustomerInfo.do")
    @ResponseBody
    public AjaxResponse getCustomerInfo(@RequestParam("sessionKey") String sessionKey) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        logger.info("[getCustomerInfo]请求入参:sessionKey:{}", sessionKey);
        try {

            CustomerResult result = customerService.getCustomerInfo(sessionKey);

            if (result.isSuccess()) {
                ProcessAjaxResponse.ProcessResponse(true, ajaxResponse, result, ReturnCode.SUCCESS);
                ajaxResponse.setData(result.getCustomerInfo());
            } else {
                ProcessAjaxResponse.ProcessResponse(false, ajaxResponse, result, ReturnCode.FAIL);
            }

        } catch (Exception e) {
            logger.error("执行[getCustomerInfo]异常:", e);
            ExceptionConvert.convertException(ajaxResponse, e);
        }

        logger.info("[getCustomerInfo]返回结果:{}", ajaxResponse);
        return ajaxResponse;

    }

    @RequestMapping("/updateCustomerInfo.do")
    @ResponseBody
    public AjaxResponse updateCustomerInfo(CustomerParam customerParam) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        logger.info("[getCustomerInfo]请求入参:{}", customerParam);
        try {

            commonValidator.validateWithException(hashCode());

            CustomerResult result = customerService.updateCustomerInfo(ObjectConvert.convertToCustomerInfo(customerParam));

            if (result.isSuccess()) {
                ProcessAjaxResponse.ProcessResponse(true, ajaxResponse, result, ReturnCode.SUCCESS);
                ajaxResponse.setData(result.getCustomerInfo());
            } else {
                ProcessAjaxResponse.ProcessResponse(false, ajaxResponse, result, ReturnCode.FAIL);
            }

        } catch (Exception e) {
            logger.error("执行[getCustomerInfo]异常:", e);
            ExceptionConvert.convertException(ajaxResponse, e);
        }

        logger.info("[getCustomerInfo]返回结果:{}", ajaxResponse);
        return ajaxResponse;

    }

}
