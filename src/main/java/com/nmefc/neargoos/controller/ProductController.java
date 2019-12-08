package com.nmefc.neargoos.controller;

import com.nmefc.neargoos.common.enumPackage.Area;
import com.nmefc.neargoos.common.enumPackage.ProductType;
import com.nmefc.neargoos.entity.product.ProductInfoEntity;
import com.nmefc.neargoos.middleModel.AreaMidModel;
import com.nmefc.neargoos.middleModel.ProductMenuMideModel;
import com.nmefc.neargoos.middleModel.ProductSearchMidModel;
import com.nmefc.neargoos.middleModel.ProductTypeMidModel;
import com.nmefc.neargoos.service.inte.ProductService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.awt.image.BadDepthException;

import java.sql.Timestamp;
//import com.sun.jmx.snmp.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @Author:evaseemeflye
 * @Date:Created in 21:31 2019/10/10
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Controller
@RequestMapping("/product")
//@CrossOrigin(origins = "http://localhost:8080")
public class ProductController {

    /**
     * @Author:evaseemefly
     * @Description: TODO:[*] 注意此处提示错误，无法autowired
     * @param: * @param null
     * @Date:21:33 2019/10/10
     */
    @Autowired
    private ProductService productService;

    /**
     * @return :
     * @Author : evaseemefly
     * @Description : 根据 area,interval,targetdate,type（可多选可单选） 获取对应的 product
     * @params :
     * @Date : 2019/10/12 11:12
     */
    @ResponseBody
    @GetMapping(value = "/list")
    public List<ProductInfoEntity> getListByCondition(ProductSearchMidModel product,  @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ") Date end) {
//    public List<ProductInfoEntity> getListByCondition(ProductSearchMidModel product, @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ") Date start, @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ") Date end) {
        //TODO:[-] 最终发现采用此种方式可行，且会将UTC时间自动转换为本地时区
        // 此处有一个问题是，若使用上面的方式，若不传入start的话，会提示有错误
//    public List<ProductInfoEntity> getListByCondition(String cateogry,String area,String period) {
//        Timestamp ts= product.getTargetDate();
//        DateTime dt=new DateTime(ts.getTime());
//        List<ProductInfoEntity> list = productService.getMatchConditionImageList(ProductType.values()[product.getType()], product.getInterval(), ts, Area.values()[product.getArea()]);

        // TODO[*] 2019/10/13:此处修改为可以传入单一条件或多种条件
        List<ProductInfoEntity> list = productService.getMatchListByProduct(new ProductSearchMidModel());
        return list;
    }

    /**
     * @return :
     * @Author : evaseemefly
     * @Description : 获取全部的 menu list
     * @params :
     * @Date : 2019/12/4 19:14
     */
    @ResponseBody
    @GetMapping(value = "/menu/list")
    public List<ProductMenuMideModel> getAllMenuList() {
        List<ProductMenuMideModel> list = null;
        list = productService.getProductTypeMenuList();
        return list;
    }

    @ResponseBody
    @GetMapping(value = "/all")
    public List<ProductInfoEntity> getAllList() {
        List<ProductInfoEntity> list = productService.getAllList();
        return list;
    }

    @ResponseBody
    @GetMapping(value = "/types")
    public List<ProductTypeMidModel> getProductTypes() {
        // 以下封装至dal层中了（service）
        List<ProductTypeMidModel> list = productService.getProductTypes();
        return list;
    }

    @ResponseBody
    @GetMapping(value = "/area")
    public List<AreaMidModel> getArea() {

        List<AreaMidModel> list = productService.getArea();
        return list;
    }
}
