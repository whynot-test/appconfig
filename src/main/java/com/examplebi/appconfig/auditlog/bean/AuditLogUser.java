package com.examplebi.appconfig.auditlog.bean;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月27日 23:53:59
 * @version: V1
 * @Description: 审计日志用户
 */
public class AuditLogUser {

    /**
     * 用户id
     */
    private String userId;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 账号id
     */
    private String loginId;

    /**
     * 用户单位
     */
    private String corpId;

    /**
     * 用户IP
     */
    private String host;

    public AuditLogUser() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}