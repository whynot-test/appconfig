package com.examplebi.appconfig.configinfo;

import java.util.Objects;

/**
 * @ClassName ConfigCode
 * @Description TODO
 * @Author bijunjian
 * @Date 2023/8/22 0022 18:10
 * @Version 1.0
 **/
public class ConfigCode {

    /**
     * 配置代码主键
     */
    private String c_bh;

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
    private String cdmsm;

    /**
     * 显示顺序
     */
    private Integer nXssx;

    public String getC_bh() {
        return c_bh;
    }

    public void setC_bh(String c_bh) {
        this.c_bh = c_bh;
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

    public String getCdmsm() {
        return cdmsm;
    }

    public void setCdmsm(String cdmsm) {
        this.cdmsm = cdmsm;
    }

    public Integer getnXssx() {
        return nXssx;
    }

    public void setnXssx(Integer nXssx) {
        this.nXssx = nXssx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConfigCode that = (ConfigCode) o;
        return cDm.equals(that.cDm) && cdmsm.equals(that.cdmsm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cDm, cdmsm);
    }
}
