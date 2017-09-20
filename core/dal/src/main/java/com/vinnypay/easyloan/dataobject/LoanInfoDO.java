package com.vinnypay.easyloan.dataobject;

import java.math.BigDecimal;

public class LoanInfoDO {
    private String cloanNo;

    private String cloanName;

    private String description;

    private BigDecimal rateRangeMin;

    private Integer dateRangeMin;

    private String dateRange;

    private String rateRange;

    private String status;

    private String company;

    private BigDecimal dayRate;

    private Integer remitTime;

    private String cloanTags;

    private BigDecimal loanMin;

    private String applyCondition;

    private BigDecimal monthRate;

    private BigDecimal yearRate;

    private String applyDescription;

    private Integer cloanOrder;

    private Integer dateRangeMax;

    private String h5link;

    private Integer applyCustomer;

    private BigDecimal loanMax;

    private String loanRange;

    private BigDecimal rateRangeMax;

    private String remark;

    private String remitUnit;

    private String cloanLogo;

    private Integer showLevel;

    public Integer getShowLevel() {
        return showLevel;
    }

    public void setShowLevel(Integer showLevel) {
        this.showLevel = showLevel;
    }

    public String getCloanNo() {
        return cloanNo;
    }

    public void setCloanNo(String cloanNo) {
        this.cloanNo = cloanNo == null ? null : cloanNo.trim();
    }

    public String getCloanName() {
        return cloanName;
    }

    public void setCloanName(String cloanName) {
        this.cloanName = cloanName == null ? null : cloanName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public BigDecimal getRateRangeMin() {
        return rateRangeMin;
    }

    public void setRateRangeMin(BigDecimal rateRangeMin) {
        this.rateRangeMin = rateRangeMin;
    }

    public Integer getDateRangeMin() {
        return dateRangeMin;
    }

    public void setDateRangeMin(Integer dateRangeMin) {
        this.dateRangeMin = dateRangeMin;
    }

    public String getDateRange() {
        return dateRange;
    }

    public void setDateRange(String dateRange) {
        this.dateRange = dateRange == null ? null : dateRange.trim();
    }

    public String getRateRange() {
        return rateRange;
    }

    public void setRateRange(String rateRange) {
        this.rateRange = rateRange == null ? null : rateRange.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public BigDecimal getDayRate() {
        return dayRate;
    }

    public void setDayRate(BigDecimal dayRate) {
        this.dayRate = dayRate;
    }

    public Integer getRemitTime() {
        return remitTime;
    }

    public void setRemitTime(Integer remitTime) {
        this.remitTime = remitTime;
    }

    public String getCloanTags() {
        return cloanTags;
    }

    public void setCloanTags(String cloanTags) {
        this.cloanTags = cloanTags == null ? null : cloanTags.trim();
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
        this.applyCondition = applyCondition == null ? null : applyCondition.trim();
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
        this.applyDescription = applyDescription == null ? null : applyDescription.trim();
    }

    public Integer getCloanOrder() {
        return cloanOrder;
    }

    public void setCloanOrder(Integer cloanOrder) {
        this.cloanOrder = cloanOrder;
    }

    public Integer getDateRangeMax() {
        return dateRangeMax;
    }

    public void setDateRangeMax(Integer dateRangeMax) {
        this.dateRangeMax = dateRangeMax;
    }

    public String getH5link() {
        return h5link;
    }

    public void setH5link(String h5link) {
        this.h5link = h5link == null ? null : h5link.trim();
    }

    public Integer getApplyCustomer() {
        return applyCustomer;
    }

    public void setApplyCustomer(Integer applyCustomer) {
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
        this.loanRange = loanRange == null ? null : loanRange.trim();
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
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRemitUnit() {
        return remitUnit;
    }

    public void setRemitUnit(String remitUnit) {
        this.remitUnit = remitUnit == null ? null : remitUnit.trim();
    }

    public String getCloanLogo() {
        return cloanLogo;
    }

    public void setCloanLogo(String cloanLogo) {
        this.cloanLogo = cloanLogo == null ? null : cloanLogo.trim();
    }
}