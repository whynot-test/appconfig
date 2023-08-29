package com.examplebi.appconfig.common.exception;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月28日 22:43:58
 * @version: V1
 * @Description: 定义服务端响应异常消息
 * 配合http响应码使用
 */
public final class ExceptionMessage {

    public ExceptionMessage() {
        throw new IllegalStateException("Utility class");
    }

    public static final String NOT_MAINTAIN_CONFIG = "新增配置值所属配置信息不可维护";

    /**
     * code500
     */
    public static final String SC_INTERNAL_SERVER_ERROR = "Unable to complete the processing of the request";

    /**
     * 404
     */
    public static final String PARAM_IS_NULL_KEY_CORP = "存在必传参数为空,请检查:key（配置信息关键字）、corp（单位标识）";
    public static final String PARAM_IS_ERROR_KEY_GROUPID = "根据groupId（分组编号）:(%s)和key（配置信息关键字）:(%s)，无法获取到配置信息";
    /**
     * 404
     */
    public static final String IMPORT_PARAM_IS_NULL = "存在必传字段为空，导入失败! 请检查必传字段：编号、标识、名称;";
    /**
     * code:417
     */
    public static final String SC_EXPECTATION_FAILED = "未获取到要传入的配置值信息";

    /**
     * code:422
     */
    public static final String CHECK_ERROR = "必传参数为空或长度超出限度";
    /**
     * 校验配置值
     */
    public static final String CODE_ERROR = "存在配置值不在配置代码范围内";
    /**
     * 插入失败
     */
    public static final String INSERT_ERROR = "插入失败";
    /**
     * 更新失败
     */
    public static final String UPDATE_ERROR = "更新失败";
    /**
     * 移动失败
     */
    public static final String MOVE_ERROR = "移动失败";
    /**
     * 删除失败
     */
    public static final String DELETE_ERROR = "删除失败";
    /**
     * 经校验唯一性，存在重复
     */
    public static final String ISNOTUNIQUE = "经校验唯一性，存在重复";

    public static final String WRONG_PATH_VALUE = "请求API路径参数错误，错误参数为: %s。请按照接口文档规范调用接口。";

    public static final String SUCH_CONFIG_ISNULL_APP = "无法通过子系统编号：%s 找到对应的子系统，请检查子系统编号是否正确";

    public static final String SUCH_CONFIG_ISNULL_APP_BS = "无法通过子系统标识：%s 找到对应的子系统，请检查子系统标识是否正确";

    public static final String SUCH_CONFIG_ISNULL_GROUP = "该分组编号:%s不在编号为%s的子系统下，请检查分组编号是否正确";

    public static final String SUCH_CONFIG_ISNULL_GROUP_BS = "该分组标识:%s不在标识为%s的子系统下，请检查分组标识是否正确";

    public static final String NOT_EXIST_APP = "不存在的子系统标识：%s,请检查参数";

    public static final String NOT_EXIST_APP_CONFIG = "该子系统下无配置信息,请检查参数";

    public static final String NOT_EXIST_CONFIG_KEY = "不存在的配置信息关键字：%s,请检查参数";

    public static final String NOT_SUCH_CONFIG = "未查询到配置分组为【%s】，配置信息关键字为【%s】的配置，请检查是否初始化！";

    public static final String BOOLEAN_ERROR = "布尔值类型字段withDefault或withCorpPriority错误,请检查字段值是否为true或false！";

}