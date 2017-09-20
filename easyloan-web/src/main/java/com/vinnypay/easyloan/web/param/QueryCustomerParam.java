package com.vinnypay.easyloan.web.param;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: QueryCustomerParam, v1.0 2017/9/14 17:55 Vinny Exp $
 */
public class QueryCustomerParam implements Serializable{

    @NotBlank(message = "clientType不能为空")
    private String clientType;

    @NotBlank(message = "sessionKey不能为空")
    private String sessionKey;

    @NotBlank(message = "appVersion不能为空")
    private String appVersion;

    @NotBlank(message = "businessLine不能为空")
    private String businessLine;

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
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
