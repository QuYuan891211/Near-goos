package com.nmefc.neargoos.service.inte;

import com.nmefc.neargoos.entity.data.DataDataInfoEntity;
import com.nmefc.neargoos.entity.data.DataRecordEntity;
import com.nmefc.neargoos.middleModel.DataInfoQueryModel;
import com.nmefc.neargoos.middleModel.DataInfoStatisticsModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

public interface DataInfoService extends DataBaseService<DataDataInfoEntity,Long> {
    List<DataDataInfoEntity> findByBaseCondition(DataInfoQueryModel dataInfoQueryModel);
    List<DataRecordEntity> findDataRecordByDataInfoId(Long id);
    DataInfoStatisticsModel statisticsByCategory(DataInfoQueryModel dataInfoQueryModel);
}
