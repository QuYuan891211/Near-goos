//package com.nmefc.neargoos.controller.management;
//
//import com.nmefc.neargoos.entity_test.management.Product;
//import com.nmefc.neargoos.middleModel.AreaMidModel;
//import com.nmefc.neargoos.middleModel.ProductTypeMidModel;
//import com.nmefc.neargoos.service_test.management.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import sun.dc.pr.PRError;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.nmefc.neargoos.common.enumPackage.Area;
//import com.nmefc.neargoos.common.enumPackage.ProductType;
//
//@Controller
//@RequestMapping(value = "/product")
//public class ProductController {
//    @Autowired
//    private ProductService productService;
//
//    /**
//     * @return :
//     * @Author : evaseemefly
//     * @Description : 获取指定产品的详细信息列表
//     * @params :
//     * @Date : 2019/10/6 17:05
//     */
//    @ResponseBody
//    @GetMapping(value = "/getlist")
//    public List<Product> getListByCondition(Product product) {
//        List<Product> list = productService.getMatchConditionImageList(ProductType.values()[product.getType()], product.getInterval(), product.getTargetDate(), Area.values()[product.getArea()]);
//        return list;
//    }
//
//    /**
//     * @return :
//     * @Author : evaseemefly
//     * @Description :
//     * @params : 获取产品对应的种类
//     * @Date : 2019/10/6 17:10
//     */
//    @ResponseBody
//    @GetMapping(value = "/getproducttype")
//    public List<ProductTypeMidModel> getProductTypes() {
//        // 以下封装至dal层中了（service_test）
////        List<ProductTypeMidModel> list=new ArrayList();
////        for(ProductType temp : ProductType.values()){
//////            System.out.print(temp.toString());
//////            System.out.print(temp.ordinal());
////            String msg=String.format("枚举val:%s,对应index:%d %n",temp.toString(),temp.ordinal());
////            System.out.printf(msg);
////            list.add(new ProductTypeMidModel(temp.toString(),temp.ordinal()));
////        }
//        List<ProductTypeMidModel> list = productService.getProductTypes();
//        return list;
//    }
//
//    @ResponseBody
//    @GetMapping(value = "/getarea")
//    public List<AreaMidModel> getArea() {
//        List<AreaMidModel> list = productService.getArea();
//        return list;
//    }
//}
