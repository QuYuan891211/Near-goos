package com.nmefc.neargoos.repository;

import com.nmefc.neargoos.entity.product.ProductPeriodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: evase
 * \* Date: 2019/12/4
 * \* Time: 22:01
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public interface ProductPeriodRepository extends JpaSpecificationExecutor<ProductPeriodEntity>, JpaRepository<ProductPeriodEntity, Integer> {
    List<ProductPeriodEntity> findByAidAndTid(Integer aid, Integer tid);


}
