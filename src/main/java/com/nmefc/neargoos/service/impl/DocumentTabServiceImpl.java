package com.nmefc.neargoos.service.impl;

import com.nmefc.neargoos.entity.document.DocumentTabEntity;
import com.nmefc.neargoos.repository.DocumentTabRepository;
import com.nmefc.neargoos.service.inte.DocumentTabService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DocumentTabServiceImpl implements DocumentTabService {
    @Resource
    private DocumentTabRepository documentTabRepository;

    /**
     * @return :
     * @Author : evaseemefly
     * @Description : 获取所有tab list
     * @params :
     * @Date : 2019/10/13 4:31 下午
     */
    @Override
    public List<DocumentTabEntity> getAllTab() {

        return documentTabRepository.findAll();
//        return null;
    }

    /**
     * @return :
     * @Author : evaseemefly
     * @Description : 获取所有的 1级 tab list
     * @params :
     * @Date : 2019/10/13 4:33 下午
     */
    @Override
    public List<DocumentTabEntity> getPrimaryTab() {
        List<DocumentTabEntity> list=documentTabRepository.findByLevel(1);
        return list;
    }

    /**
     * @return :
     * @Author : evaseemefly
     * @Description : 获取指定level的tab list
     * @params :
     * @Date : 2019/10/13 4:34 下午
     */
    @Override
    public List<DocumentTabEntity> getTargetLevelTab() {
        return null;
    }
}
