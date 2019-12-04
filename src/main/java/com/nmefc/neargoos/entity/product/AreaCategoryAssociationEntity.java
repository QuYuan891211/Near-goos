package com.nmefc.neargoos.entity.product;

import javax.persistence.*;
import java.util.Collection;
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
@Table(name = "area_category_association", schema = "neargoos", catalog = "")
public class AreaCategoryAssociationEntity {
    private int id;
    private int aid;
    private CommonAreaEntity commonAreaByAid;
    private ProductTypeEntity productTypeByTid;
    private Collection<ProductInfoEntity> productInfosById;
    private int tid;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AreaCategoryAssociationEntity that = (AreaCategoryAssociationEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Basic
    @Column(name = "aid")
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
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

    @OneToMany(mappedBy = "areaCategoryAssociationByAreaType")
    public Collection<ProductInfoEntity> getProductInfosById() {
        return productInfosById;
    }

    public void setProductInfosById(Collection<ProductInfoEntity> productInfosById) {
        this.productInfosById = productInfosById;
    }

    @Basic
    @Column(name = "tid")
    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }
}
