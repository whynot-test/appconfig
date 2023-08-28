package com.examplebi.appconfig.configinfo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName ConfigInfoPage
 * @Description 分页查询数据机构类
 * @Author bijunjian
 * @Date 2023/8/28 0028 15:58
 * @Version 1.0
 **/
public class ConfigInfoPage {

    /**
     * 配置信息主键
     */
    private String cBh;

    /**
     * 所属系统主键
     */
    private String cBySystem;

    /**
     * 所属子系统
     */
    private String cXtbh;

    /**
     * 分组编号
     */
    private String cFzbh;

    /**
     * 关键字
     */
    private String cKey;

    /**
     * 名称
     */
    private String cMC;

    /**
     * 说明
     */
    private String cSm;

    /**
     * 默认值
     */
    private String cMrz;
    /**
     * 是否可以维护
     */
    private Integer nWh;
    /**
     * 是否有效
     */
    private Integer nYx;
    /**
     * 分组内显示顺序
     */
    private Integer nXssx;
    /**
     * 显示类型
     */
    private Integer nXslx;
    /**
     * 修改时间
     */
    private Timestamp dXgsj;
    /**
     * 配置的单值代码
     */
    private String cPzdm;
    /**
     * 父亲配置信息主键
     */
    private String cParent;
    /**
     * 提出地区
     */
    private String cDq;
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
     * 每页条数
     */
    private String limit;
    /**
     * 页码数
     */
    private String offset;
    /**
     * 单位标识
     */
    private String cdwbs;
    /**
     * 配置项值
     */
    private String cValue;
    /**
     * 模糊匹配字段，此字段匹配c_key,c_mc,c_sm
     */
    private String content;
    /**
     * 环境标识 过滤某个环境下的配置值，不传默认为defaultEnv
     */
    private String env;
    /**
     * 全局配置   true/false
     */
    private Boolean includeDef;
    /**
     * 排序字段
     * -updateTime 按照时间倒序;
     * updateTime 按照时间正序;
     * -key 按照关键字倒序;
     * key 按照关键字正序;
     */
    private String sort;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 配置代码
     */
    private Set<ConfigCode> configCodeSet = new HashSet<>();

    private List<ConfigValue> values = new ArrayList<>();

    public String getcBh() {
        return cBh;
    }

    public void setcBh(String cBh) {
        this.cBh = cBh;
    }

    public String getcBySystem() {
        return cBySystem;
    }

    public void setcBySystem(String cBySystem) {
        this.cBySystem = cBySystem;
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

    public String getcKey() {
        return cKey;
    }

    public void setcKey(String cKey) {
        this.cKey = cKey;
    }

    public String getcMC() {
        return cMC;
    }

    public void setcMC(String cMC) {
        this.cMC = cMC;
    }

    public String getcSm() {
        return cSm;
    }

    public void setcSm(String cSm) {
        this.cSm = cSm;
    }

    public String getcMrz() {
        return cMrz;
    }

    public void setcMrz(String cMrz) {
        this.cMrz = cMrz;
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

    public Integer getnXssx() {
        return nXssx;
    }

    public void setnXssx(Integer nXssx) {
        this.nXssx = nXssx;
    }

    public Integer getnXslx() {
        return nXslx;
    }

    public void setnXslx(Integer nXslx) {
        this.nXslx = nXslx;
    }

    public Timestamp getdXgsj() {
        return dXgsj;
    }

    public void setdXgsj(Timestamp dXgsj) {
        this.dXgsj = dXgsj;
    }

    public String getcPzdm() {
        return cPzdm;
    }

    public void setcPzdm(String cPzdm) {
        this.cPzdm = cPzdm;
    }

    public String getcParent() {
        return cParent;
    }

    public void setcParent(String cParent) {
        this.cParent = cParent;
    }

    public String getcDq() {
        return cDq;
    }

    public void setcDq(String cDq) {
        this.cDq = cDq;
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

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getCdwbs() {
        return cdwbs;
    }

    public void setCdwbs(String cdwbs) {
        this.cdwbs = cdwbs;
    }

    public String getcValue() {
        return cValue;
    }

    public void setcValue(String cValue) {
        this.cValue = cValue;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public Boolean getIncludeDef() {
        return includeDef;
    }

    public void setIncludeDef(Boolean includeDef) {
        this.includeDef = includeDef;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Set<ConfigCode> getConfigCodeSet() {
        return configCodeSet;
    }

    public void setConfigCodeSet(Set<ConfigCode> configCodeSet) {
        this.configCodeSet = configCodeSet;
    }

    public List<ConfigValue> getValues() {
        return values;
    }

    public void setValues(List<ConfigValue> values) {
        this.values = values;
    }
}
