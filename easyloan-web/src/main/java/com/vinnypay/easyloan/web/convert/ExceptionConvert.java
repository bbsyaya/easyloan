package com.vinnypay.easyloan.web.convert;

import com.vinnypay.easyloan.enums.ReturnCode;
import com.vinnypay.easyloan.web.domain.AjaxResponse;

/**
 * <p>异常错误转码</p>
 *
 * @author Vinny
 * @version $Id: ExceptionConvert, v1.0 2017/7/19 16:46 Vinny Exp $
 */
public class ExceptionConvert {
    public static void convertException(AjaxResponse response, Exception e) {
        if (response != null) {

            response.setSuccess(false);

            if (e != null) {

                if (e instanceof IllegalArgumentException) {

                    response.setReturnCode(ReturnCode.ILLEGAL_ARGUMENT.getCode());
                    response.setReturnMessage(ReturnCode.ILLEGAL_ARGUMENT.getMessage());
                    response.setMessage(e.getMessage());
                } else {
                    response.setReturnCode(ReturnCode.SYSTEM_ERROR.getCode());
                    response.setReturnMessage(ReturnCode.SYSTEM_ERROR.getMessage());
                    response.setMessage(ReturnCode.SYSTEM_ERROR.getMessage());
                }

            }

        }
    }
}
