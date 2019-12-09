package com.nmefc.neargoos.service.impl;

import com.nmefc.neargoos.common.enumPackage.Area;
import com.nmefc.neargoos.common.enumPackage.ProductInterval;
import com.nmefc.neargoos.common.enumPackage.ProductType;
import com.nmefc.neargoos.entity.product.*;
import com.nmefc.neargoos.middleModel.*;
import com.nmefc.neargoos.repository.ProductPeriodRepository;
import com.nmefc.neargoos.repository.ProductRepository;
import com.nmefc.neargoos.repository.ProductTypeRepository;
import com.nmefc.neargoos.service.inte.ProductService;
import org.hibernate.engine.spi.CollectionEntry;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.*;
//TODO[*] 注意这两个包的区别
//import java.util.function.Predicate;
import javax.persistence.criteria.Predicate;

// TODO[*] 19-10-12 以下两种类型的区别
//import com.sun.jmx.snmp.Timestamp;

/**
 * @Author:evaseemeflye
 * @Date:Created in 21:03 2019/10/10
 * @Desc: 注意对于Service的实现类必须要 标注上 @Service
 */
@Service
public class ProductServiceImp implements ProductService {
    @Resource
    private ProductRepository productRepository;

    @Resource
    private ProductTypeRepository productTypeRepository;

    @Resource
    private ProductPeriodRepository productPeriodRepository;

    public List<ProductInfoEntity> getMatchConditionImageList(ProductType type, Integer interval, Timestamp targetDate, Area area) {
//        return productRepository.findAll();
//        return productRepository.findByAreaAndTypeAndIntervalAndTargetDate(area.ordinal(),type.ordinal(),interval,targetDate);
        return productRepository.findByAreaAndTypeAndIntervalAndTargetDate(area.ordinal(), type.ordinal(), interval, targetDate);
//        List<ProductInfoEntity> list=productRepository.

    }

    public List<ProductInfoEntity> getMatchListByProduct(ProductSearchMidModel product) {
        return productRepository.findAll(
                (root, query, cb) -> {
                    List<Predicate> predicates = new ArrayList<Predicate>();

//                    StringUtils.isNullOrEmpty("")
                    if (product.getArea() != null) {
                        predicates.add(cb.equal(root.get("area"), product.getArea()));
                    }
                    if (product.getPeriod() != null) {
                        predicates.add(cb.equal(root.get("interval"), product.getPeriod()));
                    }
                    if (product.getCateogry() != null) {
                        predicates.add(cb.equal(root.get("type"), product.getCateogry()));
                    }
                    // TODO:[*] 19-12-09 加入了时间区间的查询条件
                    if (product.getStart() != null) {
                        //Unable to locate Attribute  with the the given name [start] on this ManagedType
                        // 此处注意，由于product info表中对应的时间只有一个字段，是targetDate
                        predicates.add(cb.greaterThanOrEqualTo(root.get("targetDate"), product.getStart()));
                    }
                    if (product.getEnd() != null) {
                        predicates.add(cb.lessThanOrEqualTo(root.get("targetDate"), product.getEnd()));
                    }
                    return query.where(predicates.toArray(new Predicate[predicates.size()])).getRestriction();
//                    predicates.add(cb.equal(root.get("area"),area.ordinal()));
//                    predicates.add(cb.equal(root.get("type"),type.ordinal()));
//                    predicates.add(cb.equal(root.get("target_data",targetDate)));
                }
        );
    }

    public List<ProductTypeMidModel> getProductTypes() {

        List<ProductTypeMidModel> list = new ArrayList();
        for (ProductType temp : ProductType.values()) {
//            System.out.print(temp.toString());
//            System.out.print(temp.ordinal());
            String msg = String.format("枚举val:%s,对应index:%d %n", temp.toString(), temp.ordinal());
            System.out.printf(msg);
            list.add(new ProductTypeMidModel(temp.toString(), temp.ordinal()));
        }
        return list;
    }

