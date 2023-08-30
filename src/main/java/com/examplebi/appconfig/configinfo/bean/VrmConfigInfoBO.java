package com.examplebi.appconfig.configinfo.bean;

import java.util.List;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月30日 23:46:33
 * @version:
 * @Description:
 */
public class VrmConfigInfoBO {
    /**
     * 配置信息编号
     */
    private String cbh;
    /**
     * 系统编号
     */
    private String cbhsystem;
    /**
     * 子系统标识
     */
    private String cxtbs;
    /**
     * 子系统编号
     */
    private String cxtbh;
    /**
     * 分组编号
     */
    private String cfzbh;
    /**
     * 分组名称
     */
    private String cfzmc;
    /**
     * 配置名称
     */
    private String cmc;
    /**
     * 配置关键字
     */
    private String ckey;
    /**
     * 默认值
     */
    private String cmrz;
    /**
     * 说明
     */
    private String csm;
    /**
     * 提出地区
     */
    private String cdq;
    /**
     * 是否可维护，数字，1是2否
     */
    private String nwh;
    /**
     * 是否有效，数字，1是2否
     */
    private String nyx;
    /**
     * 显示类型，数字，0字符串、1是否、2单值代码、3多值代码
     */
    private String nxslx;
    /**
     * 涉及子系统
     */
    private String csjxt;
    /**
     * 需求
     */
    private String cxq;
    /**
     * 影响力
     */
    private String cgnyx;
    /**
     * 范围，global：全局、system：系统、app：子系统
     */
    private String cscope;
    /**
     * 配置代码
     */
    private String cpzdm;
    /**
     * 代码值和代码类型
     */
    private List<ConfigCode> configCodeSet;

    public VrmConfigInfoBO() {
    }

    public VrmConfigInfoBO(String cbh, String cbhsystem, String cxtbs, String cxtbh, String cfzbh, String cfzmc, String cmc,
                           String ckey, String cmrz, String csm, String cdq, String nwh, String nyx, String nxslx,
                           String csjxt, String cxq, String cgnyx, String cscope,String cpzdm) {
        this.cbh = cbh;
        this.cbhsystem = cbhsystem;
        this.cxtbs = cxtbs;
        this.cxtbh = cxtbh;
        this.cfzbh = cfzbh;
        this.cfzmc = cfzmc;
        this.cmc = cmc;
        this.ckey = ckey;
        this.cmrz = cmrz;
        this.csm = csm;
        this.cdq = cdq;
        this.nwh = nwh;
        this.nyx = nyx;
        this.nxslx = nxslx;
        this.csjxt = csjxt;
        this.cxq = cxq;
        this.cgnyx = cgnyx;
        this.cscope = cscope;
        this.cpzdm = cpzdm;
    }

    public String getCbh() {
        return cbh;
    }

    public void setCbh(String cbh) {
        this.cbh = cbh;
    }

    public String getCbhsystem() {
        return cbhsystem;
    }

    public void setCbhsystem(String cbhsystem) {
        this.cbhsystem = cbhsystem;
    }

    public String getCxtbs() {
        return cxtbs;
    }

    public void setCxtbs(String cxtbs) {
        this.cxtbs = cxtbs;
    }

    public String getCxtbh() {
        return cxtbh;
    }

    public void setCxtbh(String cxtbh) {
        this.cxtbh = cxtbh;
    }

    public String getCfzbh() {
        return cfzbh;
    }

    public void setCfzbh(String cfzbh) {
        this.cfzbh = cfzbh;
    }

    public String getCfzmc() {
        return cfzmc;
    }

    public void setCfzmc(String cfzmc) {
        this.cfzmc = cfzmc;
    }

    public String getCmc() {
        return cmc;
    }

    public void setCmc(String cmc) {
        this.cmc = cmc;
    }

    public String getCkey() {
        return ckey;
    }

    public void setCkey(String ckey) {
        this.ckey = ckey;
    }

    public String getCmrz() {
        return cmrz;
    }

    public void setCmrz(String cmrz) {
        this.cmrz = cmrz;
    }

    public String getCsm() {
        return csm;
    }

    public void setCsm(String csm) {
        this.csm = csm;
    }

    public String getCdq() {
        return cdq;
    }

    public void setCdq(String cdq) {
        this.cdq = cdq;
    }

    public String getNwh() {
        return nwh;
    }

    public void setNwh(String nwh) {
        this.nwh = nwh;
    }

    public String getNyx() {
        return nyx;
    }

    public void setNyx(String nyx) {
        this.nyx = nyx;
    }

    public String getNxslx() {
        return nxslx;
    }

    public void setNxslx(String nxslx) {
        this.nxslx = nxslx;
    }

    public String getCsjxt() {
        return csjxt;
    }

    public void setCsjxt(String csjxt) {
        this.csjxt = csjxt;
    }

    public String getCxq() {
        return cxq;
    }

    public void setCxq(String cxq) {
        this.cxq = cxq;
    }

    public String getCgnyx() {
        return cgnyx;
    }

    public void setCgnyx(String cgnyx) {
        this.cgnyx = cgnyx;
    }

    public String getCscope() {
        return cscope;
    }

    public void setCscope(String cscope) {
        this.cscope = cscope;
    }

    public String getCpzdm() {
        return cpzdm;
    }

    public void setCpzdm(String cpzdm) {
        this.cpzdm = cpzdm;
    }

    public List<ConfigCode> getConfigCodeSet() {
        return configCodeSet;
    }

    public void setConfigCodeSet(List<ConfigCode> configCodeSet) {
        this.configCodeSet = configCodeSet;
    }

    @Override
    public String toString() {
        return "VrmConfigInfoBO{" +
                "cbh='" + cbh + '\'' +
                ", cbhsystem='" + cbhsystem + '\'' +
                ", cxtbs='" + cxtbs + '\'' +
                ", cxtbh='" + cxtbh + '\'' +
                ", cfzbh='" + cfzbh + '\'' +
                ", cfzmc='" + cfzmc + '\'' +
                ", cmc='" + cmc + '\'' +
                ", ckey='" + ckey + '\'' +
                ", cmrz='" + cmrz + '\'' +
                ", csm='" + csm + '\'' +
                ", cdq='" + cdq + '\'' +
                ", nwh='" + nwh + '\'' +
                ", nyx='" + nyx + '\'' +
                ", nxslx='" + nxslx + '\'' +
                ", csjxt='" + csjxt + '\'' +
                ", cxq='" + cxq + '\'' +
                ", cgnyx='" + cgnyx + '\'' +
                ", cscope='" + cscope + '\'' +
                ", cpzdm='" + cpzdm + '\'' +
                ", configCodeSet=" + configCodeSet +
                '}';
    }
}