package com.nmefc.neargoos.repository.inte;

import com.nmefc.neargoos.entity.data.DataDataInfoEntity;
import com.nmefc.neargoos.entity.data.DatainfoRecordAssociationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface DataRecordAssociationRepository extends JpaRepository<DatainfoRecordAssociationEntity,Long>,JpaSpecificationExecutor<DatainfoRecordAssociationEntity> {
    List<DatainfoRecordAssociationEntity> findByDid(Long did);
    List<DatainfoRecordAssociationEntity> findByRid(Long rid);

}
