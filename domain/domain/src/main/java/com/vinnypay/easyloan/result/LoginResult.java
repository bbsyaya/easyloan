package com.vinnypay.easyloan.result;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: LoginResult, v1.0 2017/9/7 21:20 Vinny Exp $
 */
public class LoginResult extends BaseResult{

    private String sessionKey;

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

}
