package com.examplebi.appconfig.configinfo.bean;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.examplebi.appconfig.configinfo.ConfigValue;
import com.examplebi.appconfig.configinfo.bean.view.ConfigValueTreeVO;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月30日 23:36:53
 * @version: V1
 * @Description: 配置信息
 */
public class ConfigInfo {
    /**
     * 主键编号
     */
    private String cBh;
    /**
     * 系统编号
     */
    private String cBhSystem;
    /**
     *系统名称
     */
    private  String cMcSystem;
    /**
     * 子系统编号
     */
    private String cXtbh;
    /**
     * 子系统名称
     */
    private  String cMcApp;
    /**
     * 分组编号
     */
    private String cFzbh;
    /**
     * 分组名称
     */
    private String cFzmc;
    /**
     * 配置名称
     */
    private String cMc;
    /**
     * 配置关键字
     */
    private String cKey;
    /**
     * 默认值
     */
    private String cMrz;
    /**
     * 单值/多值代码，翻译名称
     */
    private String cMrzMc;
    /**
     * 配置信息分组共享范围
     */
    private String cGroupScope;
    /**
     * 说明
     */
    private String cSm;
    /**
     * 是否可维护，数字，1是2否
     */
    private Integer nWh;
    /**
     * 是否有效，数字，1是2否
     */
    private Integer nYx;
    /**
     * 显示类型，数字，0字符串、1是否、2单值代码、3多值代码
     */
    private Integer nXslx;
    /**
     * 修改时间
     */
    private Timestamp dXgsj;
    /**
     * 分组内显示顺序
     */
    private Integer nXssx;
    /**
     * 范围，global：全局、system：系统、app：子系统
     */
    private String cScope;
    /**
     * 涉及系统
     */
    private String cSjxt;
    /**
     * 原始需求
     */
    private String cXq;
    /**
     * 功能影响
     */
    private String cGnyx;
    /**
     * 配置代码
     */
    private String cPzdm;
    /**
     * 提出地区
     */
    private String cDq;

    /**
     * 提出地区
     */
    private String cParent;
    /**
     * 代码值和代码类型
     */
    private List<ConfigCode> configCodeSet;

    /**
     * 配置值
     */
    private List<ConfigValue> values;
    /**
     * 组织机构单位值
     */
    private ConfigValueTreeVO corpValues;

    public ConfigInfo() {
    }

    public ConfigInfo(String cBh, String cBhSystem, String cXtbh, String cFzbh, String cFzmc, String cMc, String cKey, String cMrz, String cSm, Integer nWh, Integer nYx, Integer nXslx, Timestamp dXgsj, Integer nXssx, String cScope, String cSjxt, String cXq, String cGnyx, String cPzdm, String cDq, String cParent) {
        this.cBh = cBh;
        this.cBhSystem = cBhSystem;
        this.cXtbh = cXtbh;
        this.cFzbh = cFzbh;
        this.cFzmc = cFzmc;
        this.cMc = cMc;
        this.cKey = cKey;
        this.cMrz = cMrz;
        this.cSm = cSm;
        this.nWh = nWh;
        this.nYx = nYx;
        this.nXslx = nXslx;
        this.dXgsj = dXgsj;
        this.nXssx = nXssx;
        this.cScope = cScope;
        this.cSjxt = cSjxt;
        this.cXq = cXq;
        this.cGnyx = cGnyx;
        this.cPzdm = cPzdm;
        this.cDq = cDq;
        this.cParent = cParent;
    }

    public String getcParent() {
        return cParent;
    }

    public void setcParent(String cParent) {
        this.cParent = cParent;
    }

    public String getcBh() {
        return cBh;
    }

    public void setcBh(String cBh) {
        this.cBh = cBh;
    }

    public String getcBhSystem() {
        return cBhSystem;
    }

    public void setcBhSystem(String cBhSystem) {
        this.cBhSystem = cBhSystem;
    }

    public String getcXtbh() {
        return cXtbh;
    }

