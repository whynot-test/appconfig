package com.examplebi.appconfig.group.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月28日 22:57:39
 * @version: V1
 * @Description: 原来的app实体中关联的分组实体时map的，list容易实现返回可引用的分组
 */
public class MovableAppVO implements Serializable {

    private static final long serialVersionUID  = 3419634231019462465L;

    /**
     * 子系统主键
     */
    private String cBh;

    /**
     * 子系统名称
     */
    private String cMc;

    /**
     * 关联的分组实体集合
     */
    private List<Group> groups;

    public String getcBh() {
        return cBh;
    }

    public void setcBh(String cBh) {
        this.cBh = cBh;
    }

    public String getcMc() {
        return cMc;
    }

    public void setcMc(String cMc) {
        this.cMc = cMc;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}