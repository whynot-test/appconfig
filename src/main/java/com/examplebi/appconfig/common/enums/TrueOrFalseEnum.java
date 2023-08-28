package com.examplebi.appconfig.common.enums;

/**
 * @ClassName TrueOrFalseEnum
 * @Description 是或否枚举
 * @Author bijunjian
 * @Date 2023/8/28 0028 10:39
 * @Version 1.0
 **/
public enum TrueOrFalseEnum {
    TRUE("true"),
    FALSE("false");

    private String key;

    TrueOrFalseEnum(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
