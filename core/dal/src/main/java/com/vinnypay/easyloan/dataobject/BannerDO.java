package com.vinnypay.easyloan.dataobject;

public class BannerDO {
    private String bannerId;

    private String bannerName;

    private String bannerUrl;

    private String linkUrl;

    private String bannerState;

    private Integer showLevel;

    public String getBannerId() {
        return bannerId;
    }

    public void setBannerId(String bannerId) {
        this.bannerId = bannerId == null ? null : bannerId.trim();
    }

    public String getBannerName() {
        return bannerName;
    }

    public void setBannerName(String bannerName) {
        this.bannerName = bannerName == null ? null : bannerName.trim();
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl == null ? null : bannerUrl.trim();
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
    }

    public String getBannerState() {
        return bannerState;
    }

    public void setBannerState(String bannerState) {
        this.bannerState = bannerState == null ? null : bannerState.trim();
    }

    public Integer getShowLevel() {
        return showLevel;
    }

    public void setShowLevel(Integer showLevel) {
        this.showLevel = showLevel;
    }
}