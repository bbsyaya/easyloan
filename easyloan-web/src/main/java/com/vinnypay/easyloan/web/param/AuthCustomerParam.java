package com.vinnypay.easyloan.web.param;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: AuthCustomerParam, v1.0 2017/9/14 18:31 Vinny Exp $
 */
public class AuthCustomerParam implements Serializable {

    @NotBlank(message = "address不可为空")
    private String address;

    @NotBlank(message = "incomeType不可为空")
    private String incomeType;

    @NotBlank(message = "appVersion不可为空")
    private String appVersion;

    @NotBlank(message = "contactUser不可为空")
    private String contactUser;

    @NotBlank(message = "sessionKey不可为空")
    private String sessionKey;

    @NotBlank(message = "clientType不可为空")
    private String clientType;

    @NotBlank(message = "email不可为空")
    private String email;

    @NotBlank(message = "contactPhone不可为空")
    private String contactPhone;

    @NotBlank(message = "businessLine不可为空")
    private String businessLine;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(String incomeType) {
        this.incomeType = incomeType;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getContactUser() {
        return contactUser;
    }

    public void setContactUser(String contactUser) {
        this.contactUser = contactUser;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getBusinessLine() {
        return businessLine;
    }

    public void setBusinessLine(String businessLine) {
        this.businessLine = businessLine;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
