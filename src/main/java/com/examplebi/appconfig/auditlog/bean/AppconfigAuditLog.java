package com.examplebi.appconfig.auditlog.bean;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月27日 23:43:50
 * @version: V1
 * @Description: 审计日志实体
 */
public class AppconfigAuditLog {

    /**
     * 审计日志模块
     */
    private String module;

    /**
     * 操作类型
     */
    private String operation;

    /**
     * 日志类容
     */
    private String content;

    /**
     * 是否需要保存
     */
    private boolean needSave = true;

    public AppconfigAuditLog() {
    }

    public AppconfigAuditLog(String module, String operation, String content, boolean needSave) {
        this.module = module;
        this.operation = operation;
        this.content = content;
        this.needSave = needSave;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isNeedSave() {
        return needSave;
    }

    public void setNeedSave(boolean needSave) {
        this.needSave = needSave;
    }
}