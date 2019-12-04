package com.nmefc.neargoos.entity.product;

import javax.persistence.*;
import java.util.Objects;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: evase
 * \* Date: 2019/12/4
 * \* Time: 19:10
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Entity
@Table(name = "product_period", schema = "neargoos", catalog = "")
public class ProductPeriodEntity {
    private int id;
    private String period;
    private int aid;
    private int tid;
    private CommonAreaEntity commonAreaByAid;
    private ProductTypeEntity productTypeByTid;
    private String periods;
    private String periodsindex;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "period")
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductPeriodEntity that = (ProductPeriodEntity) o;
        return id == that.id &&
                Objects.equals(period, that.period);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, period);
    }

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

    @ManyToOne
    @JoinColumn(name = "aid", referencedColumnName = "id", nullable = false)
    public CommonAreaEntity getCommonAreaByAid() {
        return commonAreaByAid;
    }

    public void setCommonAreaByAid(CommonAreaEntity commonAreaByAid) {
        this.commonAreaByAid = commonAreaByAid;
    }

    @ManyToOne
    @JoinColumn(name = "tid", referencedColumnName = "id", nullable = false)
    public ProductTypeEntity getProductTypeByTid() {
        return productTypeByTid;
    }

    public void setProductTypeByTid(ProductTypeEntity productTypeByTid) {
        this.productTypeByTid = productTypeByTid;
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
}
