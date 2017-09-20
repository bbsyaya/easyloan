package com.vinnypay.easyloan.domain;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * <p></p>
 *
 * @author Vinny
 * @version $Id: QueryPage, v1.0 2017/9/11 19:28 Vinny Exp $
 */
public class QueryPage {
    /**
     * 当前页
     */
    private int currentPage = 1;
    /**
     * 页面大小
     */
    private int pageSize = 10;
    /**
     * 总记录数
     */
    private int totalCount;
    /**
     * 开始行
     */
    private int beginRow;
    /**
     * 结束行
     */
    private int endRow;

    private int totalPage;

    public int getTotalPage() {
        if (totalCount % pageSize == 0) {
            totalPage = totalCount / pageSize;
        } else {
            totalPage = totalCount / pageSize + 1;
        }
        return totalPage;
    }

    public int getBeginRow() {
        return (currentPage - 1) * pageSize;
    }

    public int getEndRow() {
        return currentPage * pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
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
