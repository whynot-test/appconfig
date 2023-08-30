package com.examplebi.appconfig.configinfo.bean;

import java.util.Objects;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月30日 23:34:47
 * @version: V1
 * @Description: 配置代码
 */
public class ConfigCode {
    /**
     * 配置代码主键
     */
    private String cBh;
    /**
     * 代码类型
     */
    private String cPzdm;
    /**
     * 代码值
     */
    private String cDm;
    /**
     * 代码名称
     */
    private String cDmsm;
    /**
     * 显示顺序
     */
    private Integer nXssx;

    public String getcBh() {
        return cBh;
    }

    public void setcBh(String cBh) {
        this.cBh = cBh;
    }

    public Integer getnXssx() {
        return nXssx;
    }

    public void setnXssx(Integer nXssx) {
        this.nXssx = nXssx;
    }

    public String getcPzdm() {
        return cPzdm;
    }

    public void setcPzdm(String cPzdm) {
        this.cPzdm = cPzdm;
    }

    public String getcDm() {
        return cDm;
    }

    public void setcDm(String cDm) {
        this.cDm = cDm;
    }

    public String getcDmsm() {
        return cDmsm;
    }

    public void setcDmsm(String cDmsm) {
        this.cDmsm = cDmsm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigCode that = (ConfigCode) o;
        return cDm.equals(that.cDm) &&
                cDmsm.equals(that.cDmsm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cDm, cDmsm);
    }
}