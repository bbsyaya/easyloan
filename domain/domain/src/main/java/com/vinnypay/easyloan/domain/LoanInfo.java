package com.vinnypay.easyloan.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.math.BigDecimal;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: LoanInfo, v1.0 2017/9/11 19:18 Vinny Exp $
 */
public class LoanInfo {
    private String id;
    private String description;
    private BigDecimal rateRangeMin;
    private int dateRangeMin;
    private String dateRange;
    private String rateRange;
    private String status;
    private String company;
    private BigDecimal dayRate;
    private int remitTime;
    private String cloanTags;
    private BigDecimal loanMin;
    private String applyCondition;
    private String cloanName;
    private String cloanNo;
    private BigDecimal monthRate;
    private BigDecimal yearRate;
    private String applyDescription;
    private int cloanOrder;
    private int dateRangeMax;
    private String h5link;
    private int applyCustomer;
    private BigDecimal loanMax;
    private String loanRange;
    private BigDecimal rateRangeMax;
    private String remark;
    private String remitUnit;
    private String cloanLogo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getRateRangeMin() {
        return rateRangeMin;
    }

    public void setRateRangeMin(BigDecimal rateRangeMin) {
        this.rateRangeMin = rateRangeMin;
    }

    public int getDateRangeMin() {
        return dateRangeMin;
    }

    public void setDateRangeMin(int dateRangeMin) {
        this.dateRangeMin = dateRangeMin;
    }

    public String getDateRange() {
        return dateRange;
    }

    public void setDateRange(String dateRange) {
        this.dateRange = dateRange;
    }

    public String getRateRange() {
        return rateRange;
    }

    public void setRateRange(String rateRange) {
        this.rateRange = rateRange;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public BigDecimal getDayRate() {
        return dayRate;
    }

    public void setDayRate(BigDecimal dayRate) {
        this.dayRate = dayRate;
    }

    public int getRemitTime() {
        return remitTime;
    }

    public void setRemitTime(int remitTime) {
        this.remitTime = remitTime;
    }

    public String getCloanTags() {
        return cloanTags;
    }

    public void setCloanTags(String cloanTags) {
        this.cloanTags = cloanTags;
    }

    public BigDecimal getLoanMin() {
        return loanMin;
    }

    public void setLoanMin(BigDecimal loanMin) {
        this.loanMin = loanMin;
    }

    public String getApplyCondition() {
        return applyCondition;
    }

    public void setApplyCondition(String applyCondition) {
        this.applyCondition = applyCondition;
    }

    public String getCloanName() {
        return cloanName;
    }

    public void setCloanName(String cloanName) {
        this.cloanName = cloanName;
    }

    public String getCloanNo() {
        return cloanNo;
    }

    public void setCloanNo(String cloanNo) {
        this.cloanNo = cloanNo;
    }

    public BigDecimal getMonthRate() {
        return monthRate;
    }

    public void setMonthRate(BigDecimal monthRate) {
        this.monthRate = monthRate;
    }

    public BigDecimal getYearRate() {
        return yearRate;
    }

    public void setYearRate(BigDecimal yearRate) {
        this.yearRate = yearRate;
    }

    public String getApplyDescription() {
        return applyDescription;
    }

    public void setApplyDescription(String applyDescription) {
        this.applyDescription = applyDescription;
    }

    public int getCloanOrder() {
        return cloanOrder;
    }

    public void setCloanOrder(int cloanOrder) {
        this.cloanOrder = cloanOrder;
    }

    public int getDateRangeMax() {
        return dateRangeMax;
    }

    public void setDateRangeMax(int dateRangeMax) {
        this.dateRangeMax = dateRangeMax;
    }

    public String getH5link() {
        return h5link;
    }

    public void setH5link(String h5link) {
        this.h5link = h5link;
    }

    public int getApplyCustomer() {
        return applyCustomer;
    }

    public void setApplyCustomer(int applyCustomer) {
        this.applyCustomer = applyCustomer;
    }

    public BigDecimal getLoanMax() {
        return loanMax;
    }

    public void setLoanMax(BigDecimal loanMax) {
        this.loanMax = loanMax;
    }

    public String getLoanRange() {
        return loanRange;
    }

    public void setLoanRange(String loanRange) {
        this.loanRange = loanRange;
    }

    public BigDecimal getRateRangeMax() {
        return rateRangeMax;
    }

    public void setRateRangeMax(BigDecimal rateRangeMax) {
        this.rateRangeMax = rateRangeMax;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemitUnit() {
        return remitUnit;
    }

    public void setRemitUnit(String remitUnit) {
        this.remitUnit = remitUnit;
    }

    public String getCloanLogo() {
        return cloanLogo;
    }

    public void setCloanLogo(String cloanLogo) {
        this.cloanLogo = cloanLogo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
