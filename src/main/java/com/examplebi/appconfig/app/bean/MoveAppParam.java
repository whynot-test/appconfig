package com.examplebi.appconfig.app.bean;


import lombok.Data;

/**
 * @ClassName MoveAppParam
 * @Description 移动子系统
 * @Author bijunjian
 * @Date 2023/8/22 0022 15:44
 * @Version 1.0
 **/
@Data
public class MoveAppParam {
    /**
     * 系统主键
     */
    private String cBhSystem;
    /**
     * 子系统编号
     */
    private String cBh;
    /**
     * 子系统标识
     */
    private String cXtbs;
    /**
     * 子系统名称
     */
    private String cMc;

}
