package com.examplebi.appconfig.common.bean;

import com.examplebi.appconfig.common.enums.ResponseCode;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月23日 23:55:28
 * @version: V1
 * @Description: 相应数据
 */
public class ResponseData <T>{

    private Integer status;

    private String message;

    private T data;

    public ResponseData(String message) {
        this.message = message;
    }

    public ResponseData(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public ResponseData(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public ResponseData(ResponseCode responseCode) {
        this.status = responseCode.getStatus();
        this.message = responseCode.getData();
    }

    public ResponseData(ResponseCode responseCode, T data) {
        this.status = responseCode.getStatus();
        this.message = responseCode.getData();
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}