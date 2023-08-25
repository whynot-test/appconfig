package com.examplebi.appconfig.common.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.examplebi.appconfig.configuration.DataSourceConfiguration;

/**
 * @Author: bijunjian
 * @createTime: 2023年08月24日 23:01:03
 * @version: V1
 * @Description: baseDao
 */
@Repository
public class BaseDao {

    @Autowired
    private DataSourceConfiguration dataSourceConfiguration;

    protected <T> List<List<T>> getBatchLists(List<T> dataList) {
        return getBatchLists(dataList, 100);
    }

    protected <T> List<List<T>> getBatchLists(List<T> dataList, boolean isDM) {
        int groupSize = isDM ? 14 : 100;
        return getBatchLists(dataList, groupSize);
    }

    private <T> List<List<T>> getBatchLists(List<T> dataList, int size) {
        List<List<T>> resultList = new ArrayList<>();
        int groupSize = size;
        int listSize = dataList.size();
        for (int startIndex = 0; startIndex < listSize; ) {
            //如果单个批次数据不够groupSize 分组大小,那个截取集合时值截取到有数据的部分
            if (startIndex + groupSize > listSize) {
                groupSize = listSize - startIndex;
            }
            List<T> subList = dataList.subList(startIndex, startIndex + groupSize);
            resultList.add(subList);
        }
        return resultList;
    }

    protected boolean isDmDataBase() {
        return dataSourceConfiguration.isDmDataBase();
    }
}