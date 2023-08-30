package com.examplebi.appconfig.configinfo.bean;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月30日 23:43:42
 * @version: v1
 * @Description:
 */
public class ConfigValueBO {

    private String key;
    private String corp;
    private String env;
    private String value;

    public ConfigValueBO(String key, String corp, String env, String value) {
        this.key = key;
        this.corp = corp;
        this.env = env;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}