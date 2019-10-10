package com.nmefc.neargoos.service.inte.product;

import com.nmefc.neargoos.common.enumPackage.Area;
import com.nmefc.neargoos.common.enumPackage.ProductType;
import com.nmefc.neargoos.entity.product.ProductInfoEntity;
import org.springframework.data.domain.Page;

import java.util.Date;
import java.util.List;

/**
 * @Author:evaseemeflye
 * @Date:Created in 20:58 2019/10/10
 */
public interface ProductService {

    List<ProductInfoEntity> getMatchConditionImageList(ProductType type, Integer interval, Date targetDate, Area area);
//
}
