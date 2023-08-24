/**
 * @projectName appconfig
 * @package com.examplebi.appconfig.common.enums
 * @className com.examplebi.appconfig.common.enums.ResponseCode
 * @copyright Copyright 2023 Thunisoft, Inc All rights reserved.
 */
package com.examplebi.appconfig.common.enums;

import org.apache.commons.lang.StringUtils;

/**
 * ResponseCode
 * @description 相应code码
 * @author Administrator
 * @date 2023/8/23 23:49
 * @version TODO
 */
public enum ResponseCode {

    //[GET]：服务器成功返回用户请求的数据
    RESPONSE_200_OK("200", 200, "Ok"),
    //[POST/PUT/PATCH]：用户新建或修改数据成功。
    RESPONSE_201_CREATE("201", 201, "Created"),
    RESPONSE_201_UPDATED("201", 201, "Updated"),
    //[DELETE]：用户删除数据成功。
    RESPONSE_204_NO_CONTENT("204", 204, "No Content"),
    //[GET/POST/PUT/PATCH]：语义有误，当前请求无法被服务器理解
    RESPONSE_400_INVALID_REQUEST("400", 400, "Invalid Request"),

    RESPONSE_402_CONFIGURE(402, "配置问题，配置中心未依赖uim"),

    //用户发出的请求针对的是不存在的记录，服务器没有进行操作等的。
    RESPONSE_404_NOT_FOUND("404", 404, "Not Found"),

    RESPONSE_404_NOT_FOUND_PZXX("404", 404, "根据配置信息编号，无法获取到配置信息"),

    RESPONSE_404_NOT_FOUND_APPID("404", 404, "子系统编号不存在!"),

    RESPONSE_404_NOT_FOUND_FZBH("404", 404, "根据分组编号， 无法获取到分组信息"),

    RESPONSE_404_NOT_FOUND_XTBS("404", 404, "根据子系统标识， 无法获取到子系统编号"),

    RESPONSE_404_NOT_FOUND_DWBS("404", 404, "环境标识不存在！"),

    RESPONSE_404_NOT_FOUND_FZBH_KEY("404", 404, "根据分组编号和KEY，无法获取到配置信息"),

    //请求格式正确，但是由于含有语义错误，无法响应
    RESPONSE_409_DATA_COLLISION("409", 409, "数据冲突"),

    RESPONSE_409_PARAM_PZDM_DM_COLLISION(409, "配置代码代码字段不能重复!"),

    RESPONSE_409_PARAM_PZDM_DMSM_COLLISION(409, "配置代码代码说明字段不能重复!"),

    RESPONSE_422_PARAM_ERROR("422", 422, "参数错误"),

    RESPONSE_422_PARAM_PZDM_SCOPE_ERROR(422, "配置信息默认值不在配置代码范围内！"),

    RESPONSE_422_PARAM_NULL("422", 422, "必传参数为空！"),

    RESPONSE_422_AUTHORITY_NULL_PARAM("422", 422, "必填字段为空"),

    RESPONSE_422_PARAM_XGSJ_ERROR("422",422, "时间格式错误，应为 yyyy-MM-dd HH:mm:ss!"),

    RESPONSE_422_PARAM_FZBH_NULL("422",422, "分组编号不能为空!"),

    RESPONSE_422_PARAM_GROUP_NOT_APP("422",422, "分组不在子系统下!"),

    RESPONSE_422_PARAM_XTBS_NULL("422",422, "子系统标识不能为空!"),

    RESPONSE_422_PARAM_CKEY_NOT_RULE("422",422, "参数ckey不符合规则（只支持数字、字母、下划线、中划线、点）!"),

    RESPONSE_422_PARAM_CMC_NOT_RULE("422",422, "参数cmc不符合规则（只支持数字、字母、下划线、中划线、点、汉字）!"),

    RESPONSE_422_PARAM_CKEY_SAME("422",422, "配置项ckey不能重复!"),

    RESPONSE_422_PARAM_CKEY_NOT("422",422, "配置项ckey不存在!"),

    RESPONSE_422_PARAM_FZBH_CKEY_NOT("422",422, "分组下，配置项ckey不存在!"),

    RESPONSE_422_PARAM_PAGE_NULL("422",422, "分页参数不能为空!"),

    RESPONSE_422_PARAM_PAGE_INVALID("422",422, "无效的分页参数，分页参数必须为正数"),

    RESPONSE_422_PARAM_CBH_NULL("422",422, "配置信息编号不能为空!"),

    RESPONSE_422_PARAM_XSLX_NOT("422",422, "显示类型不能修改!"),

    RESPONSE_422_PARAM_KEY_NOT("422",422, "关键字key不能修改!"),

    RESPONSE_422_PARAM_KEY_ERROR("422",422, "关键字ckey错误!"),

    RESPONSE_422_PARAM_PZDM_DM_NULL("422",422, "配置代码代码字段不能为空!"),

    RESPONSE_422_PARAM_PZDM_DM_ERROR("422",422, "配置代码代码字段不符合规则（只支持数字、字母、下划线、中划线、点）!"),

    RESPONSE_422_PARAM_PZDM_DMSM_NULL("422",422, "配置代码说明不能为空!"),

    RESPONSE_422_PARAM_PZDM_DMSM_ERROR("422",422, "配置代码代码说明字段不符合规则（只支持数字、字母、下划线、中划线、点、汉字）!"),

    RESPONSE_522_PARAM_UPDATE_ERROR("500",500, "Updated Error"),

    RESPONSE_422_PARAM_PZZ_NULL("422",422, "配置值不能为空!"),

    RESPONSE_422_PARAM_PZZCBH_NULL("422",422, "配置值编号不能为空!"),

    RESPONSE_422_PARAM_SORT_ILLEGAL("422",422, "排序字段不合法"),

    //服务器发生错误，用户将无法判断发出的请求是否成功
    RESPONSE_500_INTERNAL_SERVER_ERROR("500", 500, "Internal Server Error");

    private Integer status;

    private String code;

    private String data;

    ResponseCode(Integer status, String data) {
        this.status = status;
        this.data = data;
    }

    ResponseCode(String code, Integer status, String data) {
        this.code = code;
        this.status = status;
        this.data = data;
    }

    public static ResponseCode getRequestCode(String code) {
        for (ResponseCode rs : values()) {
            if (StringUtils.equals(rs.code, code)) {
                return rs;
            }
        }
        throw new IllegalArgumentException("No matching constant for [" + code + "]");
    }

    public String getCode() {
        return code;
    }

    public String getData() {
        return data;
    }

    public Integer getStatus() {
        return status;
    }

}
