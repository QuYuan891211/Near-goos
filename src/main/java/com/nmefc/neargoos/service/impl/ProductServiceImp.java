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
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author:evaseemeflye
 * @Date:Created in 21:03 2019/10/10
 * @Desc: 注意对于Service的实现类必须要 标注上 @Service
 */
@Service
public class ProductServiceImp implements ProductService {
    @Resource
    private ProductRepository productRepository;

    @Override
    public List<ProductInfoEntity> getMatchConditionImageList(ProductType type, Integer interval, Date targetDate, Area area) {
        return productRepository.findAll();
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
