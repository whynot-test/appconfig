package com.examplebi.appconfig.configinfo.bean;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月30日 23:44:27
 * @version: V1
 * @Description:
 */
public class ConfigValueDTO {
    private String pzxxbh;
    private String cdwbs;
    private String cvalue;

    public ConfigValueDTO(String pzxxbh, String cdwbs, String cvalue) {
        this.pzxxbh = pzxxbh;
        this.cdwbs = cdwbs;
        this.cvalue = cvalue;
    }

    public String getPzxxbh() {
        return pzxxbh;
    }

    public void setPzxxbh(String pzxxbh) {
        this.pzxxbh = pzxxbh;
    }

    public String getCdwbs() {
        return cdwbs;
    }

    public void setCdwbs(String cdwbs) {
        this.cdwbs = cdwbs;
    }

    public String getCvalue() {
        return cvalue;
    }

    public void setCvalue(String cvalue) {
        this.cvalue = cvalue;
    }

    @Override
    public String toString() {
        return "ConfigValueDTO{" +
                "pzxxbh='" + pzxxbh + '\'' +
                ", cdwbs='" + cdwbs + '\'' +
                ", cvalue='" + cvalue + '\'' +
                '}';
    }
}