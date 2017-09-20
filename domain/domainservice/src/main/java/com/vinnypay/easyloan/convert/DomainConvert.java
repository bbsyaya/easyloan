package com.vinnypay.easyloan.convert;

import com.vinnypay.easyloan.dataobject.BannerDO;
import com.vinnypay.easyloan.dataobject.LoanInfoDO;
import com.vinnypay.easyloan.domain.BannerInfo;
import com.vinnypay.easyloan.domain.LoanInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: DOConvert, v1.0 2017/9/16 19:06 Vinny Exp $
 */
public class DomainConvert {

    public static List<LoanInfo> convertToLoanInfoList(List<LoanInfoDO> loanInfoDOS) {
        if (CollectionUtils.isEmpty(loanInfoDOS)) {
            return null;
        }
        List<LoanInfo> loanInfos = new ArrayList<>();
        LoanInfo loanInfo;
        for (LoanInfoDO loanInfoDO : loanInfoDOS) {
            loanInfo = new LoanInfo();
            BeanUtils.copyProperties(loanInfoDO, loanInfo);
            loanInfos.add(loanInfo);
        }

        return loanInfos;

    }

    public static List<BannerInfo> convertToBannerInfoList(List<BannerDO> bannerDOS) {
        if (CollectionUtils.isEmpty(bannerDOS)) {
            return null;
        }
        List<BannerInfo> bannerInfos = new ArrayList<>();
        BannerInfo bannerInfo;
        for (BannerDO bannerDO : bannerDOS) {
            bannerInfo = new BannerInfo();
            BeanUtils.copyProperties(bannerDO, bannerInfo);
            bannerInfos.add(bannerInfo);
        }

        return bannerInfos;

    }

}
