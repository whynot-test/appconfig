package com.examplebi.appconfig.group.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.examplebi.appconfig.common.dao.BaseDao;
import com.examplebi.appconfig.group.bean.Group;
import com.examplebi.appconfig.group.dao.mapper.GroupMapper;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月28日 23:07:17
 * @version: V1
 * @Description: 配置分组DAO
 */
@Repository
public class GroupDao extends BaseDao {

    @Autowired
    private GroupMapper groupMapper;
    /**
     * 根据子系统编号获取分组信息
     * @param xtdyBh 子系统定义
     * @return
     */
    public List<Group> getAppGroupByAppBh(String xtdyBh) {
        return groupMapper.selectGroupByAppBh(xtdyBh,isDmDataBase());
    }
}