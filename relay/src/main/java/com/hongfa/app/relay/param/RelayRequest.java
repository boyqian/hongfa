package com.hongfa.app.relay.param;

/**
 * Copyright (c) 2018,重庆扬讯软件技术股份有限公司&lt;br&gt;
 * All rights reserved.&lt;br&gt;
 * <p>
 * 描述：简要描述本文件的内容&lt;br&gt;
 *
 * @author boyqian
 * Create time 2018/10/26 11:27
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2018/10/26   boyqian       1.0      首次新增
 */
public class RelayRequest {
    private String relayTypeId;
    private String relayTypeName;
    private int limit;
    private int offset;

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

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}
