/**
 * @projectName appconfig
 * @package com.examplebi.appconfig.group.enums
 * @className com.examplebi.appconfig.group.enums.GroupShareEnum
 * @copyright Copyright 2023 Thunisoft, Inc All rights reserved.
 */
package com.examplebi.appconfig.group.enums;

/**
 * GroupShareEnum
 * @description 分组共享范围
 * @author Administrator
 * @date 2023/8/28 23:02
 * @version TODO
 */
public enum GroupShareEnum {
    OUTER_SYSTEM("outer-system","系统间共享"),
    INNER_SYSTEM("inner-system","系统内共享"),
    APP("app","不共享");

    private String id;

    private String name;

    GroupShareEnum(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
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
}