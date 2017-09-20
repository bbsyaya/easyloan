package com.vinnypay.easyloan.result;

import com.vinnypay.easyloan.domain.AppVersionInfo;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: AppVersionResult, v1.0 2017/9/19 21:52 Vinny Exp $
 */
public class AppVersionResult extends BaseResult {

    private AppVersionInfo appVersionInfo;

    public AppVersionInfo getAppVersionInfo() {
        return appVersionInfo;
    }

    public void setAppVersionInfo(AppVersionInfo appVersionInfo) {
        this.appVersionInfo = appVersionInfo;
    }
}
