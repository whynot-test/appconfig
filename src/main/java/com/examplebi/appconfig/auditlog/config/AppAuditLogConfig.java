package com.examplebi.appconfig.auditlog.config;

import com.examplebi.appconfig.common.enums.YesOrNoEnum;
import com.thunisoft.tap.auditlog.client.consts.AuditLogConfig;
import org.apache.commons.lang3.StringUtils;

/**
 * @ClassName AppAuditLogConfig
 * @Description TODO
 * @Author bijunjian
 * @Date 2023/8/28 0028 10:24
 * @Version 1.0
 **/
public class AppAuditLogConfig extends AuditLogConfig {

    private String auditLogOpen;

    public AppAuditLogConfig(String auditLogOpen) {
        this.auditLogOpen = auditLogOpen;
    }

    public AppAuditLogConfig() {
    }

    public String getAuditLogOpen() {
        return auditLogOpen;
    }

    public void setAuditLogOpen(String auditLogOpen) {
        this.auditLogOpen = auditLogOpen;
    }

    public boolean idAuditLogOpen(){
        return StringUtils.equals(getAuditLogOpen(), YesOrNoEnum.YES.getIdStr()) && StringUtils.isNotBlank(getAuditLogUrl());
    }
}
