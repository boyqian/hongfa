package com.hongfa.app.relay.service;

import com.hongfa.app.relay.dao.RelayDao;
import com.hongfa.app.relay.entity.Relay;
import com.hongfa.app.relay.param.RelayRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright (c) 2018,重庆扬讯软件技术股份有限公司&lt;br&gt;
 * All rights reserved.&lt;br&gt;
 * <p>
 * 描述：简要描述本文件的内容&lt;br&gt;
 *
 * @author boyqian
 * Create time 2018/10/26 10:29
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2018/10/26   boyqian       1.0      首次新增
 */
@Service
public class RelayService {

    @Autowired
    private RelayDao relayDao;

    public List<Relay> findRelay(RelayRequest relayRequest){
        return relayDao.findRelay(relayRequest);
    }
    public int findRelayCount(RelayRequest relayRequest){
        return relayDao.findRelayCount(relayRequest);
    }
}
