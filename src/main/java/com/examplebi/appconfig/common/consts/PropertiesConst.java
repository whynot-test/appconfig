package com.examplebi.appconfig.common.consts;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月24日 22:50:47
 * @version: v1
 * @Description: 配置常量
 */
public final class PropertiesConst {

    public PropertiesConst() {
    }

    public static final String  REDIS_MASTER_NAME = "redisson.master-name";

    public static final String REDIS_SENTINELS_NAME= "redisson.sentinel-addresses";

    public static final String  REDIS_IP = "redisson.ip";

    /**
     * api接口访问日志开关
     */
    public static final String API_ACCESS_LOG_OPEN = "appconfig.api.access.log.open";
}