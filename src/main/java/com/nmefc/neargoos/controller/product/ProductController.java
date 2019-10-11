package com.nmefc.neargoos.controller.product;

import com.nmefc.neargoos.common.enumPackage.Area;
import com.nmefc.neargoos.common.enumPackage.ProductType;
import com.nmefc.neargoos.entity.product.ProductInfoEntity;
import com.nmefc.neargoos.middleModel.AreaMidModel;
import com.nmefc.neargoos.middleModel.ProductTypeMidModel;
import com.nmefc.neargoos.service.inte.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author:evaseemeflye
 * @Date:Created in 21:31 2019/10/10
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    /**
     * @Author:evaseemefly
     * @Description: TODO:[*] 注意此处提示错误，无法autowired
     * @param: * @param null
     * @Date:21:33 2019/10/10
     */
    @Autowired
    private ProductService productService;

    @ResponseBody
    @GetMapping(value = "/getlist")
    public List<ProductInfoEntity> getListByCondition(ProductInfoEntity product) {

        List<ProductInfoEntity> list = productService.getMatchConditionImageList(ProductType.values()[product.getType()], product.getInterval(), product.getTargetDate(), Area.values()[product.getArea()]);
        return list;
    }

    @ResponseBody
    @GetMapping(value = "/getlist")
    public List<ProductInfoEntity> getListByCondition(ProductInfoEntity product) {

        List<ProductInfoEntity> list = productService.getMatchConditionImageList(ProductType.values()[product.getType()], product.getInterval(), product.getTargetDate(), Area.values()[product.getArea()]);
        return list;
    }

    @ResponseBody
    @GetMapping(value = "/getproducttype")
    public List<ProductTypeMidModel> getProductTypes() {
        // 以下封装至dal层中了（service）
//        List<ProductTypeMidModel> list=new ArrayList();
//        for(ProductType temp : ProductType.values()){
////            System.out.print(temp.toString());
////            System.out.print(temp.ordinal());
//            String msg=String.format("枚举val:%s,对应index:%d %n",temp.toString(),temp.ordinal());
//            System.out.printf(msg);
//            list.add(new ProductTypeMidModel(temp.toString(),temp.ordinal()));
//        }
        List<ProductTypeMidModel> list = productService.getProductTypes();
        return list;
    }

    @ResponseBody
    @GetMapping(value = "/getarea")
    public List<AreaMidModel> getArea() {

        List<AreaMidModel> list = productService.getArea();
        return list;
    }
}
