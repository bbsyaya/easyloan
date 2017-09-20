package com.vinnypay.easyloan.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: LoanStepInfo, v1.0 2017/9/12 11:38 Vinny Exp $
 */
public class LoanStepInfo {
    private String id;
    private String stepId;
    private String cloanNo;
    private String enStepName;
    private String stepName;
    private Date createDate;
    private String stepOrder;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStepId() {
        return stepId;
    }

    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    public String getCloanNo() {
        return cloanNo;
    }

    public void setCloanNo(String cloanNo) {
        this.cloanNo = cloanNo;
    }

    public String getEnStepName() {
        return enStepName;
    }

    public void setEnStepName(String enStepName) {
        this.enStepName = enStepName;
    }

    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getStepOrder() {
        return stepOrder;
    }

    public void setStepOrder(String stepOrder) {
        this.stepOrder = stepOrder;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
