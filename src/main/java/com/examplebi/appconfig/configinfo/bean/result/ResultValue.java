package com.examplebi.appconfig.configinfo.bean.result;

import java.util.Map;

/**
 * @ClassName ResultValue
 * @Description TODO
 * @Author bijunjian
 * @Date 2023/8/28 0028 15:52
 * @Version 1.0
 **/
public class ResultValue {

    /**
     * 配置关键字
     */
    private String key;

    /**
     * 有效
     */
    private int valid;

    /**
     * 是否可维护
     */
    private int maintainable;

    /**
     * 默认及各院值
     */
    private Map<String,String> values;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getValid() {
        return valid;
    }

    public void setValid(int valid) {
        this.valid = valid;
    }

    public int getMaintainable() {
        return maintainable;
    }

    public void setMaintainable(int maintainable) {
        this.maintainable = maintainable;
    }

    public Map<String, String> getValues() {
        return values;
    }

    public void setValues(Map<String, String> values) {
        this.values = values;
    }
}
