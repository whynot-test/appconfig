package com.examplebi.appconfig.configinfo.bean;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月30日 23:45:53
 * @version:
 * @Description:唯一性验证参数类
 */
public class VerifyConfigInfo {

    /**
     * 配置信息主键
     */
    private String id;
    /**
     * 配置信息标识
     */
    private String key;
    /**
     * 配置信息名称
     */
    private String name;
    /**
     * 系统主键
     */
    private String systemId;
    /**
     *子系统主键
     */
    private String appId;
    /**
     *分组主键
     */
    private String groupId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
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
}