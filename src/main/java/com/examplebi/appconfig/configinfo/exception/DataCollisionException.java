package com.examplebi.appconfig.configinfo.exception;

import com.examplebi.appconfig.common.enums.ResponseCode;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月30日 23:52:07
 * @version: V1
 * @Description: 数据冲突Exception
 */
public class DataCollisionException extends Exception{

    public DataCollisionException(String message) {
        super(message);
    }

    public DataCollisionException(ResponseCode responseCode) {
        super(responseCode.getData());
    }

    public DataCollisionException(ResponseCode responseCode, Throwable e){
        super(responseCode.getData(), e);
    }
}