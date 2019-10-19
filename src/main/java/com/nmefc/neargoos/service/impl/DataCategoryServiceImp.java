package com.nmefc.neargoos.service.impl;

import com.nmefc.neargoos.entity.data.DataCategoryEntity;
import com.nmefc.neargoos.exception.ServiceException;
import com.nmefc.neargoos.service.inte.DataBaseService;
import com.nmefc.neargoos.service.inte.DataCategoryService;
import org.springframework.stereotype.Service;

@Service("dataCategoryService")
public class DataCategoryServiceImp extends DataBaseServiceImp<DataCategoryEntity,Long> implements DataCategoryService<DataCategoryEntity,Long> {
    @Override
    public String check(DataCategoryEntity record, String response) throws ServiceException {
        return null;
    }
}
