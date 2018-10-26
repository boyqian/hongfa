package com.hongfa.app.common;

/**
 * Copyright (c) 2018,重庆扬讯软件技术股份有限公司&lt;br&gt;
 * All rights reserved.&lt;br&gt;
 * <p>
 * 描述：简要描述本文件的内容&lt;br&gt;
 *
 * @author boyqian
 * Create time 2018/10/26 14:46
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2018/10/26   boyqian       1.0      首次新增
 */
public class RequestPage<T> {
    private int pageIndex;//第几页
    private int pageSize;//每页大小
    private int rowTotal;//总行数
    private int startRow;//开始行
    private int pageTotal;//总共多少页
    private T param;//参数对象实体

    public RequestPage() {
    }

    public RequestPage(int pageIndex, int pageSize, int rowTotal) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.rowTotal = rowTotal;
    }

    public int getRowTotal() {
        return this.rowTotal;
    }

    public void setRowTotal(int rowTotal) {
        this.rowTotal = rowTotal;
    }

    public int getPageIndex() {
        return this.pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageTotal() {
        boolean pageTotal = false;
        int pageTotal1;
        if (this.rowTotal % this.pageSize == 0) {
            pageTotal1 = this.rowTotal / this.pageSize;
        } else {
            pageTotal1 = this.rowTotal / this.pageSize + 1;
        }

        return pageTotal1;
    }

    public void setPageTotal(int pageTotal) {
        this.pageTotal = pageTotal;
    }

    public T getParam() {
        return this.param;
    }

    public void setParam(T param) {
        this.param = param;
    }

    public int getStartRow() {
        return this.startRow;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public ResponsePage toResponsePage() {
        ResponsePage rPage = new ResponsePage();
        rPage.setPageIndex(this.getPageIndex());
        rPage.setPageSize(this.getPageSize());
        rPage.setPageTotal(this.getPageTotal());
        rPage.setRowTotal(this.getRowTotal());
        return rPage;
    }

    public ResponsePage toResponsePage(Object data) {
        ResponsePage rPage = new ResponsePage();
        rPage.setPageIndex(this.getPageIndex());
        rPage.setPageSize(this.getPageSize());
        rPage.setPageTotal(this.getPageTotal());
        rPage.setRowTotal(this.getRowTotal());
        rPage.setData(data);
        return rPage;
    }

    public void setPage(RequestPage page) {
        this.startRow = (page.getPageIndex() - 1) * page.getPageSize();
        this.pageSize = page.getPageSize();
    }
}
