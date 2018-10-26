package com.hongfa.app.relay.dao;

import com.hongfa.app.relay.entity.Relay;
import com.hongfa.app.relay.param.RelayRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Copyright (c) 2018,重庆扬讯软件技术股份有限公司&lt;br&gt;
 * All rights reserved.&lt;br&gt;
 * <p>
 * 描述：简要描述本文件的内容&lt;br&gt;
 *
 * @author boyqian
 * Create time 2018/10/26 10:28
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2018/10/26   boyqian       1.0      首次新增
 */
@Mapper
public interface RelayDao {

    //分页查询某类型下所有继电器信息
    List<Relay>  findRelay(RelayRequest relayRequest);
    //某类型下该继电器的总数
    int findRelayCount(RelayRequest relayRequest);
}
