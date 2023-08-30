/**
 * @projectName appconfig
 * @package com.examplebi.appconfig.configinfo.dao.mapper
 * @className com.examplebi.appconfig.configinfo.dao.mapper.ConfigCodeMapper
 * @copyright Copyright 2023 Thunisoft, Inc All rights reserved.
 */
package com.examplebi.appconfig.configinfo.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.examplebi.appconfig.configinfo.ConfigCode;

/**
 * ConfigCodeMapper
 * @description
 * @author Administrator
 * @date 2023/8/30 23:20
 * @version TODO
 */
@Mapper
public interface ConfigCodeMapper {
    List<ConfigCode> selectAllConfigCode();
}