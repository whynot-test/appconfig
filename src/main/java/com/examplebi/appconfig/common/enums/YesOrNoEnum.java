package com.examplebi.appconfig.common.enums;

/**
 * @ClassName YesOrNoEnum
 * @Description TODO
 * @Author bijunjian
 * @Date 2023/8/28 0028 10:34
 * @Version 1.0
 **/
public enum YesOrNoEnum {
    YES(1,"1","是"),
    NO(2,"2","否")
    ;

    private Integer id;

    private String idStr;

    private String name;

    YesOrNoEnum(Integer id, String idStr, String name) {
        this.id = id;
        this.idStr = idStr;
        this.name = name;
    }

    YesOrNoEnum() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
