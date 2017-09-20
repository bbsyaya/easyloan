package com.vinnypay.easyloan.enums;

import org.apache.commons.lang.StringUtils;

/**
 * <p>返回前台信息代码</p>
 *
 * @author Vinny
 * @version $Id: ReturnCode, v1.0 2017/7/19 16:51 Vinny Exp $
 */
public enum ReturnCode {

    SUCCESS("S0001", "处理成功"),
    ILLEGAL_ARGUMENT("F2002", "参数不合法"),
    FAIL("F9999", "操作失败"),
    SYSTEM_ERROR("E9999", "系统繁忙,请稍候再试");

    private String code;
    private String message;

    ReturnCode(String code,String message){
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static ReturnCode getByCode(String code){
        if(StringUtils.isBlank(code)){
            return null;
        }
        for(ReturnCode item : values()){
            if(item.getCode().equals(code)){
                return item;
            }
        }
        return null;
    }
}
