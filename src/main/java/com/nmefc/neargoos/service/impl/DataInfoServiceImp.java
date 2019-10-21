package com.nmefc.neargoos.service.impl;

import com.nmefc.neargoos.common.utils.DateTimeUtils;
import com.nmefc.neargoos.entity.data.DataDataInfoEntity;
import com.nmefc.neargoos.exception.ServiceException;
import com.nmefc.neargoos.middleModel.DataInfoQueryModel;
import com.nmefc.neargoos.repository.inte.DataInfoRepository;
import com.nmefc.neargoos.service.inte.DataInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Predicate;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *@Description: 数据信息的服务实现类
 *@Param:
 *@Return:
 *@Author: quyua
 *@Date: 2019/10/20 22:51
 */
@Service("/dataInfoService")
public class DataInfoServiceImp extends DataBaseServiceImp<DataDataInfoEntity,Long> implements DataInfoService {

    @Autowired
    protected DataInfoRepository dataBaseRepository;
    @Override
    public String check(DataDataInfoEntity record, String response) throws ServiceException {
        return null;
    }

    /**
     *@Description:
     *@Param: [dataDataInfoEntity, beginTime, endTime, pageable]
     *@Return: org.springframework.data.domain.Page<com.nmefc.neargoos.entity.data.DataDataInfoEntity>
     *@Author: quyua
     *@Date: 2019/10/20 22:44
     */
    public Page<DataDataInfoEntity> findByBaseCondition(DataInfoQueryModel dataInfoQueryModel, Pageable pageable) {
        if (pageable == null){return null;}
        return dataBaseRepository.findAll((root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicateList = new ArrayList<Predicate>();
//            1.根据海区的条件
            if (dataInfoQueryModel.getAreaId() != null){
                predicateList.add(criteriaBuilder.equal(root.get("areaId"),dataInfoQueryModel.getAreaId() ));
            }
//            2.根据数据类型的条件
            if (dataInfoQueryModel.getCategoryId()!= null){
                predicateList.add(criteriaBuilder.equal(root.get("categoryId"),dataInfoQueryModel.getCategoryId()));
            }
//            3.根据起始时间和结束时间

            if (dataInfoQueryModel.getBeginTime() !=null && dataInfoQueryModel.getEndTime() !=null) {

                predicateList.add(criteriaBuilder.between(root.get("date"), DateTimeUtils.date2timestamp(dataInfoQueryModel.getBeginTime()), DateTimeUtils.date2timestamp(dataInfoQueryModel.getEndTime())));
            }
//            4.根据数据源
            if (dataInfoQueryModel.getSourceId() != null){
                predicateList.add(criteriaBuilder.equal(root.get("sourceId"),dataInfoQueryModel.getSourceId()));
            }
            predicateList.add(criteriaBuilder.lessThan(root.get("isDelete"),1));
            return criteriaQuery.where(predicateList.toArray(new Predicate[predicateList.size()])).getRestriction();
        },pageable);
    }
}
