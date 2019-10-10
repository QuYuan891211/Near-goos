package com.nmefc.neargoos.controller.product;

import com.nmefc.neargoos.common.enumPackage.Area;
import com.nmefc.neargoos.common.enumPackage.ProductType;
import com.nmefc.neargoos.common.enumPackage.ResponseMsg;
import com.nmefc.neargoos.common.utils.DateTimeUtils;
import com.nmefc.neargoos.entity.data.DataOverviewEntity;
import com.nmefc.neargoos.entity.product.ProductInfoEntity;
import com.nmefc.neargoos.repository.inte.DataOverviewRepository;
import com.nmefc.neargoos.service.inte.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @Author:evaseemeflye
 * @Date:Created in 21:31 2019/10/10
 */
@Controller
@RequestMapping("/data")
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
}
