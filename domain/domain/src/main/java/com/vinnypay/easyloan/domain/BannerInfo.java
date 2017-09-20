package com.vinnypay.easyloan.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * <p>合作机构信息实体</p>
 *
 * @author Vinny
 * @version $Id: BannerInfo, v1.0 2017/9/11 17:06 Vinny Exp $
 */
public class BannerInfo {
    private String bannerState;
    private String linkUrl;
    private String bannerUrl;
    private String bannerName;
    private String bannerId;

    public String getBannerState() {
        return bannerState;
    }

    public void setBannerState(String bannerState) {
        this.bannerState = bannerState;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public String getBannerName() {
        return bannerName;
    }

    public void setBannerName(String bannerName) {
        this.bannerName = bannerName;
    }

    public String getBannerId() {
        return bannerId;
    }

    public void setBannerId(String bannerId) {
        this.bannerId = bannerId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
