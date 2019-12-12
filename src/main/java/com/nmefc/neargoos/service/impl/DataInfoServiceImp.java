package com.nmefc.neargoos.service.impl;

import com.nmefc.neargoos.common.utils.DateTimeUtils;
import com.nmefc.neargoos.entity.data.DataDataInfoEntity;
import com.nmefc.neargoos.entity.data.DataRecordEntity;
import com.nmefc.neargoos.entity.data.DatainfoRecordAssociationEntity;
import com.nmefc.neargoos.exception.ServiceException;
import com.nmefc.neargoos.middleModel.DataInfoQueryModel;
import com.nmefc.neargoos.middleModel.DataInfoStatisticsModel;
import com.nmefc.neargoos.repository.inte.DataInfoRepository;
import com.nmefc.neargoos.repository.inte.DataRecordAssociationRepository;
import com.nmefc.neargoos.service.inte.DataInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 *@Description: 数据信息的服务实现类
 *@Param:
 *@Return:
 *@Author: quyua
 *@Date: 2019/10/20 22:51
 */
@Service("/dataInfoService")
public class DataInfoServiceImp extends DataBaseServiceImp<DataDataInfoEntity,Long> implements DataInfoService {

    @Autowired
    protected DataInfoRepository dataInfoRepository;
    @Autowired
    protected DataRecordAssociationRepository dataRecordAssociationRepository;

    @Override
    public String check(DataDataInfoEntity record, String response) throws ServiceException {

        return null;
    }

