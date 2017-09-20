package com.vinnypay.easyloan.domainservice;

import com.vinnypay.easyloan.domain.QueryPage;
import com.vinnypay.easyloan.result.BannerResult;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: BannerService, v1.0 2017/9/11 17:22 Vinny Exp $
 */

public interface BannerService extends BaseService{

    BannerResult getBannerList(QueryPage queryPage);

}