    public void setcXtbh(String cXtbh) {
        this.cXtbh = cXtbh;
    }

    public String getcFzbh() {
        return cFzbh;
    }

    public void setcFzbh(String cFzbh) {
        this.cFzbh = cFzbh;
    }

    public String getcFzmc() {
        return cFzmc;
    }

    public void setcFzmc(String cFzmc) {
        this.cFzmc = cFzmc;
    }

    public String getcMc() {
        return cMc;
    }

    public void setcMc(String cMc) {
        this.cMc = cMc;
    }

    public String getcKey() {
        return cKey;
    }

    public void setcKey(String cKey) {
        this.cKey = cKey;
    }

    public String getcMrz() {
        return cMrz;
    }

    public void setcMrz(String cMrz) {
        this.cMrz = cMrz;
    }

    public String getcSm() {
        return cSm;
    }

    public void setcSm(String cSm) {
        this.cSm = cSm;
    }

    public Integer getnWh() {
        return nWh;
    }

    public void setnWh(Integer nWh) {
        this.nWh = nWh;
    }

    public Integer getnYx() {
        return nYx;
    }

    public void setnYx(Integer nYx) {
        this.nYx = nYx;
    }

    public Integer getnXslx() {
        return nXslx;
    }

    public Timestamp getdXgsj() {
        return dXgsj;
    }

    public void setdXgsj(Timestamp dXgsj) {
        this.dXgsj = dXgsj;
    }

    public void setnXslx(Integer nXslx) {
        this.nXslx = nXslx;
    }

    public Integer getnXssx() {
        return nXssx;
    }

    public void setnXssx(Integer nXssx) {
        this.nXssx = nXssx;
    }

    public String getcScope() {
        return cScope;
    }

    public void setcScope(String cScope) {
        this.cScope = cScope;
    }

    public String getcSjxt() {
        return cSjxt;
    }

    public void setcSjxt(String cSjxt) {
        this.cSjxt = cSjxt;
    }

    public String getcXq() {
        return cXq;
    }

    public void setcXq(String cXq) {
        this.cXq = cXq;
    }

    public String getcGnyx() {
        return cGnyx;
    }

    public void setcGnyx(String cGnyx) {
        this.cGnyx = cGnyx;
    }

    public String getcPzdm() {
        return cPzdm;
    }

    public void setcPzdm(String cPzdm) {
        this.cPzdm = cPzdm;
    }

    public String getcDq() {
        return cDq;
    }

    public void setcDq(String cDq) {
        this.cDq = cDq;
    }

    public List<ConfigCode> getConfigCodeSet() {
        return configCodeSet;
    }

    public void setConfigCodeSet(List<ConfigCode> configCodeSet) {
        this.configCodeSet = configCodeSet;
    }

    public List<ConfigValue> getValues() {
        return values;
    }

    public void setValues(List<ConfigValue> values) {
        this.values = values;
    }

    public String getcMcSystem() {
        return cMcSystem;
    }

    public void setcMcSystem(String cMcSystem) {
        this.cMcSystem = cMcSystem;
    }

    public String getcMcApp() {
        return cMcApp;
    }

    public void setcMcApp(String cMcApp) {
        this.cMcApp = cMcApp;
    }

    public String getcMrzMc() {
        return cMrzMc;
    }

    public void setcMrzMc(String cMrzMc) {
        this.cMrzMc = cMrzMc;
    }

    public String getcGroupScope() {
        return cGroupScope;
    }

    public void setcGroupScope(String cGroupScope) {
        this.cGroupScope = cGroupScope;
    }

    public ConfigValueTreeVO getCorpValues() {
        return corpValues;
    }

    public void setCorpValues(ConfigValueTreeVO corpValues) {
        this.corpValues = corpValues;
    }

    /**
     * 导入xml时构建配置代码 用到的
     */
    public void addConfigCode(ConfigCode dm) {
        if (null == configCodeSet) {
            configCodeSet = new ArrayList<>();
        }
        configCodeSet.add(dm);
    }
}