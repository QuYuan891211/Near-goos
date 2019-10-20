package com.nmefc.neargoos.service.impl;

import com.nmefc.neargoos.entity.data.DataSourceEntity;
import com.nmefc.neargoos.exception.ServiceException;
import com.nmefc.neargoos.service.inte.DataSourceService;
import org.springframework.stereotype.Service;

@Service("dataSourceService")
public class DataSourceServiceImp extends DataBaseServiceImp<DataSourceEntity,Long> implements DataSourceService {
    @Override
    public String check(DataSourceEntity record, String response) throws ServiceException {
        return null;
    }
}
