package com.nmefc.neargoos.service.inte;

import com.nmefc.neargoos.entity.document.DocumentTabEntity;
import com.nmefc.neargoos.middleModel.TabMidModel;

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

    /**
    * @Author : evaseemefly
    * @Description : 获取指定pid 以及 level 的所有tab以及子tab
    * @params :
    * @Date : 2019/10/19 11:35
    * @return :
    */
    List<DocumentTabEntity> getFullTabsByPidAndLevel(Long id);


    /**
    * @Author : evaseemefly
    * @Description :  根据parent的id获取一个 tab tree
    * @params :
    * @Date : 2019/10/19 17:33
    * @return :
    */
    TabMidModel getFullTabsByParent(Long id);


}
