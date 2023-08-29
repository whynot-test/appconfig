/**
 * @projectName appconfig
 * @package com.examplebi.appconfig.group.dao.mapper
 * @className com.examplebi.appconfig.group.dao.mapper.GroupMapper
 * @copyright Copyright 2023 Thunisoft, Inc All rights reserved.
 */
package com.examplebi.appconfig.group.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.examplebi.appconfig.group.bean.Group;

/**
 * GroupMapper
 * @description
 * @author Administrator
 * @date 2023/8/28 23:09
 * @version TODO
 */
@Mapper
public interface GroupMapper {

    /**
     * 查询该系统下被引用的分组
     * @param appId 子系统id/
     * @return
     */
    List<Group> getBeQuoteGroupByAppId(@Param("appId") String appId);

    /**
     * 查询该系统下被引用的分组的数量
     * @param systemId 系统id
     * @return
     */
    Integer getBeQuoteGroupBySystemId(@Param("systemId") String systemId);

    /**
     * 更新系统编号
     * @param system 要更新的系统编号
     * @param appIds 子系统主键集合
     */
    void updateSystemInfoByAppIds(@Param("system")System system,@Param("appIds")List<String> appIds);

    /**
     * 删除系统下的分组
     * @param appId 子系统id
     */
    void deleteGroupByAppId(@Param("appId") String appId);

    /**
     * 新增分组
     * @param group
     */
    void insertGroup(Group group);

    /**
     * 根据编号查询分组
     * @param cBh 分组编号
     * @return
     */
    Group selectGroupByBhap(String cBh);

    /**
     * 根据分组编号集合查询分组
     * @param bhs 分组编号
     * @return
     */
    List<Group> selectGroupByBhs(List<String> bhs);

    /**
     * 根据子系统标识获取分组编号
     * @param appBs 子系统标识
     * @param cBs 分组标识
     * @return 分组编号
     */
    String selectGroupBhByBs(@Param("appBs")String appBs,@Param("cBs")String cBs);

    /**
     * 根据系统编号获取分组
     * @param xtdyBh
     * @return
     */
    List<Group> selectGroupByAppBh(@Param("xtdyBh") String xtdyBh,@Param("dMDB")boolean dmDataBase);
}