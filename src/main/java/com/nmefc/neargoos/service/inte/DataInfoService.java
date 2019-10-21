package com.nmefc.neargoos.service.inte;

import com.nmefc.neargoos.entity.data.DataDataInfoEntity;
import com.nmefc.neargoos.middleModel.DataInfoQueryModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.sql.Timestamp;

public interface DataInfoService extends DataBaseService<DataDataInfoEntity,Long> {
    Page<DataDataInfoEntity> findByBaseCondition(DataInfoQueryModel dataInfoQueryModel, Pageable pageable);
}
