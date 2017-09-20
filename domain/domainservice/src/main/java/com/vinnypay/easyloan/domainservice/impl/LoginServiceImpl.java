package com.vinnypay.easyloan.domainservice.impl;

import com.vinnypay.easyloan.domain.LoginInfo;
import com.vinnypay.easyloan.result.LoginResult;
import com.vinnypay.easyloan.domainservice.LoginService;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: LoginServiceImpl, v1.0 2017/9/11 17:23 Vinny Exp $
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Override
    public LoginResult login(LoginInfo loginInfo) {
        LoginResult loginResult = new LoginResult();
        loginResult.setSuccess(true);
        loginResult.setResultCode("0000");
        loginResult.setReslutMessage("登录成功");
        loginResult.setSessionKey(UUID.randomUUID().toString());

        return loginResult;
    }

}
