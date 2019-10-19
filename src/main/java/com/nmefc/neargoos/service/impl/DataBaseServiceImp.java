package com.nmefc.neargoos.service.impl;

import com.nmefc.neargoos.entity.data.DataBaseEntity;
import com.nmefc.neargoos.exception.ServiceException;
import com.nmefc.neargoos.repository.inte.DataBaseRepository;
import com.nmefc.neargoos.service.inte.DataBaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public abstract class DataBaseServiceImp<T extends DataBaseEntity,PK> implements DataBaseService<T,PK> {

    @Autowired
    protected DataBaseRepository<T,PK> dataBaseRepository;

    /**
     *@Description:找到所有未被删除的数据
     *@Param: []
     *@Return: java.util.List<T>
     *@Author: quyua
     *@Date: 2019/10/12 18:12
     */
    @Override
    public List<T> findDataNotDelete(T example) {
        List<T> dataList = dataBaseRepository.findAll();
        dataList = dataList.stream().filter(item->item.getIsDelete()<1).collect(Collectors.toList());
//        List<T> dataList = dataBaseRepository.findByIsDeleteLessThan(1);

        return dataList;
    }

    public abstract String check(T record,String response) throws ServiceException;
}
