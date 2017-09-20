package com.vinnypay.easyloan.result;

import com.vinnypay.easyloan.domain.LoanInfo;
import com.vinnypay.easyloan.domain.QueryPage;

import java.util.List;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: LoanResult, v1.0 2017/9/11 19:25 Vinny Exp $
 */
public class LoanResult extends BaseResult {

    private QueryPage queryPage;

    private List<LoanInfo> loanList;

    public List<LoanInfo> getLoanList() {
        return loanList;
    }

    public void setLoanList(List<LoanInfo> loanList) {
        this.loanList = loanList;
    }

    public QueryPage getQueryPage() {
        return queryPage;
    }

    public void setQueryPage(QueryPage queryPage) {
        this.queryPage = queryPage;
    }

}
