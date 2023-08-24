package com.examplebi.appconfig.configinfo;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月23日 23:14:45
 * @version: V1
 * @Description: 配置信息调整分组移动实体类
 */
public class ConfigMove implements Serializable {

    private static final long serialVersionUID = 5884188769714020751L;

    /**
     * 主键
     */

    private String cBh;

    /**
     * 配置信息编号
     */
    private String cBhPzxx;

    /**
     * 移动前所属子系统编号
     */
    private String cBhAppOld;

    /**
     * 移动前所属子系统分组
     */
    private String cBhGroupOld;
    /**
     * 移动后所属子系统编号
     */
    private String cBhAppNew;

    /**
     * 移动后所属子系统分组
     */
    private String cBhGroupNew;

    /**
     * 移动时间
     */
    private Timestamp dtTime;

    public ConfigMove() {
    }

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
}