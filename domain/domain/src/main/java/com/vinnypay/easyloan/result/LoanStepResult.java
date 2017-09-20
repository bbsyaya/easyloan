package com.vinnypay.easyloan.result;

import com.vinnypay.easyloan.domain.LoanStepInfo;

import java.util.List;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: LoanStepResult, v1.0 2017/9/12 11:40 Vinny Exp $
 */
public class LoanStepResult extends BaseResult{

    private List<LoanStepInfo> loanStepList;

    public List<LoanStepInfo> getLoanStepList() {
        return loanStepList;
    }

    public void setLoanStepList(List<LoanStepInfo> loanStepList) {
        this.loanStepList = loanStepList;
    }
}
