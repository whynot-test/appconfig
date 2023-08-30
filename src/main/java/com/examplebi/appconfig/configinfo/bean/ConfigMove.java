package com.examplebi.appconfig.configinfo.bean;

import java.sql.Timestamp;

/**
 * @Author: bojunjian
 * @createTime: 2023年08月30日 23:42:08
 * @version: V1
 * @Description:配置信息调整分组移动信息实体类
 */
public class ConfigMove {
    private static final long serialVersionUID = 7572878940701842282L;

    /**
     * 主键
     */
    private String cBh;
    /**
     * 配置信息编号
     */
    private String cBhPzxx;
    /**
     * 移动前所属子系统
     */
    private String cBhAppOld;
    /**
     * 移动前所属分组
     */
    private String cBhGroupOld;
    /**
     * 移动后所属子系统
     */
    private String cBhAppNew;
    /**
     * 移动后所属分组
     */
    private String cBhGroupNew;
    /**
     * 移动时间
     */
    private Timestamp dtTime;

    public ConfigMove() {}

    public ConfigMove(String cBh, String cBhPzxx, String cBhAppOld, String cBhGroupOld) {
        this.cBh = cBh;
        this.cBhPzxx = cBhPzxx;
        this.cBhAppOld = cBhAppOld;
        this.cBhGroupOld = cBhGroupOld;
    }

    public ConfigMove(String cBh, String cBhPzxx, String cBhAppOld, String cBhGroupOld, String cBhAppNew, String cBhGroupNew, Timestamp dtTime) {
        this.cBh = cBh;
        this.cBhPzxx = cBhPzxx;
        this.cBhAppOld = cBhAppOld;
        this.cBhGroupOld = cBhGroupOld;
        this.cBhAppNew = cBhAppNew;
        this.cBhGroupNew = cBhGroupNew;
        this.dtTime = dtTime;
    }

    public String getcBh() {
        return cBh;
    }

    public void setcBh(String cBh) {
        this.cBh = cBh;
    }

    public String getcBhPzxx() {
        return cBhPzxx;
    }

    public void setcBhPzxx(String cBhPzxx) {
        this.cBhPzxx = cBhPzxx;
    }

    public String getcBhAppOld() {
        return cBhAppOld;
    }

    public void setcBhAppOld(String cBhAppOld) {
        this.cBhAppOld = cBhAppOld;
    }

    public String getcBhGroupOld() {
        return cBhGroupOld;
    }

    public void setcBhGroupOld(String cBhGroupOld) {
        this.cBhGroupOld = cBhGroupOld;
    }

    public String getcBhAppNew() {
        return cBhAppNew;
    }

    public void setcBhAppNew(String cBhAppNew) {
        this.cBhAppNew = cBhAppNew;
    }

    public String getcBhGroupNew() {
        return cBhGroupNew;
    }

    public void setcBhGroupNew(String cBhGroupNew) {
        this.cBhGroupNew = cBhGroupNew;
    }

    public Timestamp getDtTime() {
        return dtTime;
    }

    public void setDtTime(Timestamp dtTime) {
        this.dtTime = dtTime;
    }

    @Override
    public String toString() {
        return "ConfigMove{" +
                "cBh='" + cBh + '\'' +
                ", cBhPzxx='" + cBhPzxx + '\'' +
                ", cBhAppOld='" + cBhAppOld + '\'' +
                ", cBhGroupOld='" + cBhGroupOld + '\'' +
                ", cBhAppNew='" + cBhAppNew + '\'' +
                ", cBhGroupNew='" + cBhGroupNew + '\'' +
                ", dtTime=" + dtTime +
                '}';
    }
}