/**
 * @projectName appconfig
 * @package com.examplebi.appconfig.group.enums
 * @className com.examplebi.appconfig.group.enums.GroupTypeEnum
 * @copyright Copyright 2023 Thunisoft, Inc All rights reserved.
 */
package com.examplebi.appconfig.group.enums;

/**
 * GroupTypeEnum
 * @description 供前端显示不同类型的分组使用
 * @author Administrator
 * @date 2023/8/28 23:05
 * @version TODO
 */
public enum GroupTypeEnum {

    OUTER_SYSTEM("outer-system-quote", "引用系统外的分组"),
    INNER_SYSTEM("inner-system-quote", "引用系统内的分组"),
    APP("app", "当前子系统的分组"),
    GLOBAL("global", "全局配置");

    String scopeStr;

    String scopeDes;

    GroupTypeEnum(String scopeStr, String scopeDes){
        this.scopeStr = scopeStr;
        this.scopeDes = scopeDes;
    };

    public String getScopeStr() {
        return scopeStr;
    }

    public String getScopeDes() {
        return scopeDes;
    }
}