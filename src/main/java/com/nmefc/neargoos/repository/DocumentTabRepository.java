package com.nmefc.neargoos.repository;

import com.nmefc.neargoos.entity.document.DocumentTabEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @Author : evaseemefly
 * @Description : 注意此处的 JpaSpecificationExecutor 其中的find方法传入的参数均为：Specification<T> ，所以才继承此接口
 * todo:[*] 19-10-18 映射的时候出现如下错误：
 * Invocation of init method failed;
 * nested exception is java.lang.IllegalArgumentException:
 * Not a managed type: class com.nmefc.neargoos.entity.document.DocumentTabEntity
 * @params :
 * @Date : 2019/10/13 4:49 下午
 * @return :
 */
public interface DocumentTabRepository extends JpaSpecificationExecutor<DocumentTabEntity>, JpaRepository<DocumentTabEntity, Long> {
    List<DocumentTabEntity> findByLevel(Integer level);


    /**
     * @return :
     * @Author : evaseemefly
     * @Description :  根据指定id获取tab以及其child tab并返回
     * @params :
     * @Date : 2019/10/18 16:39
     */
    List<DocumentTabEntity> findAllByPidAndLevel(Integer pid,Integer level);
}
