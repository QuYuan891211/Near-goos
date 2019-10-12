package com.nmefc.neargoos.repository;

import com.nmefc.neargoos.entity.product.ProductInfoEntity;
import com.sun.deploy.security.BadCertificateDialog;
import net.sf.ehcache.util.ProductInfo;
import org.joda.time.DateTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.sql.Timestamp;
import java.util.List;

/**
 * @Author:evaseemeflye
 * @Date:Created in 21:04 2019/10/10
 */
public interface ProductRepository extends JpaSpecificationExecutor<ProductInfoEntity>, JpaRepository<ProductInfoEntity,Long> {
    /**
    * @Author : evaseemefly
    * @Description : 根据 area，type以及指定时间获取对应的 产品 列表
    * @params :
    * @Date : 2019/10/12 15:14 
    * @return : 
    */
//    List<ProductInfoEntity> findByAreaAndTypeAndInterval(int area, int type,int interval);
    List<ProductInfoEntity> findByAreaAndTypeAndIntervalAndTargetDate(int area, int type,int interval, Timestamp targetDate);
}
