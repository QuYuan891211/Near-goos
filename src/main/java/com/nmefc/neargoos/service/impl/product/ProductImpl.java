package com.nmefc.neargoos.service.impl.product;

import com.nmefc.neargoos.common.enumPackage.Area;
import com.nmefc.neargoos.common.enumPackage.ProductType;
import com.nmefc.neargoos.entity.product.ProductInfoEntity;
import com.nmefc.neargoos.repository.ProductRepository;
import com.nmefc.neargoos.service.inte.product.ProductService;
import org.springframework.data.domain.Page;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @Author:evaseemeflye
 * @Date:Created in 21:03 2019/10/10
 */
public class ProductImpl implements ProductService {
    @Resource
    private ProductRepository productRepository;
    @Override
    public List<ProductInfoEntity> getMatchConditionImageList(ProductType type, Integer interval, Date targetDate, Area area){
       return productRepository.findAll();
    }

}
