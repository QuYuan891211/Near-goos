package com.nmefc.neargoos.service.impl;

import com.nmefc.neargoos.entity.data.DataBaseEntity;
import com.nmefc.neargoos.entity.data.DataCategoryEntity;
import com.nmefc.neargoos.exception.ServiceException;
import com.nmefc.neargoos.repository.inte.DataBaseRepository;
import com.nmefc.neargoos.service.inte.DataBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class DataBaseServiceImp<T extends DataBaseEntity,PK> implements DataBaseService<T,PK> {

    @Autowired
    protected DataBaseRepository<T,PK> dataBaseRepository;

//    /**
//     *@Description:找到所有未被删除的数据
//     *@Param: []
//     *@Return: java.util.List<T>
//     *@Author: quyua
//     *@Date: 2019/10/12 18:12
//     */
//    @Override
//    public List<T> findDataNotDelete(T example) {
//        List<T> dataList = dataBaseRepository.findAll();
//        dataList = dataList.stream().filter(item->item.getIsDelete()<1).collect(Collectors.toList());
////        List<T> dataList = dataBaseRepository.findByIsDeleteLessThan(1);
//
//        return dataList;
//    }
    /**
     *@Description: 数据信息条件查询（id,name及未被软删除）---> 用于查询数据总体介绍表，数据源表，海区表及数据类型表
     *@Param: [t, pageable]
     *@Return: org.springframework.data.domain.Page<T>
     *@Author: quyua
     *@Date: 2019/10/20 14:53
     */
    @Override
    public Page<T> findByBaseCondition(T t, Pageable pageable) {
        if (t == null || pageable == null){return null;}
        return dataBaseRepository.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicateList = new ArrayList<Predicate>();
            if(t.getName() != null && !t.getName().isEmpty()){
                predicateList.add(criteriaBuilder.equal(root.get("name"),t.getName()));
            }
            if (t.getId() != null){
                predicateList.add(criteriaBuilder.equal(root.get("id"),t.getId()));
            }
            predicateList.add(criteriaBuilder.lessThan(root.get("isDelete"),1));
            return criteriaQuery.where(predicateList.toArray(new Predicate[predicateList.size()])).getRestriction();
        },pageable);
    }

    public abstract String check(T record,String response) throws ServiceException;
}
