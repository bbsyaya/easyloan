package com.vinnypay.easyloan.domainservice.impl;

import com.vinnypay.easyloan.domain.AuthCustomerInfo;
import com.vinnypay.easyloan.domain.CustomerInfo;
import com.vinnypay.easyloan.domain.MobileCodeInfo;
import com.vinnypay.easyloan.enums.ReturnCode;
import com.vinnypay.easyloan.result.AuthCustomerResult;
import com.vinnypay.easyloan.result.BaseResult;
import com.vinnypay.easyloan.result.CustomerResult;
import com.vinnypay.easyloan.result.LoginResult;
import com.vinnypay.easyloan.domainservice.CustomerService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: CustomerServiceImpl, v1.0 2017/9/12 12:54 Vinny Exp $
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerResult getCustomerInfo(String sessionKey) {
        CustomerResult result = new CustomerResult();
        result.setSuccess(true);
        result.setResultCode(ReturnCode.SUCCESS.getCode());
        result.setReslutMessage(ReturnCode.SUCCESS.getMessage());

        CustomerInfo customerInfo = new CustomerInfo();
        customerInfo.setId("1000057");
        customerInfo.setUserId("12003899");
        customerInfo.setUserName("张三");
        customerInfo.setIdcard("429004198208099766");
        customerInfo.setHasCreditCard("0");
        customerInfo.setIncome("5000以下");
        customerInfo.setEducation("初中");
        customerInfo.setJob("自由职业");
        customerInfo.setCreateDate(new Date());

        result.setCustomerInfo(customerInfo);

        return result;
    }

    @Override
    public CustomerResult updateCustomerInfo(CustomerInfo customerInfo) {
        CustomerResult result = new CustomerResult();
        result.setSuccess(true);
        result.setResultCode(ReturnCode.SUCCESS.getCode());
        result.setReslutMessage(ReturnCode.SUCCESS.getMessage());

        customerInfo.setId("1000057");
        customerInfo.setCreateDate(new Date());

        result.setCustomerInfo(customerInfo);

        return result;

    }

    @Override
    public LoginResult registerUser(MobileCodeInfo mobileCodeInfo) {
        LoginResult loginResult = new LoginResult();
        loginResult.setSuccess(true);
        loginResult.setResultCode("0000");
        loginResult.setReslutMessage("注册成功");
        loginResult.setSessionKey(UUID.randomUUID().toString());

        return loginResult;
    }

    @Override
    public BaseResult retrievePwd(MobileCodeInfo registerInfo) {
        BaseResult result = new BaseResult();
        result.setSuccess(true);
        result.setResultCode("0000");
        result.setReslutMessage("密码重置成功");

        return result;
    }

    @Override
    public AuthCustomerResult getAuthCustomerInfo(String clientType, String sessionKey, String appVersion, String businessLine) {
        AuthCustomerResult result = new AuthCustomerResult();
        result.setSuccess(true);
        result.setResultCode(ReturnCode.SUCCESS.getCode());
        result.setReslutMessage(ReturnCode.SUCCESS.getMessage());

        AuthCustomerInfo authCustomerInfo = new AuthCustomerInfo();

        authCustomerInfo.setClientType(clientType);
        authCustomerInfo.setSessionKey(sessionKey);
        authCustomerInfo.setAppVersion(appVersion);
        authCustomerInfo.setBusinessLine(businessLine);

        authCustomerInfo.setAddress("杭州");
        authCustomerInfo.setIncomeType("工资收入");
        authCustomerInfo.setUserId("12003899");
        authCustomerInfo.setContactUser("zhangsan");
        authCustomerInfo.setId("1000204");
        authCustomerInfo.setUserName("李四");
        authCustomerInfo.setEmail("lisi@163.com");
        authCustomerInfo.setContactPhone("13575701832");
        authCustomerInfo.setCreateDate(new Date());

        result.setAuthCustomerInfo(authCustomerInfo);

        return result;
    }

    @Override
    public AuthCustomerResult updateAuthCustomerInfo(AuthCustomerInfo authCustomerInfo) {
        AuthCustomerResult result = new AuthCustomerResult();
        result.setSuccess(true);
        result.setResultCode(ReturnCode.SUCCESS.getCode());
        result.setReslutMessage(ReturnCode.SUCCESS.getMessage());

        authCustomerInfo.setAddress("杭州");
        authCustomerInfo.setIncomeType("工资收入");
        authCustomerInfo.setUserId("12003899");
        authCustomerInfo.setContactUser("zhangsan");
        authCustomerInfo.setId("1000204");
        authCustomerInfo.setUserName("李四");
        authCustomerInfo.setEmail("lisi@163.com");
        authCustomerInfo.setContactPhone("13575701832");
        authCustomerInfo.setCreateDate(new Date());

        result.setAuthCustomerInfo(authCustomerInfo);

        return result;
    }
}
