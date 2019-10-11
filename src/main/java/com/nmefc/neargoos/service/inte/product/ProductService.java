package com.nmefc.neargoos.service.inte.product;

import com.nmefc.neargoos.common.enumPackage.Area;
import com.nmefc.neargoos.common.enumPackage.ProductType;
import com.nmefc.neargoos.entity.product.ProductInfoEntity;
import com.nmefc.neargoos.middleModel.AreaMidModel;
import com.nmefc.neargoos.middleModel.ProductTypeMidModel;

import java.util.Date;
import java.util.List;

/**
 * @Author:evaseemeflye
 * @Date:Created in 20:58 2019/10/10
 */
public interface ProductService {

    /**
     * @Author:evaseemefly
     * @Description: 产品的dal接口层
     * 先继承自BaseService
     * 我能想到的目前有一些需要实现的接口
     * @param: * @param null
     * @Date:22:01 2019/10/11
     */
    List<ProductInfoEntity> getMatchConditionImageList(ProductType type, Integer interval, Date targetDate, Area area);

    /**
     * @Author:evaseemefly
     * @Description:根据 产品类型，间隔，起始时间，以及区域获取对应的图片名称
     * @param: * @param null
     * @Date:22:02 2019/10/11
     */
    List<ProductTypeMidModel> getProductTypes();


    List<ProductInfoEntity> getAllList();

    /**
     * @Author:evaseemefly
     * @Description:获取产品对应的种类
     * @param: * @param null
     * @Date:22:02 2019/10/11
     */
    List<AreaMidModel> getArea();

}
