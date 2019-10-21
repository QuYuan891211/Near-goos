package com.nmefc.neargoos.service.impl;

import com.nmefc.neargoos.entity.document.DocumentBaseEntity;
import com.nmefc.neargoos.entity.document.DocumentTabEntity;
import com.nmefc.neargoos.entity.document.TabBaseAssociationEntity;
import com.nmefc.neargoos.repository.DocumentBaseRepository;
import com.nmefc.neargoos.repository.DocumentTabRepository;
import com.nmefc.neargoos.repository.TabBaseAssociationRepository;
import com.nmefc.neargoos.service.inte.DocumentBaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DocumentBaseServiceImpl implements DocumentBaseService {

    @Resource
    private DocumentBaseRepository documentBaseRepository;
    @Resource
    private DocumentTabRepository documentTabRepository;

    @Resource
    TabBaseAssociationRepository tabBaseAssociationRepository;
//    private Tabbase ;

    /**
     * @return :
     * @Author : evaseemefly
     * @Description : 根据 tab 的 id 获取对应的DocumentBase list
     * @params :
     * @Date : 2019/10/19 21:38
     */
    @Override
    public List<DocumentBaseEntity> getBaseByTab(Long id) {
        Optional<DocumentTabEntity> byId = documentTabRepository.findById(id);
        List<Long> listBid = new ArrayList<>();
        List<DocumentBaseEntity> listBase = new ArrayList<>();
        if (byId.isPresent()) {
            // 找到指定tabid对应的关联表中的baseid，并加入list中
            // todo:[*] 19-10-20 此处还有其他更好的办法吗？直接找到对应的关联表中的记录？
            List<TabBaseAssociationEntity> tabBaseTemp = tabBaseAssociationRepository.findByTabid(byId.get().getId());


//            tabBaseTemp[0]
            tabBaseTemp.forEach(temp -> {
                listBase.add(temp.getDocumentBaseByBid());
                // todo:[*] 19-10-21 尝试在关联表中直接找到外键对应的映射entity
//                temp.
            });
//            tabBaseTemp.forEach(temp -> listBid.add(temp.getBid()));
            return listBase;
        }


        return null;
    }
}
