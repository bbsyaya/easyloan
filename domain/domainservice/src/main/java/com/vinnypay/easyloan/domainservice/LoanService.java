package com.vinnypay.easyloan.domainservice;

import com.vinnypay.easyloan.domain.QueryPage;
import com.vinnypay.easyloan.result.ApplyResult;
import com.vinnypay.easyloan.result.BaseResult;
import com.vinnypay.easyloan.result.LoanResult;
import com.vinnypay.easyloan.result.LoanStepResult;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: LoanService, v1.0 2017/9/11 19:18 Vinny Exp $
 */
public interface LoanService extends BaseService {

    LoanResult getLoanList(QueryPage queryPage, String tag);

    ApplyResult getApplyList(QueryPage queryPage, String operationType);

    BaseResult addApply(String cloanNo, String operationType);

    LoanStepResult getLoanStepList(String cloanNo);

}
