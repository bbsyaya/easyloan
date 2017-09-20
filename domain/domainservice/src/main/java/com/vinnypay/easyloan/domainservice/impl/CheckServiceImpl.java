package com.vinnypay.easyloan.domainservice.impl;

import com.vinnypay.easyloan.dataobject.AppVersionDO;
import com.vinnypay.easyloan.domain.AppVersionInfo;
import com.vinnypay.easyloan.domain.MobileCodeInfo;
import com.vinnypay.easyloan.domainservice.CheckService;
import com.vinnypay.easyloan.enums.ReturnCode;
import com.vinnypay.easyloan.mapper.AppVersionMapper;
import com.vinnypay.easyloan.result.AppVersionResult;
import com.vinnypay.easyloan.result.BaseResult;
import com.vinnypay.easyloan.result.CheckResult;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: CheckServiceImpl, v1.0 2017/9/14 14:05 Vinny Exp $
 */
@Service("checkService")
public class CheckServiceImpl implements CheckService {

    @Resource(name = "appVersionMapper")
    private AppVersionMapper appVersionMapper;

    @Override
    public CheckResult getCheckStatus() {
        CheckResult result = new CheckResult();
        result.setIosStatus("NORMAL");
        result.setSuccess(true);
        result.setResultCode(ReturnCode.SUCCESS.getCode());
        result.setReslutMessage(ReturnCode.SUCCESS.getMessage());
        return result;
    }

    @Override
    public AppVersionResult getAppVersion(String appName) {
        AppVersionResult result = new AppVersionResult();
        result.setSuccess(true);
        result.setResultCode(ReturnCode.SUCCESS.getCode());
        result.setReslutMessage(ReturnCode.SUCCESS.getMessage());

        AppVersionDO appVersionDO = appVersionMapper.selectByPrimaryKey(appName);

        if (appVersionDO != null) {
            AppVersionInfo appVersionInfo = new AppVersionInfo();
            BeanUtils.copyProperties(appVersionDO, appVersionInfo);
            result.setAppVersionInfo(appVersionInfo);
        }

        return result;
    }

    @Override
    public BaseResult getMobileCode(String sendType, String mobileNo) {
        BaseResult result = new BaseResult();
        result.setSuccess(true);
        result.setResultCode(ReturnCode.SUCCESS.getCode());
        result.setReslutMessage(ReturnCode.SUCCESS.getMessage());
        return result;
    }

    @Override
    public BaseResult verifyMobileCode(MobileCodeInfo mobileCodeInfo) {
        BaseResult result = new BaseResult();
        result.setSuccess(true);
        result.setResultCode(ReturnCode.SUCCESS.getCode());
        result.setReslutMessage(ReturnCode.SUCCESS.getMessage());
        return result;
    }
}
