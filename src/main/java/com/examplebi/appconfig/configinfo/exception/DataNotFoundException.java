package com.examplebi.appconfig.configinfo.exception;

import com.examplebi.appconfig.common.enums.ResponseCode;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月30日 23:52:59
 * @version: V1
 * @Description: 数据找不到异常
 */
public class DataNotFoundException extends Exception{
    public DataNotFoundException(String message) {
        super(message);
    }

    public DataNotFoundException(ResponseCode responseCode) {
        super(responseCode.getData());
    }

    public DataNotFoundException(ResponseCode responseCode, Throwable e){
        super(responseCode.getData(), e);
    }
}