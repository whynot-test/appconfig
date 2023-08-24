package com.examplebi.appconfig.group.bean;

import java.io.Serializable;

/**
 * @Author: bjj
 * @createTime: 2023年08月23日 23:08:13
 * @version: V1
 * @Description: 引用分组bean
 */
public class GroupQuote implements Serializable {

    private static final long serialVersionUID = -5287318029157934213L;

    /**
     * 引用分组编号
     */
    private String cBh;

    /**
     * 系统编号
     */
    private String cBhSystem;

    /**
     * 子系统编号
     */
    private String cBhApp;

    /**
     * 分组编号
     */
    private String cBhQuoteGroup;

    /**
     * 被引用分组子系统编号
     */
    private String cBhQuoteApp;

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

    public String getcBhApp() {
        return cBhApp;
    }

    public void setcBhApp(String cBhApp) {
        this.cBhApp = cBhApp;
    }

    public String getcBhQuoteGroup() {
        return cBhQuoteGroup;
    }

    public void setcBhQuoteGroup(String cBhQuoteGroup) {
        this.cBhQuoteGroup = cBhQuoteGroup;
    }

    public String getcBhQuoteApp() {
        return cBhQuoteApp;
    }

    public void setcBhQuoteApp(String cBhQuoteApp) {
        this.cBhQuoteApp = cBhQuoteApp;
    }
}