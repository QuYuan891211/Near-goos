package com.nmefc.neargoos.service.impl;

import com.nmefc.neargoos.entity.document.ContentBaseAssociationEntity;
import com.nmefc.neargoos.entity.document.DocumentContentEntity;
import com.nmefc.neargoos.repository.ContentBaseAssociationRepository;
import com.nmefc.neargoos.repository.DocumentBaseRepository;
import com.nmefc.neargoos.service.inte.DocumentContentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: DELL
 * \* Date: 2019/10/22
 * \* Time: 15:38
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Service
public class DocumentContentServiceImpl implements DocumentContentService {

    @Resource
    private DocumentBaseRepository documentBaseRepository;

    @Resource
    private ContentBaseAssociationRepository contentBaseAssociationRepository;
    /**
    * @Author : evaseemefly
    * @Description : 根据base id找到对应的content
    * @params :
    * @Date : 2019/10/22 15:50
    * @return :
    */
    @Override
    public List<DocumentContentEntity> getContentByBase(long id) {
        List<ContentBaseAssociationEntity> byBidList = contentBaseAssociationRepository.findByBid(id);
        List<DocumentContentEntity> list=new ArrayList<>();
        if(byBidList.size()>0){
            // 直接根据关联表的映射直接获取
            byBidList.forEach(temp->{
                list.add(temp.getDocumentContentByCid());
            });
        }
        return list;
    }
}
