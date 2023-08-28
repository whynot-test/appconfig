package com.examplebi.appconfig.common.utils;

import java.util.UUID;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月26日 16:54:22
 * @version: V1
 * @Description: 生成不带“-”，且全部小写的uuid
 */
public final class UuidUtil {

    private UuidUtil() {

    }
    public static String getUUID32(){
        return UUID.randomUUID().toString().replace("-","").toLowerCase();
    }
}