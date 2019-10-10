package com.nmefc.neargoos.repository;

import com.nmefc.neargoos.entity.product.ProductInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Author:evaseemeflye
 * @Date:Created in 21:04 2019/10/10
 */
public interface ProductRepository extends JpaSpecificationExecutor<ProductInfoEntity>, JpaRepository<ProductInfoEntity,Long> {
}
