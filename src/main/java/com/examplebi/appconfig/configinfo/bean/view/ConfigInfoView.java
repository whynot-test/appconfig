package com.examplebi.appconfig.configinfo.bean.view;

import com.examplebi.appconfig.configinfo.ConfigInfo;

import java.util.List;

/**
 * @ClassName ConfigInfoView
 * @Description 页面展示数据结构类
 * @Author bijunjian
 * @Date 2023/8/28 0028 15:56
 * @Version 1.0
 **/
public class ConfigInfoView {

    private Integer count;

    private List<ConfigInfo> configInfos;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<ConfigInfo> getConfigInfos() {
        return configInfos;
    }

    public void setConfigInfos(List<ConfigInfo> configInfos) {
        this.configInfos = configInfos;
    }
}
