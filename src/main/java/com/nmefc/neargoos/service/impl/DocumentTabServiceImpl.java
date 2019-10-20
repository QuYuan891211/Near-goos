package com.nmefc.neargoos.service.impl;

import com.nmefc.neargoos.entity.document.DocumentTabEntity;
import com.nmefc.neargoos.middleModel.TabMidModel;
import com.nmefc.neargoos.repository.DocumentTabRepository;
import com.nmefc.neargoos.service.inte.DocumentTabService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

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
        List<DocumentTabEntity> list = documentTabRepository.findByLevel(1);
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
    public List<DocumentTabEntity> getTargetLevelTab(Integer num) {
        List<DocumentTabEntity> list = documentTabRepository.findByLevel(num);
        return list;
    }

    /**
     * @return :
     * @Author : evaseemefly
     * @Description : 获取指定pid 以及 level 的所有tab以及子tab
     * @params :
     * @Date : 2019/10/19 11:38
     */
    @Override
    public List<DocumentTabEntity> getFullTabsByPidAndLevel(Long id) {
        /*
            思路：
                根据 id 找到对应的tab ，并判断是否有子tab

         */
        List<DocumentTabEntity> children = documentTabRepository.findAllByPid(id);
        return children;
    }

    /**
     * @return :
     * @Author : evaseemefly
     * @Description : 根据parent的id获取一个 tab tree
     * @params :
     * @Date : 2019/10/19 17:34
     */
    @Override
    public TabMidModel getFullTabsByParent(Long id) {
        // TODO:[*] 19-10-19 Optional 类是一个可以为null的容器对象。如果值存在则isPresent()方法会返回true，调用get()方法会返回该对象。
        Optional<DocumentTabEntity> parentTab = documentTabRepository.findById(id);
//        documentTabRepository.findById(id);
//     todo:[*] 19-10-19   由于使用了Optional<T> 这种方式，在每次get() 之前通过.isPresent() 判断
        if (parentTab.isPresent()) {
            // 获取pid为 parentTab.id的所有children
            DocumentTabEntity documentTabEntity = parentTab.get();
            List<DocumentTabEntity> children = documentTabRepository.findAllByPid(documentTabEntity.getId());
            TabMidModel tab = new TabMidModel(parentTab.get(), children);
            return tab;
        } else {
            return null;
        }

    }


}
