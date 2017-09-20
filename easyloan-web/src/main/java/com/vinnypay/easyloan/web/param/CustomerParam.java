package com.vinnypay.easyloan.web.param;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: CustomerParam, v1.0 2017/9/14 16:43 Vinny Exp $
 */
public class CustomerParam implements Serializable {

    @NotBlank(message = "userId不可为空")
    private String userId;

    @NotBlank(message = "userName不可为空")
    private String userName;

    @NotBlank(message = "idcard不可为空")
    private String idcard;

    @NotBlank(message = "income不可为空")
    private String income;

    @NotBlank(message = "hasCreditCard不可为空")
    private String hasCreditCard;

    @NotBlank(message = "job不可为空")
    private String job;

    @NotBlank(message = "education不可为空")
    private String education;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getHasCreditCard() {
        return hasCreditCard;
    }

    public void setHasCreditCard(String hasCreditCard) {
        this.hasCreditCard = hasCreditCard;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
