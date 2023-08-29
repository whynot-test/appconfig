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
    private String cMc;

    /**
     * 分组说明
     */
    private String cSm;

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


    public String getcBh() {
        return cBh;
    }

    public void setcBh(String cBh) {
        this.cBh = cBh;
    }

    public String getcBhZxtdy() {
        return cBhZxtdy;
    }

    public void setcBhZxtdy(String cBhZxtdy) {
        this.cBhZxtdy = cBhZxtdy;
    }

    public String getcFzbs() {
        return cFzbs;
    }

    public void setcFzbs(String cFzbs) {
        this.cFzbs = cFzbs;
    }

    public String getcMc() {
        return cMc;
    }

    public void setcMc(String cMc) {
        this.cMc = cMc;
    }

    public String getcSm() {
        return cSm;
    }

    public void setcSm(String cSm) {
        this.cSm = cSm;
    }

    public String getnXssx() {
        return nXssx;
    }

    public void setnXssx(String nXssx) {
        this.nXssx = nXssx;
    }

    public String getcBhSystem() {
        return cBhSystem;
    }

    public void setcBhSystem(String cBhSystem) {
        this.cBhSystem = cBhSystem;
    }

    public String getcScope() {
        return cScope;
    }

    public void setcScope(String cScope) {
        this.cScope = cScope;
    }

    public Map<String, String> getConfigMap() {
        return configMap;
    }

    public void setConfigMap(Map<String, String> configMap) {
        this.configMap = configMap;
    }

    public String getcMcApp() {
        return cMcApp;
    }

    public void setcMcApp(String cMcApp) {
        this.cMcApp = cMcApp;
    }

    public String getcMcSystem() {
        return cMcSystem;
    }

    public void setcMcSystem(String cMcSystem) {
        this.cMcSystem = cMcSystem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
