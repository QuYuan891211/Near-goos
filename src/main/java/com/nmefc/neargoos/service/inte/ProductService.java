package com.nmefc.neargoos.service.inte;

import com.nmefc.neargoos.common.enumPackage.Area;
import com.nmefc.neargoos.common.enumPackage.ProductType;
import com.nmefc.neargoos.entity.product.ProductInfoEntity;
import com.nmefc.neargoos.middleModel.AreaMidModel;
import com.nmefc.neargoos.middleModel.ProductMenuMideModel;
import com.nmefc.neargoos.middleModel.ProductSearchMidModel;
import com.nmefc.neargoos.middleModel.ProductTypeMidModel;
//import com.sun.jmx.snmp.Timestamp;
import java.sql.Timestamp;

import com.sun.deploy.security.BadCertificateDialog;
import org.joda.time.DateTime;

import java.util.Date;
import java.util.List;
import java.util.Optional;

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
    List<ProductInfoEntity> getMatchConditionImageList(ProductType type, Integer interval, Timestamp targetDate, Area area);

    /**
    * @Author : evaseemefly
    * @Description : 获取指定条件的预报产品 list
    * @params :
    * @Date : 2019/10/13 4:35 下午
    * @return :
    */
    List<ProductInfoEntity> getMatchListByProduct(ProductSearchMidModel product);

    /**
     * @Author:evaseemefly
     * @Description:根据 产品类型，间隔，起始时间，以及区域获取对应的图片名称
     * @param: * @param null
     * @Date:22:02 2019/10/11
     */
    List<ProductTypeMidModel> getProductTypes();

    // TODO:[*] 19-12-12 注释的快捷方式暂时有点问题，先手动加上，之后再替换
    // 获取符合条件的最近的product info
    Optional<ProductInfoEntity> getLastProduct(ProductSearchMidModel product);
    /**
    * @Author : evaseemefly
    * @Description : 获取全部的产品的种类的 menu list
    * @params :
    * @Date : 2019/12/4 20:55
    * @return :
    */
    List<ProductMenuMideModel> getProductTypeMenuList();

    List<ProductInfoEntity> getAllList();

    /**
     * @Author:evaseemefly
     * @Description:获取产品对应的种类
     * @param: * @param null
     * @Date:22:02 2019/10/11
     */
    List<AreaMidModel> getArea();

}
