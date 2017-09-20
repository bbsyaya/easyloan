package com.vinnypay.easyloan.web.action;

import com.vinnypay.easyloan.enums.ReturnCode;
import com.vinnypay.easyloan.result.LoginResult;
import com.vinnypay.easyloan.domainservice.LoginService;
import com.vinnypay.easyloan.web.convert.ExceptionConvert;
import com.vinnypay.easyloan.web.convert.ObjectConvert;
import com.vinnypay.easyloan.web.domain.AjaxResponse;
import com.vinnypay.easyloan.web.param.LoginParam;
import com.vinnypay.easyloan.web.processor.ProcessAjaxResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: LoginAction, v1.0 2017/9/7 17:07 Vinny Exp $
 */
@Controller
@RequestMapping("/login")
public class LoginAction extends BaseAction{

    @Resource(name = "loginService")
    private LoginService loginService;

    @RequestMapping("/login.do")
    @ResponseBody
    public AjaxResponse login(LoginParam loginParam) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        logger.info("[login]请求入参:{}", loginParam);
        try {

            commonValidator.validateWithException(loginParam);

            LoginResult result = loginService.login(ObjectConvert.convertToLoginInfo(loginParam));

            if (result.isSuccess()) {
                ProcessAjaxResponse.ProcessResponse(true, ajaxResponse, result, ReturnCode.SUCCESS);
                ajaxResponse.setData(result);
            } else {
                ProcessAjaxResponse.ProcessResponse(false, ajaxResponse, result, ReturnCode.FAIL);
            }

        } catch (Exception e) {
            logger.error("执行[login]异常:", e);
            ExceptionConvert.convertException(ajaxResponse, e);
        }

        logger.info("[login]返回结果:{}", ajaxResponse);
        return ajaxResponse;

    }
}
