/**
 * @projectName appconfig
 * @package com.examplebi.appconfig.system.dao.mapper
 * @className com.examplebi.appconfig.system.dao.mapper.SystemMapper
 * @copyright Copyright 2023 Thunisoft, Inc All rights reserved.
 */
package com.examplebi.appconfig.system.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.examplebi.appconfig.system.bean.System;

/**
 * SystemMapper
 * @description
 * @author Administrator
 * @date 2023/8/26 13:40
 * @version TODO
 */
@Mapper
public interface SystemMapper {

    /**
     * 新增系统
     * @param system
     */
    void insertSystem(System system);

    /**
     * 删除系统
     * @param id 系统主键
     */
    void deleteSystemById(String id);

    /**
     * 更新系统
     * @param system
     */
    void updateSystemById(System system);

    /**
     * 根据系统id查询系统
     * @param systemId
     * @return
     */
    System selectSystemBySystemId(String systemId);

    /**
     * 根据系统编号集合
     * 查询系统信息
     * @param ids
     * @return
     */
    List<System> selectSystemByIds(@Param("ids") List<String> ids);

    /**
     * 查询所有系统
     * @param dmDatabase
     * @return
     */
    List<System> selectAllSystem(@Param("dMDB")boolean dmDatabase);

    /**
     * 根据权限和名字查询系统
     * @param userId
     * @param name
     * @param dmDataBase
     * @return
     */
    List<System> selectSystem(@Param("userId") String userId,@Param("name") String name,@Param("dMDB") boolean dmDataBase);

}