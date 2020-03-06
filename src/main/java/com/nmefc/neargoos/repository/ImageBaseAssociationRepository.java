package com.nmefc.neargoos.repository;

import com.nmefc.neargoos.entity.document.ImageBaseAssociationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;
//import sun.util.resources.ga.LocaleNames_ga;

import java.util.List;

/**
 * @Author:evaseemeflye
 * @Date:Created in 20:45 2019/10/21
 */
public interface ImageBaseAssociationRepository extends JpaSpecificationExecutor<ImageBaseAssociationEntity>, JpaRepository<ImageBaseAssociationEntity, Long> {

    List<ImageBaseAssociationEntity> findByBid(Long bid);
}
