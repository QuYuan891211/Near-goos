package com.nmefc.neargoos.repository;

import com.nmefc.neargoos.entity.document.ContentBaseAssociationEntity;
import com.nmefc.neargoos.entity.document.DocumentBaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import javax.swing.text.AbstractDocument;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: DELL
 * \* Date: 2019/10/22
 * \* Time: 15:39
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public interface ContentBaseAssociationRepository extends JpaSpecificationExecutor<ContentBaseAssociationEntity>, JpaRepository<ContentBaseAssociationEntity,Long> {
    List<ContentBaseAssociationEntity> findByBid(Long bid);

}
