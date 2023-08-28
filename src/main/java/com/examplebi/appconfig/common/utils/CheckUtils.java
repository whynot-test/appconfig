package com.examplebi.appconfig.common.utils;

import org.apache.commons.lang.StringUtils;

/**
 * @Author: bijunajian
 * @createTime: 2023年08月26日 16:14:07
 * @version: V1
 * @Description: 校验参数是否为空和最大长度工具类
 */
public final class CheckUtils {

    public CheckUtils() {

    }

    public static boolean checkLength(String value,Integer max){
        return (StringUtils.isNotBlank(value) && value.length() <= max);
    }

}