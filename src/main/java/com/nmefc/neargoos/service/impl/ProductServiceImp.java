package com.nmefc.neargoos.service.impl;

import com.nmefc.neargoos.common.enumPackage.Area;
import com.nmefc.neargoos.common.enumPackage.ProductInterval;
import com.nmefc.neargoos.common.enumPackage.ProductType;
import com.nmefc.neargoos.entity.product.ProductInfoEntity;
import com.nmefc.neargoos.middleModel.AreaMidModel;
import com.nmefc.neargoos.middleModel.ProductTypeMidModel;
import com.nmefc.neargoos.repository.ProductRepository;
import com.nmefc.neargoos.service.inte.ProductService;
import com.sun.deploy.security.BadCertificateDialog;
import com.sun.org.apache.bcel.internal.generic.FADD;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
// TODO[*] 19-10-12 以下两种类型的区别
import java.sql.Timestamp;
//import com.sun.jmx.snmp.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 * @Author:evaseemeflye
 * @Date:Created in 21:03 2019/10/10
 * @Desc: 注意对于Service的实现类必须要 标注上 @Service
 */
@Service
public class ProductServiceImp implements ProductService {
    @Resource
    private ProductRepository productRepository;

    public List<ProductInfoEntity> getMatchConditionImageList(ProductType type, Integer interval, Timestamp targetDate, Area area) {
//        return productRepository.findAll();
//        return productRepository.findByAreaAndTypeAndIntervalAndTargetDate(area.ordinal(),type.ordinal(),interval,targetDate);
        return productRepository.findByAreaAndTypeAndIntervalAndTargetDate(area.ordinal(),type.ordinal(),interval,targetDate);
//        List<ProductInfoEntity> list=productRepository.
//        return productRepository.findAll(
//                (root,query,cb)->{
//                    List<Predicate> predicates=new ArrayList<Predicate>();
//                    predicates.add(cb.equal(root.get("area"),area.ordinal()));
//                    predicates.add(cb.equal(root.get("type"),type.ordinal()));
//                    predicates.add(cb.equal(root.get("target_data",targetDate)));
//                }
//        )
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

    /**
    * @Author : evaseemefly
    * @Description : 
    * @params : 
    * @Date : 2019/10/12 11:12 
    * @return : 
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
