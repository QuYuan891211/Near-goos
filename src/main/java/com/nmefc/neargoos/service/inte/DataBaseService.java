package com.nmefc.neargoos.service.inte;

import com.nmefc.neargoos.entity.data.DataBaseEntity;

import java.util.List;

/**
 *@Description:所有Data服务的接口
 *@Param: 实体及主键类型
 *@Return:
 *@Author: quyua
 *@Date: 2019/10/12 16:26
 */
public interface DataBaseService<T extends DataBaseEntity, PK> {

    /**
     *@Description: 找到所有没有被软删除的数据
     *@Param: []
     *@Return: java.util.List<com.nmefc.neargoos.entity.data.DataOverviewEntity>
     *@Author: quyua
     *@Date: 2019/10/12 17:18
     */
    List<T> findDataNotDelete(T example);
}
