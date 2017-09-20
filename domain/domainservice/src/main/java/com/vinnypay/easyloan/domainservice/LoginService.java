package com.vinnypay.easyloan.domainservice;

import com.vinnypay.easyloan.domain.LoginInfo;
import com.vinnypay.easyloan.result.LoginResult;

/**
 * <p>登录服务</p>
 *
 * @author Vinny
 * @version $Id: LoginService, v1.0 2017/9/7 21:19 Vinny Exp $
 */

public interface LoginService extends BaseService{

    /**
     * 登录
     * @param loginInfo
     * @return
     */
    LoginResult login(LoginInfo loginInfo);

}
