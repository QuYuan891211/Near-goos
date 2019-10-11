package com.nmefc.neargoos.entity.product;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Author:evaseemeflye
 * @Date:Created in 21:10 2019/10/11
 */
@Entity
@Table(name = "product_info", schema = "neargoos", catalog = "")
public class ProductInfoEntity {
    private int id;
    private String name;
    private Integer area;
    private Integer interval;
    private String imageUrl;
    private Timestamp targetDate;
    private Timestamp gmtCreate;
    private Timestamp gmtModified;
    private Integer type;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "area")
    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    @Basic
    @Column(name = "interval")
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    @Basic
    @Column(name = "image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Basic
    @Column(name = "target_date")
    public Timestamp getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Timestamp targetDate) {
        this.targetDate = targetDate;
    }

    @Basic
    @Column(name = "gmt_create")
    public Timestamp getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Timestamp gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Basic
    @Column(name = "gmt_modified")
    public Timestamp getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Timestamp gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Basic
    @Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductInfoEntity that = (ProductInfoEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(area, that.area) &&
                Objects.equals(interval, that.interval) &&
                Objects.equals(imageUrl, that.imageUrl) &&
                Objects.equals(targetDate, that.targetDate) &&
                Objects.equals(gmtCreate, that.gmtCreate) &&
                Objects.equals(gmtModified, that.gmtModified) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, area, interval, imageUrl, targetDate, gmtCreate, gmtModified, type);
    }
}
