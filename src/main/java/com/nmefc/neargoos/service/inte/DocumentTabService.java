package com.nmefc.neargoos.service.inte;

import com.nmefc.neargoos.entity.document.DocumentTabEntity;

import java.util.List;

public interface DocumentTabService {

    /**
    * @Author : evaseemefly
    * @Description : 获取所有tab list
    * @params : 
    * @Date : 2019/10/13 4:31 下午 
    * @return : 
    */
    List<DocumentTabEntity> getAllTab();

    /**
    * @Author : evaseemefly
    * @Description : 获取所有的 1级 tab list
    * @params :
    * @Date : 2019/10/13 4:33 下午
    * @return :
    */
    List<DocumentTabEntity> getPrimaryTab();

    /**
    * @Author : evaseemefly
    * @Description : 获取指定level的tab list
    * @params :
    * @Date : 2019/10/13 4:34 下午
    * @return :
    */
    List<DocumentTabEntity> getTargetLevelTab(Integer level);
}
