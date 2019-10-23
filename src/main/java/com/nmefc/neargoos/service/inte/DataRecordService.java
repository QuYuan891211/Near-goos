package com.nmefc.neargoos.service.inte;

import com.nmefc.neargoos.entity.data.DataDataInfoEntity;
import com.nmefc.neargoos.entity.data.DataRecordEntity;

import java.util.List;

public interface DataRecordService extends DataBaseService<DataRecordEntity,Long> {
    List<DataDataInfoEntity> findDataInfoByDataRecordId(Long rid);
            //[to-do] 加入根据用户ID查询下载数据
}
