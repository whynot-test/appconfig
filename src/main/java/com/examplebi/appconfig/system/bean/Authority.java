package com.examplebi.appconfig.system.bean;

import java.io.Serializable;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月26日 13:27:33
 * @version: V1
 * @Description: 系统认证类
 */
public class Authority implements Serializable {

    private
    static final long serialVersionUID = -6204534906423008961L;

    /**
     * 系统权限表id
     */
    private String cId;

    /**
     * 系统权限表人员id
     */
    private String cRyId;

    /**
     * 系统权限表系统主键
     */
    private String cXtId;

    public Authority() {
    }

    public Authority(String cId, String cRyId, String cXtId) {
        this.cId = cId;
        this.cRyId = cRyId;
        this.cXtId = cXtId;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcRyId() {
        return cRyId;
    }

    public void setcRyId(String cRyId) {
        this.cRyId = cRyId;
    }

    public String getcXtId() {
        return cXtId;
    }

    public void setcXtId(String cXtId) {
        this.cXtId = cXtId;
    }
}