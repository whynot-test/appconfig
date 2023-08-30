package com.examplebi.appconfig.configinfo.bean;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月30日 23:41:22
 * @version: V1
 * @Description: 配置查询类
 */
public class ConfigInfoQueryParam {

    private String scope;
    private String appId;
    private String groupId;
    private String content;
    private String systemId;
    private Integer page;
    private Integer size;
    private String appName;
    private String userId;
    private String corp;
    private String env;
    private Integer translateCode;
    private boolean dMDB;
    private String envName;

    public ConfigInfoQueryParam() {
    }

    public ConfigInfoQueryParam(String appId) {
        this.appId = appId;
    }

    public ConfigInfoQueryParam(String appId, String groupId) {
        this.appId = appId;
        this.groupId = groupId;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCorp() {
        return corp;
    }

    public void setCorp(String corp) {
        this.corp = corp;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public Integer getTranslateCode() {
        return translateCode;
    }

    public void setTranslateCode(Integer translateCode) {
        this.translateCode = translateCode;
    }

    public boolean isdMDB() {
        return dMDB;
    }

    public void setdMDB(boolean dMDB) {
        this.dMDB = dMDB;
    }

    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }
}