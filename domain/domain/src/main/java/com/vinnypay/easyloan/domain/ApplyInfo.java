package com.vinnypay.easyloan.domain;

import java.util.Date;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: ApplyInfo, v1.0 2017/9/12 9:22 Vinny Exp $
 */
public class ApplyInfo extends LoanInfo{
    private String userId;
    private Date createDate;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
