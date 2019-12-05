package com.nmefc.neargoos.entity.product;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "common_area", schema = "neargoos", catalog = "")
public class CommonAreaEntity {
    private int id;
    private Integer pid;
    private String name;
    private String remark;
    private Collection<AreaCategoryAssociationEntity> areaCategoryAssociationsById;
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
    @Column(name = "pid")
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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
        CommonAreaEntity that = (CommonAreaEntity) o;
        return id == that.id &&
                Objects.equals(pid, that.pid) &&
                Objects.equals(name, that.name) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pid, name, remark);
    }

    @OneToMany(mappedBy = "commonAreaByAid")
    public Collection<AreaCategoryAssociationEntity> getAreaCategoryAssociationsById() {
        return areaCategoryAssociationsById;
    }

    public void setAreaCategoryAssociationsById(Collection<AreaCategoryAssociationEntity> areaCategoryAssociationsById) {
        this.areaCategoryAssociationsById = areaCategoryAssociationsById;
    }

    @OneToMany(mappedBy = "commonAreaByAid")
    public Collection<ProductPeriodEntity> getProductPeriodsById() {
        return productPeriodsById;
    }

    public void setProductPeriodsById(Collection<ProductPeriodEntity> productPeriodsById) {
        this.productPeriodsById = productPeriodsById;
    }
}
