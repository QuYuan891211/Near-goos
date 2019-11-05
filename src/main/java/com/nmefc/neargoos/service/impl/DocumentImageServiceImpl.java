package com.nmefc.neargoos.service.impl;

import com.nmefc.neargoos.entity.document.DocumentBaseEntity;
import com.nmefc.neargoos.entity.document.DocumentImageEntity;
import com.nmefc.neargoos.entity.document.ImageBaseAssociationEntity;
import com.nmefc.neargoos.repository.DocumentBaseRepository;
import com.nmefc.neargoos.repository.DocumentTabRepository;
import com.nmefc.neargoos.repository.ImageBaseAssociationRepository;
import com.nmefc.neargoos.service.inte.DocumentImageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: evaseemefly
 * \* Date: 2019/10/20
 * \* Time: 20:04
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Service
public class DocumentImageServiceImpl implements DocumentImageService {

    @Resource
    private DocumentBaseRepository documentBaseRepository;

    @Resource
    private DocumentTabRepository documentTabRepository;

    @Resource
    private ImageBaseAssociationRepository imageBaseAssociationRepository;

    /**
    * @Author:evaseemefly
    * @Description:根据 documentBase 的id
    * @param: * @param null
    * @Date:20:23 2019/10/21
    */
    @Override
    public List<DocumentImageEntity> getImageByBase(Long id) {

        // 根据传入的document base id 获取对应的image
        Optional<DocumentBaseEntity> baseById= documentBaseRepository.findById(id);
        List<DocumentImageEntity> list=new ArrayList<>();
        if(baseById.isPresent()){
            // 存在指定的base
            List<ImageBaseAssociationEntity> listImageBase=imageBaseAssociationRepository.findByBid(id);
            listImageBase.forEach(temp->{
                list.add(temp.getDocumentImageByImageid());
            });
        }
        return list;
    }
}
