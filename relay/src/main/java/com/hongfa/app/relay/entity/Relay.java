package com.hongfa.app.relay.entity;

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
public class Relay {

    private String relayId;
    private String relayTypeName;//类型名称
    private String relayModel;//型号
    private String relayImg;//图片
    private String relayMaxCurrent;//最大额定切换电流
    private String relayMaxCurrentUnit;//单位
    private String relayContactFrom;//触点形式
    private String relayCoilVoltage;//线圈电压
    private String relayCoilVoltageType;//电压类型 直流交流
    private String relayLeadoutMode;//引出端方式
    private String relayLeadoutModeCode;//引出端方式代码
    private String relayMountHolemap;//安装孔位图
    public String getRelayId() {
        return relayId;
    }

    public void setRelayId(String relayId) {
        this.relayId = relayId;
    }

    public String getRelayTypeName() {
        return relayTypeName;
    }

    public void setRelayTypeName(String relayTypeName) {
        this.relayTypeName = relayTypeName;
    }

    public String getRelayModel() {
        return relayModel;
    }

    public void setRelayModel(String relayModel) {
        this.relayModel = relayModel;
    }

    public String getRelayImg() {
        return relayImg;
    }

    public void setRelayImg(String relayImg) {
        this.relayImg = relayImg;
    }

    public String getRelayMaxCurrent() {
        return relayMaxCurrent;
    }

    public void setRelayMaxCurrent(String relayMaxCurrent) {
        this.relayMaxCurrent = relayMaxCurrent;
    }

    public String getRelayMaxCurrentUnit() {
        return relayMaxCurrentUnit;
    }

    public void setRelayMaxCurrentUnit(String relayMaxCurrentUnit) {
        this.relayMaxCurrentUnit = relayMaxCurrentUnit;
    }

    public String getRelayContactFrom() {
        return relayContactFrom;
    }

    public void setRelayContactFrom(String relayContactFrom) {
        this.relayContactFrom = relayContactFrom;
    }

    public String getRelayCoilVoltage() {
        return relayCoilVoltage;
    }

    public void setRelayCoilVoltage(String relayCoilVoltage) {
        this.relayCoilVoltage = relayCoilVoltage;
    }

    public String getRelayCoilVoltageType() {
        return relayCoilVoltageType;
    }

    public void setRelayCoilVoltageType(String relayCoilVoltageType) {
        this.relayCoilVoltageType = relayCoilVoltageType;
    }

    public String getRelayLeadoutMode() {
        return relayLeadoutMode;
    }

    public void setRelayLeadoutMode(String relayLeadoutMode) {
        this.relayLeadoutMode = relayLeadoutMode;
    }

    public String getRelayLeadoutModeCode() {
        return relayLeadoutModeCode;
    }

    public void setRelayLeadoutModeCode(String relayLeadoutModeCode) {
        this.relayLeadoutModeCode = relayLeadoutModeCode;
    }

    public String getRelayMountHolemap() {
        return relayMountHolemap;
    }

    public void setRelayMountHolemap(String relayMountHolemap) {
        this.relayMountHolemap = relayMountHolemap;
    }

}
