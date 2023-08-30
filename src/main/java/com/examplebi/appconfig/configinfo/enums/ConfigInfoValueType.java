/**
 * @projectName appconfig
 * @package com.examplebi.appconfig.configinfo.enums
 * @className com.examplebi.appconfig.configinfo.enums.ConfigInfoValueType
 * @copyright Copyright 2023 Thunisoft, Inc All rights reserved.
 */
package com.examplebi.appconfig.configinfo.enums;

/**
 * ConfigInfoValueType
 * @description
 * @author Administrator
 * @date 2023/8/30 23:47
 * @version TODO
 */
public enum ConfigInfoValueType {

    STRING_TYPE(0, "0", "字符串"),

    BOOLEAN_TYPE(1, "1", "是/否"),

    SINGLE_TYPE(2, "2","单值代码"),

    MUTI_TYPE(3, "3","多值代码");

    private Integer id;
    private String type;
    private String name;

    ConfigInfoValueType(Integer id, String type, String name) {
        this.id = id;
        this.type = type;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public static ConfigInfoValueType getTypeById(Integer id) {
        ConfigInfoValueType[] datas = ConfigInfoValueType.values();
        for (ConfigInfoValueType valueType : datas) {
            if (valueType.getId().equals(id)) {
                return valueType;
            }
        }
        return null;
    }

    public static ConfigInfoValueType getTypeByType(String type) {
        ConfigInfoValueType[] datas = ConfigInfoValueType.values();
        for (ConfigInfoValueType valueType : datas) {
            if (valueType.getType().equals(type)) {
                return valueType;
            }
        }
        return null;
    }
}