package com.nmefc.neargoos.service.impl;

import com.nmefc.neargoos.entity.data.DataCategoryEntity;
import com.nmefc.neargoos.exception.ServiceException;
import com.nmefc.neargoos.service.inte.DataCategoryService;
import org.springframework.stereotype.Service;

@Service("dataCategoryService")
public class DataCategoryServiceImp extends DataBaseServiceImp<DataCategoryEntity,Long> implements DataCategoryService {
    //暂时不用统一的数据校验
    @Override
    public String check(DataCategoryEntity record, String response) throws ServiceException {
        if(record == null){return "entity is null";}
        return response;
    }
}
