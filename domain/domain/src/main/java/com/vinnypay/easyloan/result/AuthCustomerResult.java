package com.vinnypay.easyloan.result;

import com.vinnypay.easyloan.domain.AuthCustomerInfo;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: AuthCustomerResult, v1.0 2017/9/14 18:05 Vinny Exp $
 */
public class AuthCustomerResult extends BaseResult {

    private AuthCustomerInfo authCustomerInfo;

    public AuthCustomerInfo getAuthCustomerInfo() {
        return authCustomerInfo;
    }

    public void setAuthCustomerInfo(AuthCustomerInfo authCustomerInfo) {
        this.authCustomerInfo = authCustomerInfo;
    }
}
