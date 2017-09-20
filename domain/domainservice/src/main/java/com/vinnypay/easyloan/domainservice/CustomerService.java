package com.vinnypay.easyloan.domainservice;

import com.vinnypay.easyloan.domain.AuthCustomerInfo;
import com.vinnypay.easyloan.domain.CustomerInfo;
import com.vinnypay.easyloan.domain.MobileCodeInfo;
import com.vinnypay.easyloan.result.AuthCustomerResult;
import com.vinnypay.easyloan.result.BaseResult;
import com.vinnypay.easyloan.result.CustomerResult;
import com.vinnypay.easyloan.result.LoginResult;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: CustomerService, v1.0 2017/9/12 12:54 Vinny Exp $
 */
public interface CustomerService extends BaseService {

    CustomerResult getCustomerInfo(String sessionKey);

    CustomerResult updateCustomerInfo(CustomerInfo customerInfo);

    LoginResult registerUser(MobileCodeInfo registerInfo);

    BaseResult retrievePwd(MobileCodeInfo registerInfo);

    AuthCustomerResult getAuthCustomerInfo(String clientType, String sessionKey, String appVersion, String businessLine);

    AuthCustomerResult updateAuthCustomerInfo(AuthCustomerInfo authCustomerInfo);

}
