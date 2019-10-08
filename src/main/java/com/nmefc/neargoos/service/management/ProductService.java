package com.nmefc.neargoos.service.management;

import com.nmefc.neargoos.common.enumPackage.ProductType;
import com.nmefc.neargoos.entity.management.Product;
import com.nmefc.neargoos.entity.management.ProductExample;
import com.nmefc.neargoos.middleModel.AreaMidModel;
import com.nmefc.neargoos.middleModel.ProductTypeMidModel;
import com.nmefc.neargoos.service.BaseService;
import com.nmefc.neargoos.common.enumPackage.Area;

import java.util.Date;
import java.util.List;
/**
* @Author:evaseemefly
* @Description: 产品的dal接口层
 *                先继承自BaseService
 *                我能想到的目前有一些需要实现的接口
 *                      -1:
* @params: * @param null
* @Date:2019/10/5 10:17
*/
public interface ProductService{
    /**
    * @Author : evaseemefly
    * @Description : 根据 产品类型，间隔，起始时间，以及区域获取对应的图片名称
    * @params :
    * @Date : 2019/10/5 11:40 
    * @return : 
    */
    List<Product> getMatchConditionImageList(ProductType type, Integer interval, Date targetDate, Area area);

    
    /**
    * @Author : evaseemefly
    * @Description :  获取产品对应的种类
    * @params : 
    * @Date : 2019/10/7 10:20 
    * @return : 
    */
    List<ProductTypeMidModel> getProductTypes();


    List<AreaMidModel> getArea();
}
