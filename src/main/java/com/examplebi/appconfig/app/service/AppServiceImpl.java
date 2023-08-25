package com.examplebi.appconfig.app.service;

import com.examplebi.appconfig.app.bean.App;
import com.examplebi.appconfig.app.bean.MoveAppParam;

import java.util.List;
import java.util.Map;

/**
 * @ClassName AppServiceImpl
 * @Description 子系统实现类
 * @Author bijunjian
 * @Date 2023/8/25 0025 18:30
 * @Version 1.0
 **/
public class AppServiceImpl implements AppService{
    /**
     * 根据当前登录人员ID和所在系统id
     * 查询该用户除当前系统外，其他系统下的子系统
     *
     * @param userID   当前登陆人id
     * @param systemId 系统主键
     * @return
     */
    @Override
    public List<App> getCanMoveApp(String userID, String systemId) {
        return null;
    }

    /**
     * 根据子系统编号更新子系统以及子系统下分组，配置信息的系统的编号
     *
     * @param moveAppParams 子系统VO
     * @param system        需要修改的系统
     */
    @Override
    public void moveApp(List<MoveAppParam> moveAppParams, System system) {

    }

    /**
     * 查询根据systemId,name,bs
     *
     * @param param param systemID,name.bs
     * @return
     */
    @Override
    public List<App> selectAppsByParam(Map<String, String> param) {
        return null;
    }

    /**
     * 根据系统id
     * 查询系统下应用数量（导入校验用）
     *
     * @param systemId 系统主键
     * @return
     */
    @Override
    public Integer selectBySystemId(String systemId) {
        return null;
    }

    /**
     * 根据子系统名称模糊查询子系统信息
     * 查询
     *
     * @param param 名称
     * @return
     */
    @Override
    public List<App> selectAppByMc(Map<String, String> param) {
        return null;
    }

    /**
     * 查询同一系统下是否同名同标识
     *
     * @param app 子系统
     * @return boolean
     */
    @Override
    public boolean isUniqueByMcAndBs(App app) {
        return false;
    }

    /**
     * 根据子系统主键查询子系统
     *
     * @param ids 子系统主键
     * @return
     */
    @Override
    public List<App> selectAppsByIds(List<String> ids) {
        return null;
    }

    /**
     * 根据子系统主键
     * 删除子系统以及子系统下分组 分组引用 配置信息 配置值
     *
     * @param id 子系统主键
     */
    @Override
    public void delectAppAndSubById(String id) {

    }

    /**
     * 根据子系统主键
     * 删除子系统 及子系统下 分组 分组引用 配置信息 配置值
     *
     * @param systemId 子系统id
     */
    @Override
    public void delectAppBySystemId(String systemId) {

    }

    /**
     * 判断是否存在相同appBs，主键不同的app
     *
     * @param app
     * @return
     */
    @Override
    public Boolean isExistDifferenceAppBh(App app) {
        return null;
    }

    /**
     * 根据appBh获取子系统
     *
     * @param appBh
     * @return
     */
    @Override
    public App getAppByAppBh(String appBh) {
        return null;
    }

    /**
     * 更新子系统
     *
     * @param app 子系统
     */
    @Override
    public void updateApp(App app) {

    }

    /**
     * 更新子系统并更新子系统下的分组的子系统名称
     *
     * @param app    更新的app
     * @param oldApp 被跟新的app
     */
    @Override
    public void updateAppAndAppNameInGroup(App app, App oldApp) {

    }

    /**
     * 新增子系统
     *
     * @param app
     */
    @Override
    public void insertApp(App app) {

    }
}
