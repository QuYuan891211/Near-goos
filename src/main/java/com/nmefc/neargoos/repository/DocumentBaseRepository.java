package com.nmefc.neargoos.repository;
import com.nmefc.neargoos.entity.document.DocumentBaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.lang.Long;

public interface DocumentBaseRepository extends JpaSpecificationExecutor<DocumentBaseEntity>,JpaRepository<DocumentBaseEntity,Long> {

}
