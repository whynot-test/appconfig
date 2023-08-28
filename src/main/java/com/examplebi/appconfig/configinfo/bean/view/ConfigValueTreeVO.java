package com.examplebi.appconfig.configinfo.bean.view;

import java.util.List;

/**
 * @ClassName ConfigValueTreeVO
 * @Description 配置树结构
 * @Author bijunjian
 * @Date 2023/8/22 0022 18:17
 * @Version 1.0
 **/
public class ConfigValueTreeVO {

    /**
     * 配置值编号
     */
    private String cBh;

    /**
     * 配置信息编号
     */
    private String cPzxbh;

    /**
     * 单位标识
     */
    private String id;

    /**
     * 父单位id
     */
    private String pId;

    /**
     * 环境标识
     */
    private  String cEnv;

    /**
     * 单位名称
     */
    private String name;

    /**
     * 配置值
     */
    private String cValue;

    /**
     * 单值/多值的配置翻译成中文
     */
    private String cValueName;

    /**
     * 是否有数据权限
     */
    private boolean hasRight;

    /**
     * 子单位配置
     */
    private List<ConfigValueTreeVO> children;

    public String getcBh() {
        return cBh;
    }

    public void setcBh(String cBh) {
        this.cBh = cBh;
    }

    public String getcPzxbh() {
        return cPzxbh;
    }

    public void setcPzxbh(String cPzxbh) {
        this.cPzxbh = cPzxbh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getcEnv() {
        return cEnv;
    }

    public void setcEnv(String cEnv) {
        this.cEnv = cEnv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcValue() {
        return cValue;
    }

    public void setcValue(String cValue) {
        this.cValue = cValue;
    }

    public String getcValueName() {
        return cValueName;
    }

    public void setcValueName(String cValueName) {
        this.cValueName = cValueName;
    }

    public boolean isHasRight() {
        return hasRight;
    }

    public void setHasRight(boolean hasRight) {
        this.hasRight = hasRight;
    }

    public List<ConfigValueTreeVO> getChildren() {
        return children;
    }

    public void setChildren(List<ConfigValueTreeVO> children) {
        this.children = children;
    }
}
