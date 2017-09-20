package com.vinnypay.easyloan.enums;

import org.apache.commons.lang.StringUtils;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: Status, v1.0 2017/9/20 13:57 Vinny Exp $
 */
public enum  Status {

    USABLE("1", "可用的"),
    UNUSABLE("0", "不可用的");

    private String code;
    private String message;

    Status(String code,String message){
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static Status getByCode(String code){
        if(StringUtils.isBlank(code)){
            return null;
        }
        for(Status item : values()){
            if(item.getCode().equals(code)){
                return item;
            }
        }
        return null;
    }
}