    /**
     * @Description:
     * @Param: [dataDataInfoEntity, beginTime, endTime, pageable]
     * @Return: org.springframework.data.domain.Page<com.nmefc.neargoos.entity.data.DataDataInfoEntity>
     * @Author: quyua
     * @Date: 2019/10/20 22:44
     */
    public List<DataDataInfoEntity> findByBaseCondition(DataInfoQueryModel dataInfoQueryModel) {
        List<DataDataInfoEntity> result = null;

        // 构造自定义查询条件
        Specification<DataDataInfoEntity> queryCondition = (Specification<DataDataInfoEntity>) (root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicateList = new ArrayList<>();
//            1.根据海区的条件
        if (dataInfoQueryModel.getAreaId() != null) {
            predicateList.add(criteriaBuilder.equal(root.get("areaId"), dataInfoQueryModel.getAreaId()));
        }
//            2.根据数据类型的条件
        if (dataInfoQueryModel.getCategoryId() != null) {
            predicateList.add(criteriaBuilder.equal(root.get("categoryId"), dataInfoQueryModel.getCategoryId()));
        }
//            3.根据起始时间和结束时间

        if (dataInfoQueryModel.getBeginTime() != null && dataInfoQueryModel.getEndTime() != null) {

            predicateList.add(criteriaBuilder.between(root.get("date"), DateTimeUtils.date2timestamp(dataInfoQueryModel.getBeginTime()), DateTimeUtils.date2timestamp(dataInfoQueryModel.getEndTime())));
        }
//            4.根据数据源
        if (dataInfoQueryModel.getSourceId() != null) {
            predicateList.add(criteriaBuilder.equal(root.get("sourceId"), dataInfoQueryModel.getSourceId()));
        }
        predicateList.add(criteriaBuilder.lessThan(root.get("isDelete"), 1));
            return criteriaBuilder.and(predicateList.toArray(new Predicate[predicateList.size()]));
        };

        // 分页和不分页，这里按起始页和每页展示条数为0时默认为不分页，分页的话按创建时间降序

            if (dataInfoQueryModel.getPage() == 0 && dataInfoQueryModel.getSize() == 0) {
                result = dataInfoRepository.findAll(queryCondition);
            } else {
                Sort sort = new Sort(Sort.Direction.DESC, "date");
                Pageable pageable = PageRequest.of(dataInfoQueryModel.getPage(), dataInfoQueryModel.getSize(), sort);
                result = dataInfoRepository.findAll(queryCondition, pageable).getContent();
            }

        return result;
    }
//
//        if (pageable == null) {
//            return null;
//        }
//        return dataInfoRepository.findAll((root, criteriaQuery, criteriaBuilder) -> {
//            List<Predicate> predicateList = new ArrayList<Predicate>();
////            1.根据海区的条件
//            if (dataInfoQueryModel.getAreaId() != null) {
//                predicateList.add(criteriaBuilder.equal(root.get("areaId"), dataInfoQueryModel.getAreaId()));
//            }
////            2.根据数据类型的条件
//            if (dataInfoQueryModel.getCategoryId() != null) {
//                predicateList.add(criteriaBuilder.equal(root.get("categoryId"), dataInfoQueryModel.getCategoryId()));
//            }
////            3.根据起始时间和结束时间
//
//            if (dataInfoQueryModel.getBeginTime() != null && dataInfoQueryModel.getEndTime() != null) {
//
//                predicateList.add(criteriaBuilder.between(root.get("date"), DateTimeUtils.date2timestamp(dataInfoQueryModel.getBeginTime()), DateTimeUtils.date2timestamp(dataInfoQueryModel.getEndTime())));
//            }
////            4.根据数据源
//            if (dataInfoQueryModel.getSourceId() != null) {
//                predicateList.add(criteriaBuilder.equal(root.get("sourceId"), dataInfoQueryModel.getSourceId()));
//            }
//            predicateList.add(criteriaBuilder.lessThan(root.get("isDelete"), 1));
//            return criteriaQuery.where(predicateList.toArray(new Predicate[predicateList.size()])).getRestriction();
//        }, pageable);
//    }
    /**
     *@Description: 获取对于类型统计信息
     *@Param: [name]
     *@Return: com.nmefc.neargoos.middleModel.DataInfoStatisticsModel
     *@Author: quyua
     *@Date: 2019/12/11 16:01
     */
    public DataInfoStatisticsModel statisticsByCategory(DataInfoQueryModel dataInfoQueryModel){
        List<DataDataInfoEntity> list = this.findByBaseCondition(dataInfoQueryModel);
        DataInfoStatisticsModel dataInfoStatisticsModel = new DataInfoStatisticsModel();
        dataInfoStatisticsModel.setCategoryId(dataInfoQueryModel.getCategoryId());
        dataInfoStatisticsModel.setName(dataInfoQueryModel.getCategoryName());
        dataInfoStatisticsModel.setFileNumber(0);
        dataInfoStatisticsModel.setSize(new Long(0));
        dataInfoStatisticsModel.setBeginTime(new Date());
        dataInfoStatisticsModel.setEndTime(new Date());
        //当此类别没有数据的时候
        if (list != null && list.size()>0){
            Long fileSize =  list.stream().collect(Collectors.summingLong(item->item.getSize()));
            dataInfoStatisticsModel.setSize(fileSize);
            dataInfoStatisticsModel.setFileNumber(list.size());
            dataInfoStatisticsModel.setBeginTime(list.get(list.size()-1).getDate());
            dataInfoStatisticsModel.setEndTime(list.get(0).getDate());
        }

        return dataInfoStatisticsModel;
    }

    /**
     *@Description: 根据ID查找数据信息
     *@Param: [id]
     *@Return: java.util.Optional<com.nmefc.neargoos.entity.data.DataDataInfoEntity>
     *@Author: quyua
     *@Date: 2019/10/24 0:46
     */
    @Override
    public List<DataRecordEntity> findDataRecordByDataInfoId(Long id) {
//        Optional<DataDataInfoEntity> dataDataInfoEntityOptional = dataInfoRepository.findById(id);
        List<DatainfoRecordAssociationEntity> datainfoRecordAssociationEntityList = dataRecordAssociationRepository.findByDid(id);
        if(datainfoRecordAssociationEntityList == null && datainfoRecordAssociationEntityList.size()<1){return null;}
        List <DataRecordEntity> list = datainfoRecordAssociationEntityList.stream().map(item->item.getDataRecordByRid()).collect(Collectors.toList());
        //去掉所有软删除的
        return list.stream().filter(item->item.getIsDelete()<1).collect(Collectors.toList());
    }
}
