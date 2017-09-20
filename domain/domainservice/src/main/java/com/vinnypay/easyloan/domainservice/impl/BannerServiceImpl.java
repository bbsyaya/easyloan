package com.vinnypay.easyloan.domainservice.impl;

import com.vinnypay.easyloan.convert.DomainConvert;
import com.vinnypay.easyloan.dataobject.BannerDO;
import com.vinnypay.easyloan.domain.BannerInfo;
import com.vinnypay.easyloan.domain.QueryPage;
import com.vinnypay.easyloan.enums.ReturnCode;
import com.vinnypay.easyloan.enums.Status;
import com.vinnypay.easyloan.mapper.BannerMapper;
import com.vinnypay.easyloan.result.BannerResult;
import com.vinnypay.easyloan.domainservice.BannerService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: BannerServiceImpl, v1.0 2017/9/11 17:23 Vinny Exp $
 */
@Service("bannerService")
public class BannerServiceImpl implements BannerService {

    @Resource(name = "bannerMapper")
    private BannerMapper bannerMapper;

    @Override
    public BannerResult getBannerList(QueryPage queryPage) {
        BannerResult result = new BannerResult();
        result.setSuccess(true);
        result.setResultCode(ReturnCode.SUCCESS.getCode());
        result.setReslutMessage(ReturnCode.SUCCESS.getMessage());

        int bannerCount = bannerMapper.count(Status.USABLE.getCode());
        if (bannerCount > 0) {
            List<BannerDO> bannerDOS = bannerMapper.selectBannerList(queryPage, Status.USABLE.getCode());
            result.setBannerList(DomainConvert.convertToBannerInfoList(bannerDOS));
        }
        queryPage.setTotalCount(bannerCount);
        result.setQueryPage(queryPage);

        return result;
    }
}
