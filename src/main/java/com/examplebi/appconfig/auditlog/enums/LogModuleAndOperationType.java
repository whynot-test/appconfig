/**
 * @projectName appconfig
 * @package com.examplebi.appconfig.auditlog.enums
 * @className com.examplebi.appconfig.auditlog.enums.LogModuleAndOperationType
 * @copyright Copyright 2023 Thunisoft, Inc All rights reserved.
 */
package com.examplebi.appconfig.auditlog.enums;

/**
 * LogModuleAndOperationType
 *
 * @author Administrator
 * @version TODO
 * @description 登陆类型和操作类型
 * @date 2023/8/27 23:57
 */
public enum LogModuleAndOperationType {

    SYSTEM_INSERT(LogModuleType.SYSTEM.getId() + "_" + LogOperationType.INSERT.getId(), "添加系统"),
    SYSTEM_UPDATE(LogModuleType.SYSTEM.getId() + "_" + LogOperationType.UPDATE.getId(), "修改系统"),
    SYSTEM_DELETE(LogModuleType.SYSTEM.getId() + "_" + LogOperationType.DELETE.getId(), "删除系统"),

    APP_INSERT(LogModuleType.APP.getId() + "_" + LogOperationType.INSERT.getId(), "添加子系统"),
    APP_MOVE(LogModuleType.APP.getId() + "_" + LogOperationType.MOVE.getId(), "移动子系统"),
    APP_UPDATE(LogModuleType.APP.getId() + "_" + LogOperationType.UPDATE.getId(), "修改子系统"),
    APP_DELETE(LogModuleType.APP.getId() + "_" + LogOperationType.DELETE.getId(), "删除子系统"),
    APP_IMPORT(LogModuleType.APP.getId() + "_" + LogOperationType.IMPORT.getId(), "导入配置"),
    APP_EXPORT(LogModuleType.APP.getId() + "_" + LogOperationType.EXPORT.getId(), "导出配置"),

    ENV_INSERT(LogModuleType.ENV.getId() + "_" + LogOperationType.INSERT.getId(), "添加环境"),
    ENV_BATCH_INSERT(LogModuleType.ENV.getId() + "_" + LogOperationType.BATCHINSERT.getId(), "批量添加环境"),
    ENV_UPDATE(LogModuleType.ENV.getId() + "_" + LogOperationType.UPDATE.getId(), "修改环境"),
    ENV_DELETE(LogModuleType.ENV.getId() + "_" + LogOperationType.DELETE.getId(), "删除环境"),

    GROUP_INSERT(LogModuleType.GROUP.getId() + "_" + LogOperationType.INSERT.getId(), "添加分组"),
    GROUP_UPDATE(LogModuleType.GROUP.getId() + "_" + LogOperationType.UPDATE.getId(), "修改分组"),
    GROUP_DELETE(LogModuleType.GROUP.getId() + "_" + LogOperationType.DELETE.getId(), "删除分组"),

    QUOTEGROUP_DELETE(LogModuleType.QUOTEGROUP.getId() + "_" + LogOperationType.DELETE.getId(), "取消引用"),
    QUOTEGROUP_UPDATE(LogModuleType.QUOTEGROUP.getId() + "_" + LogOperationType.UPDATE.getId(), "维护引用"),

    CONFIGINFO_INSERT(LogModuleType.CONFIGINFO.getId() + "_" + LogOperationType.INSERT.getId(), "添加配置"),
    CONFIGINFO_BATCHINSERT(LogModuleType.CONFIGINFO.getId() + "_" + LogOperationType.BATCHINSERT.getId(), "批量添加配置"),
    CONFIGINFO_UPDATE(LogModuleType.CONFIGINFO.getId() + "_" + LogOperationType.UPDATE.getId(), "修改配置"),
    CONFIGINFO_BATCHUPDATE(LogModuleType.CONFIGINFO.getId() + "_" + LogOperationType.BATCHUPDATE.getId(), "批量修改配置"),
    CONFIGINFO_DELETE(LogModuleType.CONFIGINFO.getId() + "_" + LogOperationType.DELETE.getId(), "删除配置"),
    CONFIGINFO_BATCHDELETE(LogModuleType.CONFIGINFO.getId() + "_" + LogOperationType.BATCHDELETE.getId(), "删除配置"),
    CONFIGINFO_EXPORT(LogModuleType.CONFIGINFO.getId() + "_" + LogOperationType.EXPORT.getId(), "导出excel"),
    CONFIGINFO_EXPORT_DEFAULTVALUE(LogModuleType.CONFIGINFO.getId() + "_" + LogOperationType.EXPORTDEFAULTVALUE.getId(), "导出默认值"),
    CONFIGINFO_EXPORT_CORPVALUE(LogModuleType.CONFIGINFO.getId() + "_" + LogOperationType.EXPORTCORPVALUE.getId(), "导出单位值"),
    CONFIGINFO_MOVE(LogModuleType.CONFIGINFO.getId() + "_" + LogOperationType.MOVE.getId(), "移动配置信息"),

    CONFIGVALUE_UPDATE(LogModuleType.CONFIGVALUE.getId() + "_" + LogOperationType.UPDATE.getId(), "修改配置值"),
    CONFIGVALUE_BATCHUPDATE(LogModuleType.CONFIGVALUE.getId() + "_" + LogOperationType.BATCHUPDATE.getId(), "批量修改配置值"),
    CONFIGVALUE_DELETE(LogModuleType.CONFIGVALUE.getId() + "_" + LogOperationType.DELETE.getId(), "删除配置值"),
    CONFIGVALUE_BATCHDELETE(LogModuleType.CONFIGVALUE.getId() + "_" + LogOperationType.BATCHDELETE.getId(), "批量删除配置值"),

    CONFIGCORPVALUE_BATCHINSERT(LogModuleType.CONFIGCORPVALUE.getId() + "_" + LogOperationType.BATCHINSERT.getId(), "批量设置配置值"),
    CONFIGCORPVALUE_SETVALUE(LogModuleType.CONFIGCORPVALUE.getId() + "_" + LogOperationType.UPDATE.getId(), "修改配置值"),
    CONFIGCORPVALUE_BATCHDELETE(LogModuleType.CONFIGCORPVALUE.getId() + "_" + LogOperationType.BATCHDELETE.getId(), "批量删除配置值"),

    GLOBALCONFIG_INSERT(LogModuleType.GLOBALCONFIG.getId() + "_" + LogOperationType.INSERT.getId(), "设置全局配置"),
    GLOBALCONFIG_DELETE(LogModuleType.GLOBALCONFIG.getId() + "_" + LogOperationType.DELETE.getId(), "取消全局配置");

    private String id;

    private String name;

    LogModuleAndOperationType() {
    }

    LogModuleAndOperationType(String id, String name) {
        this.id = id;
        this.name = name;
    }
}