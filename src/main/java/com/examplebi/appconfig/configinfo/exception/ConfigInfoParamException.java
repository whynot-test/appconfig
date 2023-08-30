package com.examplebi.appconfig.configinfo.exception;

import com.examplebi.appconfig.common.enums.ResponseCode;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月30日 23:51:03
 * @version: V1
 * @Description: 配置参数异常
 */
public class ConfigInfoParamException extends Exception{


    public ConfigInfoParamException(String message) {
        super(message);
    }

    public ConfigInfoParamException(ResponseCode responseCode) {
        super(responseCode.getData());
    }

    public ConfigInfoParamException(ResponseCode responseCode, Throwable e){
        super(responseCode.getData(), e);
    }
}