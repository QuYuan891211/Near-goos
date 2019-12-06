package com.nmefc.neargoos.entity.product;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "product_period", schema = "neargoos", catalog = "")
public class ProductPeriodEntity {
    private int aid;
    private int tid;
    private int id;
    private String periods;
    private String periodsindex;
    private CommonAreaEntity commonAreaByAid;
    private ProductTypeEntity productTypeByTid;

    @Basic
    @Column(name = "aid")
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    @Basic
    @Column(name = "tid")
    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "periods")
    public String getPeriods() {
        return periods;
    }

    public void setPeriods(String periods) {
        this.periods = periods;
    }

    @Basic
    @Column(name = "periodsindex")
    public String getPeriodsindex() {
        return periodsindex;
    }

    public void setPeriodsindex(String periodsindex) {
        this.periodsindex = periodsindex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductPeriodEntity that = (ProductPeriodEntity) o;
        return aid == that.aid &&
                tid == that.tid &&
                id == that.id &&
                Objects.equals(periods, that.periods) &&
                Objects.equals(periodsindex, that.periodsindex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aid, tid, id, periods, periodsindex);
    }

    @ManyToOne
    @JoinColumn(name = "aid", referencedColumnName = "id", nullable = false,insertable=false,updatable=false)
    public CommonAreaEntity getCommonAreaByAid() {
        return commonAreaByAid;
    }

    public void setCommonAreaByAid(CommonAreaEntity commonAreaByAid) {
        this.commonAreaByAid = commonAreaByAid;
    }

    @ManyToOne
    @JoinColumn(name = "tid", referencedColumnName = "id", nullable = false,insertable=false,updatable=false)
    public ProductTypeEntity getProductTypeByTid() {
        return productTypeByTid;
    }

    public void setProductTypeByTid(ProductTypeEntity productTypeByTid) {
        this.productTypeByTid = productTypeByTid;
    }
}
