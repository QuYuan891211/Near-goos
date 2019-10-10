package com.nmefc.neargoos.base.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

    @Data
    @MappedSuperclass
    @EntityListeners({AuditingEntityListener.class})
    public class BaseEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false, length = 22, unique = true)
        protected Long id;

        @CreatedDate
        @Column(name = "gmt_create", nullable = false)
        protected Date gmtCreate;

        @LastModifiedDate
        @Column(name = "gmt_modified")
        protected Date gmtModified;

    }

