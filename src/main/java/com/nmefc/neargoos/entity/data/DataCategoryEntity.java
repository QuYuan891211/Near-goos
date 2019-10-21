package com.nmefc.neargoos.entity.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "data_category", schema = "neargoos", catalog = "")
public class DataCategoryEntity extends DataBaseEntity{
//    private long id;
//    private Timestamp gmtCreate;
//    private Timestamp gmtModified;
//    private byte isDelete;
//    private String name;
    private String remark;
//    @OneToMany(mappedBy = "dataCategoryByCategoryId",fetch = FetchType.LAZY )
//    private Collection<DataDataInfoEntity> dataDataInfosById;

//    @Id
//    @Column(name = "id")
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    @Basic
//    @Column(name = "gmt_create")
//    public Timestamp getGmtCreate() {
//        return gmtCreate;
//    }
//
//    public void setGmtCreate(Timestamp gmtCreate) {
//        this.gmtCreate = gmtCreate;
//    }
//
//    @Basic
//    @Column(name = "gmt_modified")
//    public Timestamp getGmtModified() {
//        return gmtModified;
//    }
//
//    public void setGmtModified(Timestamp gmtModified) {
//        this.gmtModified = gmtModified;
//    }
//
//    @Basic
//    @Column(name = "is_delete")
//    public byte getIsDelete() {
//        return isDelete;
//    }
//
//    public void setIsDelete(byte isDelete) {
//        this.isDelete = isDelete;
//    }
//
//    @Basic
//    @Column(name = "name")
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

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

        DataCategoryEntity that = (DataCategoryEntity) o;

        if (id != that.id) return false;
        if (isDelete != that.isDelete) return false;
        if (gmtCreate != null ? !gmtCreate.equals(that.gmtCreate) : that.gmtCreate != null) return false;
        if (gmtModified != null ? !gmtModified.equals(that.gmtModified) : that.gmtModified != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (gmtCreate != null ? gmtCreate.hashCode() : 0);
        result = 31 * result + (gmtModified != null ? gmtModified.hashCode() : 0);
        result = 31 * result + (int) isDelete;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }


//    public Collection<DataDataInfoEntity> getDataDataInfosById() {
//        return dataDataInfosById;
//    }
//
//    public void setDataDataInfosById(Collection<DataDataInfoEntity> dataDataInfosById) {
//        this.dataDataInfosById = dataDataInfosById;
//    }
}
