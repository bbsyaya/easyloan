package com.vinnypay.easyloan.web.processor;

import com.vinnypay.easyloan.enums.ReturnCode;
import com.vinnypay.easyloan.result.BaseResult;
import com.vinnypay.easyloan.web.domain.AjaxResponse;

/**
 * <p>统一返回处理器</p>
 *
 * @author Vinny
 * @version $Id: ProcessResponse, v1.0 2017/9/7 18:22 Vinny Exp $
 */
public class ProcessAjaxResponse {

    public static AjaxResponse ProcessResponse(boolean result, AjaxResponse response, BaseResult baseResult, ReturnCode returnCode) {
        if (response == null || returnCode == null) {
            return new AjaxResponse();
        }

        response.setSuccess(result);
        response.setReturnCode(returnCode.getCode());
        response.setReturnMessage(returnCode.getMessage());
        response.setMessage(returnCode.getMessage());

        if (baseResult != null) {
            response.setMessage(baseResult.getReslutMessage());
        }

        return response;
    }
}
