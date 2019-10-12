package com.nmefc.neargoos.base.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

    @MappedSuperclass
    public class BaseEntity {

        @javax.persistence.Id
        @Column(name = "id")
        protected Long id;


        @Basic
        @Column(name = "gmt_create")
        protected Date gmtCreate;

        @Basic
        @Column(name = "gmt_modified")
        protected Date gmtModified;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Date getGmtCreate() {
            return gmtCreate;
        }

        public void setGmtCreate(Date gmtCreate) {
            this.gmtCreate = gmtCreate;
        }

        public Date getGmtModified() {
            return gmtModified;
        }

        public void setGmtModified(Date gmtModified) {
            this.gmtModified = gmtModified;
        }
    }

