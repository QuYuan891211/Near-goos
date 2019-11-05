package com.nmefc.neargoos.repository;

import com.nmefc.neargoos.entity.document.TabBaseAssociationEntity;
import com.nmefc.neargoos.entity.product.ProductInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

public interface TabBaseAssociationRepository extends JpaSpecificationExecutor<TabBaseAssociationEntity>, JpaRepository<TabBaseAssociationEntity, Long> {

    List<TabBaseAssociationEntity> findByBid(Long bid);

    List<TabBaseAssociationEntity> findByTabid(Long tabid);
}
