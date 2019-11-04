package com.nmefc.neargoos.repository;

import com.nmefc.neargoos.entity.document.ContentBaseAssociationEntity;
import com.nmefc.neargoos.entity.document.DocumentContentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: DELL
 * \* Date: 2019/10/22
 * \* Time: 15:39
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public interface DocumentContentRepository extends JpaSpecificationExecutor<DocumentContentEntity>, JpaRepository<DocumentContentEntity,Long> {
// List<>
}