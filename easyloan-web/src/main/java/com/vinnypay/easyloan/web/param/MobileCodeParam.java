package com.vinnypay.easyloan.web.param;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: RegisterParam, v1.0 2017/9/14 17:07 Vinny Exp $
 */
public class MobileCodeParam implements Serializable {

    @NotBlank(message = "mobileNo不可为空")
    private String mobileNo;

    @NotBlank(message = "newPwd不可为空")
    private String newPwd;

    @NotBlank(message = "mobileCode不可为空")
    private String mobileCode;

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getNewPwd() {
        return newPwd;
    }

    public void setNewPwd(String newPwd) {
        this.newPwd = newPwd;
    }

    public String getMobileCode() {
        return mobileCode;
    }

    public void setMobileCode(String mobileCode) {
        this.mobileCode = mobileCode;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
