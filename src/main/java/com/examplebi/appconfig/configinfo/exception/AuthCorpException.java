package com.examplebi.appconfig.configinfo.exception;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月30日 23:49:11
 * @version: V1
 * @Description:
 */
public class AuthCorpException extends Exception{

    public AuthCorpException(String message){
        super(message);
    }

    /**
     *
     * @param message 异常消息
     * @param e 异常
     */
    public AuthCorpException(String message,Throwable e){
        super(message, e);
    }
}