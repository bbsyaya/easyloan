package com.vinnypay.easyloan.result;

import com.vinnypay.easyloan.domain.ApplyInfo;
import com.vinnypay.easyloan.domain.QueryPage;

import java.util.List;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: ApplyResult, v1.0 2017/9/12 9:40 Vinny Exp $
 */
public class ApplyResult extends BaseResult {

    private QueryPage queryPage;

    private List<ApplyInfo> applyList;

    public QueryPage getQueryPage() {
        return queryPage;
    }

    public void setQueryPage(QueryPage queryPage) {
        this.queryPage = queryPage;
    }

    public List<ApplyInfo> getApplyList() {
        return applyList;
    }

    public void setApplyList(List<ApplyInfo> applyList) {
        this.applyList = applyList;
    }
}
