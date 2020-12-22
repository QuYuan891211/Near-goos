package com.nmefc.neargoos.repository;

import com.nmefc.neargoos.entity.product.ProductInfoEntity;
import com.nmefc.neargoos.entity.product.ProductTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
/**
 * \* Created with IntelliJ IDEA.
 * \* User: evase
 * \* Date: 2019/12/4
 * \* Time: 20:58
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public interface ProductTypeRepository extends  JpaSpecificationExecutor<ProductTypeEntity>, JpaRepository<ProductTypeEntity,Integer>{


}
