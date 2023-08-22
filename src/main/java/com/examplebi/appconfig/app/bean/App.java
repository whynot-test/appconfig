package com.examplebi.appconfig.app.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.Map;

/**
 * @ClassName APP
 * @Description 子系统信息实体bean
 * @Author bijunjian
 * @Date 2023/8/22 0022 15:44
 * @Version 1.0
 **/
public class App implements Serializable, Cloneable {

    private static Logger logger = LoggerFactory.getLogger(App.class);

    private static final long serialVersionUID = -5838268016063612520L;

    /**
     * 编号
     */
    private String cBH;

    /**
     * 子系统标识
     */
    private String cXtbs;

    /**
     * 子系统名称
     */
    private String cMc;

    /**
     * 子系统说明
     */
    private String cSm;

    /**
     * 显示顺序
     */
    private Integer nXssx;

    /**
     * 系统主键
     */
    private String cBhSystem;
    /**
     * 负责人
     */
    private String cFzr;

    /**
     * 研发部门
     */
    private String cYfbm;

    /**
     * 系统名称systemNAMe
     * 查询系统和子系统时使用
     */
    private String cMcSystem;

    /**
     * 当前子系统下所有分组，用于构建 子系统-分组 结构
     * key为分组的主键，value为分组对象
     */
    private Map<String, String> configGroupMap;

    /**
     * 配置信息移动记录（导入，导出）
     * key：移动记录主键，value：移动记录对象
     */
    private Map<String, String> configMoveMap;

    public App() {
    }

    /**
     * selectAppsByParam 根据参数查询子系统
     *
     * @param cXtbs     子系统标识
     * @param cMc       名称
     * @param cBhSystem 系统编号
     */
    public App(String cXtbs, String cMc, String cBhSystem) {
        this.cXtbs = cXtbs;
        this.cMc = cMc;
        this.cBhSystem = cBhSystem;
    }

    /**
     * 导入构建子系统
     *
     * @param cBH   标号
     * @param cXtbs 系统标识
     * @param cMc   名称
     * @param cSm   说明
     * @param nXssx 显示顺序
     */
    public App(String cBH, String cXtbs, String cMc, String cSm, Integer nXssx) {
        this.cBH = cBH;
        this.cXtbs = cXtbs;
        this.cMc = cMc;
        this.cSm = cSm;
        this.nXssx = nXssx;
    }

    public static Logger getLogger() {
        return logger;
    }

    public static void setLogger(Logger logger) {
        App.logger = logger;
    }

    public String getcBH() {
        return cBH;
    }

    public void setcBH(String cBH) {
        this.cBH = cBH;
    }

    public String getcXtbs() {
        return cXtbs;
    }

    public void setcXtbs(String cXtbs) {
        this.cXtbs = cXtbs;
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

    public Integer getnXssx() {
        return nXssx;
    }

    public void setnXssx(Integer nXssx) {
        this.nXssx = nXssx;
    }

    public String getcBhSystem() {
        return cBhSystem;
    }

    public void setcBhSystem(String cBhSystem) {
        this.cBhSystem = cBhSystem;
    }

    public String getcFzr() {
        return cFzr;
    }

    public void setcFzr(String cFzr) {
        this.cFzr = cFzr;
    }

    public String getcYfbm() {
        return cYfbm;
    }

    public void setcYfbm(String cYfbm) {
        this.cYfbm = cYfbm;
    }

    public String getcMcSystem() {
        return cMcSystem;
    }

    public void setcMcSystem(String cMcSystem) {
        this.cMcSystem = cMcSystem;
    }

    public Map<String, String> getConfigGroupMap() {
        return configGroupMap;
    }

    public void setConfigGroupMap(Map<String, String> configGroupMap) {
        this.configGroupMap = configGroupMap;
    }

    public Map<String, String> getConfigMoveMap() {
        return configMoveMap;
    }

    public void setConfigMoveMap(Map<String, String> configMoveMap) {
        this.configMoveMap = configMoveMap;
    }


    @Override
    public App clone() {
        App app = null;
        try {
            App clone = (App) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            logger.error("克隆App失败",e);
        }
        return app;
    }
}
