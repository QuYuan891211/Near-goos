package com.nmefc.neargoos.entity.data;

import com.nmefc.neargoos.base.entity.BaseEntity;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;

import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

/**
 *@Description: 所有Data模块对象的父类
 *@Param:
 *@Return:
 *@Author: quyua
 *@Date: 2019/10/12 16:11
 */
@MappedSuperclass
public class DataBaseEntity extends BaseEntity{
    protected byte isDelete;
    protected String name;
    @Column(name = "is_delete")
    public byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(byte isDelete) {
        this.isDelete = isDelete;
    }


    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
