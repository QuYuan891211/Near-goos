package com.nmefc.neargoos.service.inte;

import com.nmefc.neargoos.entity.document.DocumentImageEntity;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: evaseemefly
 * \* Date: 2019/10/20
 * \* Time: 19:52
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public interface DocumentImageService {
    /**
    * @Author : evaseemefly
    * @Description : 根据 documentBase 的id 获取对应的image
    * @params :
    * @Date : 2019/10/20 19:56
    * @return :
    */
    List<DocumentImageEntity> getImageByBase(Long id);
}
