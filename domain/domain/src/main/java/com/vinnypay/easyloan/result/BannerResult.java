package com.vinnypay.easyloan.result;

import com.vinnypay.easyloan.domain.BannerInfo;
import com.vinnypay.easyloan.domain.QueryPage;

import java.util.List;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: BannerResult, v1.0 2017/9/11 17:27 Vinny Exp $
 */
public class BannerResult extends BaseResult {

    private QueryPage queryPage;

    private List<BannerInfo> bannerList;

    public List<BannerInfo> getBannerList() {
        return bannerList;
    }

    public QueryPage getQueryPage() {
        return queryPage;
    }

    public void setQueryPage(QueryPage queryPage) {
        this.queryPage = queryPage;
    }

    public void setBannerList(List<BannerInfo> bannerList) {
        this.bannerList = bannerList;
    }

}
