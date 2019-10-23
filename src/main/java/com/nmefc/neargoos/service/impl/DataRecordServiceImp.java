package com.nmefc.neargoos.service.impl;

import com.nmefc.neargoos.entity.data.DataDataInfoEntity;
import com.nmefc.neargoos.entity.data.DataRecordEntity;
import com.nmefc.neargoos.entity.data.DatainfoRecordAssociationEntity;
import com.nmefc.neargoos.exception.ServiceException;
import com.nmefc.neargoos.repository.inte.DataRecordAssociationRepository;
import com.nmefc.neargoos.repository.inte.DataRecordRepository;
import com.nmefc.neargoos.service.inte.DataBaseService;
import com.nmefc.neargoos.service.inte.DataRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service("dataRecordService")
public class DataRecordServiceImp extends DataBaseServiceImp<DataRecordEntity,Long> implements DataRecordService {
    @Autowired
    protected DataRecordAssociationRepository dataRecordAssociationRepository;
    @Override
    public String check(DataRecordEntity record, String response) throws ServiceException {
        return null;
    }
    /**
     *@Description: 根据记录ID查找对应的下载数据
     *@Param: [rid]
     *@Return: java.util.List<com.nmefc.neargoos.entity.data.DataDataInfoEntity>
     *@Author: quyua
     *@Date: 2019/10/24 1:35
     */

    @Override
    public List<DataDataInfoEntity> findDataInfoByDataRecordId(Long rid) {
//        Optional<DataRecordEntity> dataRecordEntityOptional = dataRecordRepository.findById(id);
        List<DatainfoRecordAssociationEntity> datainfoRecordAssociationEntityList = dataRecordAssociationRepository.findByRid(rid);
        List<DataDataInfoEntity> dataDataInfoEntityList = datainfoRecordAssociationEntityList.stream().map(item->item.getDataDataInfoByDid()).collect(Collectors.toList());
        //去掉软删除的
        return dataDataInfoEntityList.stream().filter(item->item.getIsDelete() < 1).collect(Collectors.toList());

    }
}