    @Override
    public List<ProductMenuMideModel> getProductTypeMenuList() {
//        List<ProductTypeEntity> fatherlist = productTypeRepository.findAll();
        /*
            大致的思路是：
                找到全部的type->关联表->area->period
        */
        // 获取全部的type
        List<ProductMenuMideModel> listMenu = new ArrayList<>();
        List<ProductTypeEntity> all = productTypeRepository.findAll();
        all.forEach(typeTemp -> {
            // 关联表
            Collection<AreaCategoryAssociationEntity> children = typeTemp.getAreaCategoryAssociationsById();
            List<ProductAreaMenuMidModel> listAreaMenu = new ArrayList<>();
            // 根据关联表->area
            children.forEach(assTemp -> {
                // 注意： 关联表->area是1:1的关系，所以不会出现1:n的情况
                CommonAreaEntity area = assTemp.getCommonAreaByAid();
                // 根据当前的area找到对应的periods
                // 不使用此种方式？
//                Collection<ProductPeriodEntity> productPeriodsById = area.getProductPeriodsById();
                // 此处我只是找到area的id
                Integer aid = area.getId();
                List<ProductPeriodEntity> byAidAndTid = productPeriodRepository.findByAidAndTid(aid, assTemp.getTid());
                ProductPeriodEntity productPeriodTemp = byAidAndTid.get(0);
                String[] periods = productPeriodTemp.getPeriods().split(",");
                ArrayList<String> periodsList = new ArrayList<>(periods.length);
                Collections.addAll(periodsList, periods);
                String[] periodsIndex = productPeriodTemp.getPeriodsindex().split(",");
                ArrayList<String> periodsIndexList = new ArrayList<>(periodsIndex.length);
                Collections.addAll(periodsIndexList, periodsIndex);
                // TODO:[-] 19-12-05 注意此处使用String.valueOf(obj) 将int转换为string，不用考虑obj为null的问题
                listAreaMenu.add(new ProductAreaMenuMidModel(String.valueOf(area.getId()), area.getName(), periodsList, periodsIndexList));
            });
            listMenu.add(new ProductMenuMideModel(String.valueOf(typeTemp.getId()), typeTemp.getName(), listAreaMenu));
            // 以下不再使用注释掉
            // 根据当前的area与type找到符合条件的periods
            // 找到其中的periods
//            children.forEach(area -> {
//                List<ProductPeriodEntity> byAidAndTid = productPeriodRepository.findByAidAndTid(typeTemp.getId(), area.getTid());
//                ProductPeriodEntity productPeriodTemp = byAidAndTid.get(0);
//                String[] periods = productPeriodTemp.getPeriods().split(",");
//                ArrayList<String> periodsList = new ArrayList<>(periods.length);
//                Collections.addAll(periodsList, periods);
//                String[] periodsIndex = productPeriodTemp.getPeriodsindex().split(",");
//                ArrayList<String> periodsIndexList = new ArrayList<>(periodsIndex.length);
//                Collections.addAll(periodsIndexList, periodsIndex);
//                // TODO:[-] 19-12-05 注意此处使用String.valueOf(obj) 将int转换为string，不用考虑obj为null的问题
//                listAreaMenu.add(new ProductAreaMenuMidModel(String.valueOf(area.getId()), area.getName(), periodsList, periodsIndexList));
//            });
//            listMenu.add(new ProductMenuMideModel(String.valueOf(typeTemp.getId()), typeTemp.getName(), listAreaMenu));
        });
//
        return listMenu;
    }

    /**
     * @return :
     * @Author : evaseemefly
     * @Description :
     * @params :
     * @Date : 2019/10/12 11:12
     */
    public List<ProductInfoEntity> getAllList() {
        return productRepository.findAll();
    }

    /**
     * @Author:evaseemefly
     * @Description:获取产品对应的种类
     * @param: * @param null
     * @Date:22:02 2019/10/11
     */
    public List<AreaMidModel> getArea() {

        ProductInterval temp = new ProductInterval();
        Map<Integer, int[]> dictInterval = temp.getDictInterval();

        List<AreaMidModel> listArea = new ArrayList();
        // 循环area的枚举
        for (Area area : Area.values()) {
            String msg = String.format("枚举val:%s,对应index:%d %n", area.toString(), area.ordinal());
            System.out.printf(msg);
            // 深远海的是间隔3小时的
            if (area == Area.FarEast) {
                listArea.add(new AreaMidModel(area.toString(), area.ordinal(), dictInterval.get(1)));
            } else {
                listArea.add(new AreaMidModel(area.toString(), area.ordinal(), dictInterval.get(0)));
            }

        }
        return listArea;
    }
}
