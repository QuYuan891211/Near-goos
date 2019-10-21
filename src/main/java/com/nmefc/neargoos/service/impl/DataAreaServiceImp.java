package com.nmefc.neargoos.service.impl;


import com.nmefc.neargoos.entity.data.DataAreaEntity;
import com.nmefc.neargoos.exception.ServiceException;
import com.nmefc.neargoos.service.inte.DataAreaService;
import org.springframework.stereotype.Service;

@Service("dataAreaService")
public class DataAreaServiceImp extends DataBaseServiceImp<DataAreaEntity,Long> implements DataAreaService {
    @Override
    public String check(DataAreaEntity record, String response) throws ServiceException {
        return null;
    }
}
