package com.examplebi.appconfig.group.bean;

import java.io.Serializable;
import java.util.Map;

/**
 * @ClassName Group
 * @Description 配置分组bean
 * @Author bijunjian
 * @Date 2023/8/22 0022 16:24
 * @Version 1.0
 **/
public class Group implements Serializable {

    private static final long serialVersionUID = 1468256931773246691L;

    /**
     * 分组编号
     */
    private String cBh;

    /**
     *子系统编号
     */
    private String cBhZxtdy;

    /**
     * 分组标识
     */
    private String cFzbs;

    /**
     * 分组名称
     */
    private String c_Mc;

    /**
     * 分组说明
     */
    private String c_Sm;

    /**
     * 显示顺序
     */
    private String nXssx;

    /**
     * 所属系统编号
     */
    private String cBhSystem;

    /**
     * 分组共享范围
     */
    private String cScope;


    /**
     * 当前分组下的所有配置信息，用于构建 分组-配置信息 结构
     * key:为配置信息的主键，value为对应的配置分组config对象
     */
    private Map<String,String> configMap;

    /**
     * 子系统名称
     */
    private String cMcApp;

    /**
     * 所属系统名称
     */
    private String cMcSystem;

    /**
     * 分组类型（用于前端显示），数据库无此字段
     */
    private String type;


}
