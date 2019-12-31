package com.nmefc.neargoos.entity.product;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Data
@Entity
@Table(name = "product_type", schema = "neargoos", catalog = "")
public class ProductTypeEntity {
    private int id;
    private String name;
    private String remark;

    @JsonIgnore
    private Collection<AreaCategoryAssociationEntity> areaCategoryAssociationsById;
    @JsonIgnore
    private Collection<ProductPeriodEntity> productPeriodsById;

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
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductTypeEntity that = (ProductTypeEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, remark);
    }

    @OneToMany(mappedBy = "productTypeByTid")
    public Collection<AreaCategoryAssociationEntity> getAreaCategoryAssociationsById() {
        return areaCategoryAssociationsById;
    }

    public void setAreaCategoryAssociationsById(Collection<AreaCategoryAssociationEntity> areaCategoryAssociationsById) {
        this.areaCategoryAssociationsById = areaCategoryAssociationsById;
    }

    @OneToMany(mappedBy = "productTypeByTid")
    public Collection<ProductPeriodEntity> getProductPeriodsById() {
        return productPeriodsById;
    }

    public void setProductPeriodsById(Collection<ProductPeriodEntity> productPeriodsById) {
        this.productPeriodsById = productPeriodsById;
    }
}
