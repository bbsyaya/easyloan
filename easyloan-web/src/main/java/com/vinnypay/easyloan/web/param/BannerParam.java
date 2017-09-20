package com.vinnypay.easyloan.web.param;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: BannerParam, v1.0 2017/9/11 17:12 Vinny Exp $
 */
public class BannerParam implements Serializable {

    @NotBlank(message = "location不可为空")
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
