package com.hongfa.app.relay.entity;

/**
 * Copyright (c) 2018,重庆扬讯软件技术股份有限公司&lt;br&gt;
 * All rights reserved.&lt;br&gt;
 * <p>
 * 描述：简要描述本文件的内容&lt;br&gt;
 *
 * @author boyqian
 * Create time 2018/10/26 11:15
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2018/10/26   boyqian       1.0      首次新增
 */
public class RelayType {

    private String relayTypeId;
    private String relayTypeName;//类型名称
    private String relayTypeParent;//父类型ID
    public String getRelayTypeId() {
        return relayTypeId;
    }

    public void setRelayTypeId(String relayTypeId) {
        this.relayTypeId = relayTypeId;
    }

    public String getRelayTypeName() {
        return relayTypeName;
    }

    public void setRelayTypeName(String relayTypeName) {
        this.relayTypeName = relayTypeName;
    }

    public String getRelayTypeParent() {
        return relayTypeParent;
    }

    public void setRelayTypeParent(String relayTypeParent) {
        this.relayTypeParent = relayTypeParent;
    }

}
