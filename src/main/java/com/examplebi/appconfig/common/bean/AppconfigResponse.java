package com.examplebi.appconfig.common.bean;

import java.util.Date;

import com.examplebi.appconfig.common.enums.ResponseCode;

/**
 * @Author: bijunjina
 * @createTime: 2023年08月23日 23:47:14
 * @version: V1
 * @Description: 配置中心相应类
 */
public class AppconfigResponse<T> {

    private String code;

    private String message;

    private T data;

    private Integer count;

    private Date resultTime;

    public AppconfigResponse(String code) {
        this.code = code;
    }

    public AppconfigResponse(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public AppconfigResponse(String code, Integer count, T data) {
        this.code = code;
        this.count = count;
        this.data = data;
    }

    public AppconfigResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public AppconfigResponse(ResponseCode responseCode) {
        this.code = responseCode.getCode();
    }

    public AppconfigResponse(ResponseCode responseCode, String message) {
        this.code = responseCode.getCode();
        this.message = message;
    }

    public AppconfigResponse(ResponseCode responseCode, T data) {
        this.code = responseCode.getCode();
        this.data = data;
    }

    public AppconfigResponse(ResponseCode responseCode, T data, String message) {
        this.code = responseCode.getCode();
        this.data = data;
        this.message = message;
    }

    public AppconfigResponse(ResponseCode responseCode, Integer count, T data) {
        this.code = responseCode.getCode();
        this.data = data;
        this.count = count;
    }

    public AppconfigResponse(ResponseCode responseCode, Date resultTime, T data) {
        this.code = responseCode.getCode();
        this.resultTime = resultTime;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getResultTime() {
        return resultTime;
    }

    public void setResultTime(Date resultTime) {
        this.resultTime = resultTime;
    }
}