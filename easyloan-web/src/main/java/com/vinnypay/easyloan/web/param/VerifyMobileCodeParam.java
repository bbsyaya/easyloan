package com.vinnypay.easyloan.web.param;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: VerifyMobileCodeParam, v1.0 2017/9/15 10:36 Vinny Exp $
 */
public class VerifyMobileCodeParam implements Serializable {

    @NotBlank(message = "mobileNo不能为空")
    private String mobileNo;

    @NotBlank(message = "clientType不能为空")
    private String clientType;

    @NotBlank(message = "mobileCode不能为空")
    private String mobileCode;

    @NotBlank(message = "appVersion不能为空")
    private String appVersion;

    @NotBlank(message = "sendType不能为空")
    private String sendType;

    @NotBlank(message = "businessLine不能为空")
    private String businessLine;

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getMobileCode() {
        return mobileCode;
    }

    public void setMobileCode(String mobileCode) {
        this.mobileCode = mobileCode;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getSendType() {
        return sendType;
    }

    public void setSendType(String sendType) {
        this.sendType = sendType;
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
