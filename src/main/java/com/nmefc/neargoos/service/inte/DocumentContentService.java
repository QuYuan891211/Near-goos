package com.nmefc.neargoos.service.inte;

import com.nmefc.neargoos.entity.document.DocumentContentEntity;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: evaseemefly
 * \* Date: 2019/10/22
 * \* Time: 15:07
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public interface DocumentContentService {
    /**
    * @Author : evaseemefly
    * @Description : 根据base id找到对应的content
    * @params :
    * @Date : 2019/10/22 15:50
    * @return :
    */
    List<DocumentContentEntity> getContentByBase(long id);
}
