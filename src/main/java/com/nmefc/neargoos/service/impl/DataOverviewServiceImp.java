package com.nmefc.neargoos.service.impl;

import com.nmefc.neargoos.entity.data.DataOverviewEntity;
import com.nmefc.neargoos.exception.ServiceException;
import com.nmefc.neargoos.service.inte.DataOverviewService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("dataOverviewService")
public class DataOverviewServiceImp extends DataBaseServiceImp<DataOverviewEntity,Long> implements DataOverviewService {

    @Override
    public String check(DataOverviewEntity record, String response) throws ServiceException {
        return null;
    }

}
