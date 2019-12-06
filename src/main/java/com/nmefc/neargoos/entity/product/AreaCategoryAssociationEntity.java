package com.nmefc.neargoos.entity.product;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "area_category_association", schema = "neargoos", catalog = "")
@IdClass(AreaCategoryAssociationEntityPK.class)
public class AreaCategoryAssociationEntity {
    private int aid;
    private int tid;
    private CommonAreaEntity commonAreaByAid;
    private ProductTypeEntity productTypeByTid;

    @Id
    @Column(name = "aid")
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    @Id
    @Column(name = "tid")
    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AreaCategoryAssociationEntity that = (AreaCategoryAssociationEntity) o;
        return aid == that.aid &&
                tid == that.tid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(aid, tid);
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
