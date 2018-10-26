package com.hongfa.app.common;

import java.io.Serializable;

/**
 * Copyright (c) 2018,重庆扬讯软件技术股份有限公司&lt;br&gt;
 * All rights reserved.&lt;br&gt;
 * <p>
 * 描述：code表示返回的状态，msg表示返回的消息字段，data表示返回的数据字段
 *
 * @author boyqian
 * Create time 2018/10/26 14:00
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2018/10/26   boyqian       1.0      首次新增
 */
public class BaseRes{
    private String code;
    private String msg;
    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
