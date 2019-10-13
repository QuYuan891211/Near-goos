package com.nmefc.neargoos.repository;

import com.nmefc.neargoos.entity.document.DocumentTabEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
* @Author : evaseemefly
* @Description : 注意此处的 JpaSpecificationExecutor 其中的find方法传入的参数均为：Specification<T> ，所以才继承此接口
* @params :
* @Date : 2019/10/13 4:49 下午
* @return :
*/
public interface DocumentTabRepository extends JpaSpecificationExecutor<DocumentTabEntity>, JpaRepository<DocumentTabEntity,Long> {
    List<DocumentTabEntity> findByLevel(int level);

}
