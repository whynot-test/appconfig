/**
 * @projectName appconfig
 * @package com.examplebi.appconfig.group.enums
 * @className com.examplebi.appconfig.group.enums.GroupScopeEnum
 * @copyright Copyright 2023 Thunisoft, Inc All rights reserved.
 */
package com.examplebi.appconfig.group.enums;

/**
 * GroupScopeEnum
 * @description 分组范围枚举类
 * @author Administrator
 * @date 2023/8/28 23:01
 * @version TODO
 */
public enum GroupScopeEnum {

    ALL("all", "所有分组"),
    GLOBAL("global", "全局配置"),
    SYSTEM("system", "引用分组"),
    APP("app", "子系统分组");

    GroupScopeEnum(String scopeStr, String scopeDes){
        this.scopeStr = scopeStr;
        this.scopeDes = scopeDes;
    };

    String scopeStr;

    String scopeDes;

    public String getScopeStr() {
        return scopeStr;
    }

    public String getScopeDes() {
        return scopeDes;
    }
}