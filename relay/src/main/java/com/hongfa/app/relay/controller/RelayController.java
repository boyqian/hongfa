package com.hongfa.app.relay.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.hongfa.app.common.BaseRes;
import com.hongfa.app.common.RequestPage;
import com.hongfa.app.common.ResponsePage;
import com.hongfa.app.relay.entity.Relay;
import com.hongfa.app.relay.param.RelayRequest;
import com.hongfa.app.relay.service.RelayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Copyright (c) 2018,重庆扬讯软件技术股份有限公司&lt;br&gt;
 * All rights reserved.&lt;br&gt;
 * <p>
 * 描述：简要描述本文件的内容&lt;br&gt;
 *
 * @author boyqian
 * Create time 2018/10/26 10:27
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2018/10/26   boyqian       1.0      首次新增
 */
@Controller
public class RelayController {

    private  static  final Logger log=LoggerFactory.getLogger(RelayController.class);
    @Autowired
    private RelayService relayService;

    @RequestMapping("/findRelay")
    @ResponseBody
    public BaseRes findRelay(RequestPage<RelayRequest> requestPage){
        BaseRes baseRes=new BaseRes();
        ResponsePage<List<Relay>> responsePage=new ResponsePage<List<Relay>>();
        RelayRequest relayRequest=new RelayRequest();
        try{
            if(null!=requestPage.getParam()&&requestPage.getParam()+""!=""){
                String p=requestPage.getParam()+"";
                System.out.println(p);
                relayRequest= JSON.parseObject(p, new TypeReference<RelayRequest>(){});
            }
            relayRequest.setLimit(requestPage.getPageSize());
            relayRequest.setOffset((requestPage.getPageIndex()-1)*requestPage.getPageSize());
            List<Relay> list=relayService.findRelay(relayRequest);
            int total=relayService.findRelayCount(relayRequest);
            requestPage.setRowTotal(total);
            if(list!=null){
                responsePage=requestPage.toResponsePage();
                responsePage.setData(list);
                baseRes.setCode("0");
                baseRes.setMsg("返回成功");
                baseRes.setData(responsePage);
            }
        }catch (Exception e){
            log.error("查询失败",e);
            baseRes.setCode("-1");
            baseRes.setMsg("返回失败");
            baseRes.setData(null);
        }
        return baseRes;
    }
}
