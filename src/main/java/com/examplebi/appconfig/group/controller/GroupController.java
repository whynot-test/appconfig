package com.examplebi.appconfig.group.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examplebi.appconfig.common.bean.AppconfigResponse;
import com.examplebi.appconfig.common.enums.ResponseCode;
import com.examplebi.appconfig.common.utils.ResponseUtil;
import com.examplebi.appconfig.group.bean.Group;
import com.examplebi.appconfig.group.service.GroupService;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月28日 23:24:45
 * @version: V1
 * @Description:
 */
@RestController
@RequestMapping("/api")
public class GroupController {

    @Autowired
    private GroupService groupService;

    private static final Logger logger = LoggerFactory.getLogger(GroupController.class);

    /**
     * 保存分组
     * @param group 分组
     * @return
     *
     */
    @PostMapping(value = "/v3/groups",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String saveGroup(@RequestBody Group group) {
        if (!groupService.checkUniqueNameAndMark(group)) {
            return ResponseUtil.toString(new AppconfigResponse(ResponseCode.RESPONSE_409_DATA_COLLISION, String.format("传入参数名称或标识已经存在")));
        }

        return "";
    }
}