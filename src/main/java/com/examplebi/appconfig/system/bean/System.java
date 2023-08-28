package com.examplebi.appconfig.system.bean;

import java.io.Serializable;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月26日 13:27:53
 * @version: V1
 * @Description: 系统bean
 */
public class System implements Serializable {

    private static final long serialVersionUID = 8598469568856472871L;

    /**
     * 系统编号
     */
    private String cBh;

    /**
     * 系统标识
     */
    private String cBs;

    /**
     * 系统名称
     */
    private String cMc;

    /**
     * 系统说明
     */
    private String cSm;

    /**
     * 系统负责人
     */
    private String cFzr;

    public System() {
    }

    public System(String cBh, String cBs, String cMc, String cSm, String cFzr) {
        this.cBh = cBh;
        this.cBs = cBs;
        this.cMc = cMc;
        this.cSm = cSm;
        this.cFzr = cFzr;
    }

    public String getcBh() {
        return cBh;
    }

    public void setcBh(String cBh) {
        this.cBh = cBh;
    }

    public String getcBs() {
        return cBs;
    }

    public void setcBs(String cBs) {
        this.cBs = cBs;
    }

    public String getcMc() {
        return cMc;
    }

    public void setcMc(String cMc) {
        this.cMc = cMc;
    }

    public String getcSm() {
        return cSm;
    }

    public void setcSm(String cSm) {
        this.cSm = cSm;
    }

    public String getcFzr() {
        return cFzr;
    }

    public void setcFzr(String cFzr) {
        this.cFzr = cFzr;
    }
}