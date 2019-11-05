package com.nmefc.neargoos.service.inte;
import com.nmefc.neargoos.entity.document.DocumentBaseEntity;

import java.util.List;

/**
* @Author : evaseemefly
* @Description : 
* @params : 
* @Date : 2019/10/19 21:24 
* @return : 
*/
public interface DocumentBaseService {
    /**
    * @Author : evaseemefly
    * @Description :  根据 tab 的 id 获取对应的DocumentBase list
    * @params :
    * @Date : 2019/10/19 21:34
    * @return :
    */
    List<DocumentBaseEntity> getBaseByTab(Long id);

}
