package com.examplebi.appconfig.group.service;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examplebi.appconfig.group.bean.Group;
import com.examplebi.appconfig.group.dao.GroupDao;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月28日 23:27:31
 * @version: V1
 * @Description:
 */
@Service
public class GroupService {

    @Autowired
    private GroupDao groupDao;

    /**
     * 检查分组名称和标识的唯一性
     *
     * @param group
     * @return
     */
    public boolean checkUniqueNameAndMark(Group group) {

        List<Group> listGroup = groupDao.getAppGroupByAppBh(group.getcBhZxtdy());
        return this.checkUniqueNameAndMark(group, listGroup);

    }

    /**
     * 检验分组标识的唯一性
     *
     * @param group
     * @param listGroup
     * @return
     */
    public boolean checkUniqueNameAndMark(Group group, List<Group> listGroup) {
        if (CollectionUtils.isEmpty(listGroup)) {
            return true;
        }
        //修改分组排除当前分组信息
        for (Group metaGroup : listGroup) {
            if (StringUtils.equals(metaGroup.getcBh(), group.getcBh())) {
                continue;
            }
            //判断名称、标识、是否有重复
            if (StringUtils.isNotBlank(metaGroup.getcMc()) && StringUtils.equals(metaGroup.getcMc(), group.getcMc()) ||
                    StringUtils.isNotBlank(metaGroup.getcFzbs()) && StringUtils.equals(metaGroup.getcFzbs(), group.getcFzbs())) {
                return false;
            }

        }
        return true;
    }
}