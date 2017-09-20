package com.vinnypay.easyloan.result;

import com.vinnypay.easyloan.domain.CustomerInfo;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: CustomerResult, v1.0 2017/9/12 13:00 Vinny Exp $
 */
public class CustomerResult extends BaseResult{
    private CustomerInfo customerInfo;

    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }
}
