/**
 * @projectName appconfig
 * @package com.examplebi.appconfig.auditlog.enums
 * @className com.examplebi.appconfig.auditlog.enums.LogModuleType
 * @copyright Copyright 2023 Thunisoft, Inc All rights reserved.
 */
package com.examplebi.appconfig.auditlog.enums;

/**
 * LogModuleType
 *
 * @author Administrator
 * @version TODO
 * @description 日志类型
 * @date 2023/8/27 23:58
 */
public enum LogModuleType {

    SYSTEM("systemAuditLog", "系统", "配置管理"),
    APP("appAuditLog", "子系统", "配置管理"),
    ENV("envAuditLog", "环境", "环境配置"),
    GROUP("groupAuditLog", "分组", "配置管理"),
    QUOTEGROUP("quoteGroupAuditLog", "引用分组", "配置管理"),
    CONFIGINFO("configinfoAuditLog", "配置信息", "配置管理"),
    CONFIGVALUE("configvalueAuditLog", "配置值", "配置管理"),
    CONFIGCORPVALUE("configcorpvalueAuditLog", "单位制", "配置管理"),
    GLOBALCONFIG("globalconfigAuditLog", "全局配置", "配置管理");
    private String id;

    private String name;

    private String realName;

    public String getId() {
        return id;
    }

    LogModuleType() {
    }

    LogModuleType(String id, String name, String realName) {
        this.id = id;
        this.name = name;
        this.realName = realName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}