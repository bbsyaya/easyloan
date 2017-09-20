package com.vinnypay.easyloan.web.param;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: PageParam, v1.0 2017/7/22 18:53 Vinny Exp $
 */
public class PageParam implements Serializable{
    /**
     * 当前页
     */
    @NotBlank(message = "当前页不可空")
    private String currentPage;
    /**
     * 一页展示多少条
     */
    @NotBlank(message = "页面大小不可空")
    private String pageSize;
    /**
     * 总记录
     */
    private int totalCount;

    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
