/**
 * @projectName appconfig
 * @package com.examplebi.appconfig.auditlog.enums
 * @className com.examplebi.appconfig.auditlog.enums.LogOperationType
 * @copyright Copyright 2023 Thunisoft, Inc All rights reserved.
 */
package com.examplebi.appconfig.auditlog.enums;

/**
 * LogOperationType
 *
 * @author Administrator
 * @version TODO
 * @description 日志操作枚举
 * @date 2023/8/28 0:06
 */
public enum LogOperationType {
    INSERT("insert", "添加"),
    BATCHINSERT("batchInsert", "批量添加"),
    UPDATE("update", "修改"),
    UPDATE_GLOBAL("updateGlobal", "修改全局配置"),
    BATCHUPDATE("batchUpdate", "批量修改"),
    MOVE("move", "移动"),
    DELETE("delete", "删除"),
    DELETE_GLOBAL("deleteGlobal", "删除全局配置"),
    BATCHDELETE("batchDelete", "批量删除"),
    IMPORT("import", "导入"),
    EXPORT("export", "导出"),
    EXPORTDEFAULTVALUE("exportDefaultValue", "导出默认值"),
    EXPORTCORPVALUE("exportCorpValue", "导出单位值");

    private String id;

    private String name;

    LogOperationType(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}