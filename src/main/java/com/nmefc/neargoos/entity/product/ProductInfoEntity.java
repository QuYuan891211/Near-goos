package com.nmefc.neargoos.entity.product;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Author:evaseemeflye
 * @Date:Created in 20:50 2019/10/10
 */
@Entity
@Table(name = "product_info", schema = "neargoos", catalog = "")
public class ProductInfoEntity {
    private long id;
    private String name;
    private String area;
    private Integer interval;
    private String imageUrl;
    private Timestamp targetDate;
    private Timestamp gmtCreate;
    private Timestamp gmtModified;
    private String productInfocol;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
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
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
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
    @Column(name = "product_infocol")
    public String getProductInfocol() {
        return productInfocol;
    }

    public void setProductInfocol(String productInfocol) {
        this.productInfocol = productInfocol;
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
                Objects.equals(productInfocol, that.productInfocol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, area, interval, imageUrl, targetDate, gmtCreate, gmtModified, productInfocol);
    }
}
