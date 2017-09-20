package com.vinnypay.easyloan.domainservice;

import com.vinnypay.easyloan.domain.MobileCodeInfo;
import com.vinnypay.easyloan.result.AppVersionResult;
import com.vinnypay.easyloan.result.BaseResult;
import com.vinnypay.easyloan.result.CheckResult;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: CheckService, v1.0 2017/9/14 14:05 Vinny Exp $
 */
public interface CheckService {

    CheckResult getCheckStatus();

    AppVersionResult getAppVersion(String appName);

    BaseResult getMobileCode(String sendType, String mobileNo);

    BaseResult verifyMobileCode(MobileCodeInfo mobileCodeInfo);

}
