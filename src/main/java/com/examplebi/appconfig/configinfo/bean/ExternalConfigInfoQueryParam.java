package com.examplebi.appconfig.configinfo.bean;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月30日 23:45:08
 * @version: V1
 * @Description:
 */
public class ExternalConfigInfoQueryParam {

    /**
     * 子系统标识或编号
     */
    private String appId;
    private String appBs;

    /**
     * 分组标识或编号
     */
    private String groupId;
    private String groupBs;
    /**
     * 单位
     */
    private String corp;

    /**
     * 环境
     */
    private String env;

    /**
     * 配置信息关键字
     */
    private String key;

    /**
     * 是否返回默认值
     */
    private Boolean withDefault;

    private Boolean withCorpPriority;

    public ExternalConfigInfoQueryParam() {}

    public ExternalConfigInfoQueryParam(String corp, String env, Boolean withDefault,Boolean withCorpPriority) {
        this.corp = corp;
        this.env = env;
        this.withDefault = withDefault;
        this.withCorpPriority = withCorpPriority;
    }

    public ExternalConfigInfoQueryParam(String appId, String groupId, String corp, String env, Boolean withDefault, Boolean withCorpPriority) {
        this.appId = appId;
        this.groupId = groupId;
        this.corp = corp;
        this.env = env;
        this.withDefault = withDefault;
        this.withCorpPriority = withCorpPriority;
    }

    public String getAppBs() {
        return appBs;
    }

    public void setAppBs(String appBs) {
        this.appBs = appBs;
    }

    public String getGroupBs() {
        return groupBs;
    }

    public void setGroupBs(String groupBs) {
        this.groupBs = groupBs;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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

    public Boolean getWithDefault() {
        return withDefault;
    }

    public void setWithDefault(Boolean withDefault) {
        this.withDefault = withDefault;
    }

    public Boolean getWithCorpPriority() {
        return withCorpPriority;
    }

    public void setWithCorpPriority(Boolean withCorpPriority) {
        this.withCorpPriority = withCorpPriority;
    }
}