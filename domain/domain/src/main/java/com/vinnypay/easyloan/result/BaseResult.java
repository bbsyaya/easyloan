package com.vinnypay.easyloan.result;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * <p>统一返回结果基类</p>
 *
 * @author Vinny
 * @version $Id: BaseResult, v1.0 2017/7/17 16:41 Vinny Exp $
 */
public class BaseResult implements Serializable {
    /**
     * 是否成功
     */
    protected boolean success = false;
    /**
     * 错误编码
     */
    protected String resultCode;
    /**
     * 结果返回信息
     */
    protected String reslutMessage;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getReslutMessage() {
        return reslutMessage;
    }

    public void setReslutMessage(String reslutMessage) {
        this.reslutMessage = reslutMessage;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
