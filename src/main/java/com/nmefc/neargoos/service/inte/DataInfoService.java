package com.nmefc.neargoos.service.inte;

import com.nmefc.neargoos.entity.data.*;
import com.nmefc.neargoos.middleModel.DataInfoQueryModel;
import com.nmefc.neargoos.middleModel.DataInfoResultModel;
import com.nmefc.neargoos.middleModel.DataInfoStatisticsModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

public interface DataInfoService extends DataBaseService<DataDataInfoEntity,Long> {
    /**
     *@Description: 根据查询条件查询，返回数据列表
     *@Param: [dataInfoQueryModel]
     *@Return: java.util.List<com.nmefc.neargoos.middleModel.DataInfoResultModel>
     *@Author: quyua
     *@Date: 2019/12/27 18:32
     */
    List<DataDataInfoEntity> findByBaseCondition(DataInfoQueryModel dataInfoQueryModel);
    List<DataRecordEntity> findDataRecordByDataInfoId(Long id);
    DataInfoStatisticsModel statisticsByCategory(DataInfoQueryModel dataInfoQueryModel);
    DataInfoResultModel dataDataInfoEntity2dataInfoResultModel(List<DataAreaEntity> dataAreaEntityList, List<DataCategoryEntity> dataCategoryEntityList, List<DataSourceEntity> dataSourceEntityList, DataDataInfoEntity dataDataInfoEntity);
}
