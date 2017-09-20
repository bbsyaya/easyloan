package com.vinnypay.easyloan.web.convert;

import com.vinnypay.easyloan.domain.*;
import com.vinnypay.easyloan.web.param.*;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: ObjectConvert, v1.0 2017/9/7 21:35 Vinny Exp $
 */
public class ObjectConvert {
    public static LoginInfo convertToLoginInfo(LoginParam loginParam) {
        if (loginParam == null) {
            return null;
        }
        LoginInfo loginInfo = new LoginInfo();
        loginInfo.setMobileNo(loginParam.getMobileNo());
        loginInfo.setPassword(loginParam.getPassword());
        loginInfo.setPictureCode(loginParam.getPictureCode());
        loginInfo.setMachineNo(loginParam.getMachineNo());

        return loginInfo;

    }

    public static QueryPage convertToQueryPage(PageParam pageParam) {
        if (pageParam == null) {
            return null;
        }
        QueryPage queryPage = new QueryPage();
        int currentPage = Integer.parseInt(pageParam.getCurrentPage());
        queryPage.setCurrentPage(currentPage <= 0 ? 1 : currentPage + 1);
        queryPage.setPageSize(Integer.parseInt(pageParam.getPageSize()));

        return queryPage;

    }

    public static CustomerInfo convertToCustomerInfo(CustomerParam customerParam) {
        if (customerParam == null) {
            return null;
        }
        CustomerInfo customerInfo = new CustomerInfo();
        customerInfo.setUserId(customerParam.getUserId());
        customerInfo.setUserName(customerParam.getUserName());
        customerInfo.setIdcard(customerParam.getIdcard());
        customerInfo.setIncome(customerParam.getIncome());
        customerInfo.setJob(customerParam.getJob());
        customerInfo.setEducation(customerParam.getEducation());
        customerInfo.setHasCreditCard(customerParam.getHasCreditCard());

        return customerInfo;

    }

    public static MobileCodeInfo convertToMobileCodeInfo(MobileCodeParam registerParam) {
        if (registerParam == null) {
            return null;
        }
        MobileCodeInfo registerInfo = new MobileCodeInfo();
        registerInfo.setMobileNo(registerParam.getMobileNo());
        registerInfo.setMobileCode(registerParam.getMobileCode());
        registerInfo.setNewPwd(registerParam.getNewPwd());

        return registerInfo;
    }

    public static AuthCustomerInfo convertToMobileCodeInfo(AuthCustomerParam authCustomerParam) {
        if (authCustomerParam == null) {
            return null;
        }
        AuthCustomerInfo authCustomerInfo = new AuthCustomerInfo();
        authCustomerInfo.setAddress(authCustomerParam.getAddress());
        authCustomerInfo.setIncomeType(authCustomerParam.getIncomeType());
        authCustomerInfo.setAppVersion(authCustomerParam.getAppVersion());
        authCustomerInfo.setContactUser(authCustomerParam.getContactUser());
        authCustomerInfo.setClientType(authCustomerParam.getClientType());
        authCustomerInfo.setEmail(authCustomerParam.getEmail());
        authCustomerInfo.setContactPhone(authCustomerParam.getContactPhone());
        authCustomerInfo.setBusinessLine(authCustomerParam.getBusinessLine());
        authCustomerInfo.setSessionKey(authCustomerParam.getSessionKey());

        return authCustomerInfo;
    }

    public static MobileCodeInfo convertToMobileCodeInfo(VerifyMobileCodeParam verifyMobileCodeParam) {
        if (verifyMobileCodeParam == null) {
            return null;
        }
        MobileCodeInfo mobileCodeInfo = new MobileCodeInfo();
        mobileCodeInfo.setAppVersion(verifyMobileCodeParam.getAppVersion());
        mobileCodeInfo.setBusinessLine(verifyMobileCodeParam.getBusinessLine());
        mobileCodeInfo.setClientType(verifyMobileCodeParam.getClientType());
        mobileCodeInfo.setMobileNo(verifyMobileCodeParam.getMobileNo());
        mobileCodeInfo.setMobileCode(verifyMobileCodeParam.getMobileCode());
        mobileCodeInfo.setSendType(verifyMobileCodeParam.getSendType());

        return mobileCodeInfo;
    }
}
