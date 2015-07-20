package com.gs.common.bean;

/**
 * Created by WangGenshen on 7/18/15.
 */
public class Pager {
    private int pageSize;
    private int pageNo;
    private int beginIndex;
    private int endIndex;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getBeginIndex() {
        return (pageNo - 1) * pageSize;
    }

    public int getEndIndex() {
        return pageNo * pageSize;
    }
}
