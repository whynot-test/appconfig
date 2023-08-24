package com.examplebi.appconfig.common.bean;

import java.util.List;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月23日 23:43:18
 * @version: V1
 * @Description:
 */
public class AppconfigExternalResponse<T> {

    private Integer code;

    private String message;

    private String status;

    private List<T> result;

    private List<T> data;

    private String resultTime;

    public AppconfigExternalResponse(String status, List<T> data, String resultTime) {
        this.status = status;
        this.data = data;
        this.resultTime = resultTime;
    }

    public AppconfigExternalResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public AppconfigExternalResponse(Integer code, String message, List<T> result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }

    public AppconfigExternalResponse(Integer code, String message, List<T> result, String resultTime) {
        this.code = code;
        this.message = message;
        this.result = result;
        this.resultTime = resultTime;
    }

    public AppconfigExternalResponse(Integer code, String message, String resultTime) {
        this.code = code;
        this.message = message;
        this.resultTime = resultTime;
    }

    public AppconfigExternalResponse() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public String getResultTime() {
        return resultTime;
    }

    public void setResultTime(String resultTime) {
        this.resultTime = resultTime;
    }
}