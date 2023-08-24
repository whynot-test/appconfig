package com.examplebi.appconfig.configinfo;

import java.util.Objects;

import com.examplebi.appconfig.common.consts.CommonConst;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月23日 23:31:03
 * @version: V1
 * @Description: 配置值bean
 */
public class ConfigValue {
    /**
     *配置值编号
     */
    private String cBh;
    /**
     *配置信息编号
     */
    private String cPzxxbh;

    /**
     * 单位标识
     */

    private String cDwbs = CommonConst.C_CORP_DEFAULT;

    /**
     * 环境标识
     */
    private String cEnv = CommonConst.C_ENV_DEFAULT;

    /**
     * 环境名曾
     */

    private String cMcEvn;

    /**
     *
     * 单位名称
     */
    private String cDwmc;

    /**
     * 配置值
     */

    private String cValue;

    /**
     * 单值/多值的配置值翻译成中文
     */
    private String aValueName;

    public ConfigValue() {
    }

    public ConfigValue(String cBh, String cPzxxbh, String cDwbs, String cEnv, String cValue) {
        this.cBh = cBh;
        this.cPzxxbh = cPzxxbh;
        this.cDwbs = cDwbs;
        this.cEnv = cEnv;
        this.cValue = cValue;
    }

    public ConfigValue(String cBh, String cPzxxbh, String cDwbs, String cEnv) {
        this.cBh = cBh;
        this.cPzxxbh = cPzxxbh;
        this.cDwbs = cDwbs;
        this.cEnv = cEnv;
    }

    public String getcBh() {
        return cBh;
    }

    public void setcBh(String cBh) {
        this.cBh = cBh;
    }

    public String getcPzxxbh() {
        return cPzxxbh;
    }

    public void setcPzxxbh(String cPzxxbh) {
        this.cPzxxbh = cPzxxbh;
    }

    public String getcDwbs() {
        return cDwbs;
    }

    public void setcDwbs(String cDwbs) {
        this.cDwbs = cDwbs;
    }

    public String getcEnv() {
        return cEnv;
    }

    public void setcEnv(String cEnv) {
        this.cEnv = cEnv;
    }

    public String getcMcEvn() {
        return cMcEvn;
    }

    public void setcMcEvn(String cMcEvn) {
        this.cMcEvn = cMcEvn;
    }

    public String getcDwmc() {
        return cDwmc;
    }

    public void setcDwmc(String cDwmc) {
        this.cDwmc = cDwmc;
    }

    public String getcValue() {
        return cValue;
    }

    public void setcValue(String cValue) {
        this.cValue = cValue;
    }

    public String getaValueName() {
        return aValueName;
    }

    public void setaValueName(String aValueName) {
        this.aValueName = aValueName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConfigValue that = (ConfigValue) o;
        return Objects.equals(cBh, that.cBh) && Objects.equals(cPzxxbh, that.cPzxxbh) && Objects.equals(cDwbs, that.cDwbs) && Objects.equals(cEnv, that.cEnv) && Objects.equals(cValue, that.cValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cBh, cPzxxbh, cDwbs, cEnv, cValue);
    }
}