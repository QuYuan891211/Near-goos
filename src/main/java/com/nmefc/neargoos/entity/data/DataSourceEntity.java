package com.nmefc.neargoos.entity.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "data_source", schema = "neargoos", catalog = "")
public class DataSourceEntity extends DataBaseEntity{
//    private long id;
//    private Timestamp gmtCreate;
//    private Timestamp gmtModified;
//    private byte isDelete;
    private String imgUrl;
//    private String name;
    private String homepageUrl;
//    @OneToMany(mappedBy = "dataSourceBySourceId",fetch = FetchType.LAZY)
//    private Collection<DataDataInfoEntity> dataDataInfosById;
//
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

    @Basic
    @Column(name = "img_url")
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
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
    @Column(name = "homepage_url")
    public String getHomepageUrl() {
        return homepageUrl;
    }

    public void setHomepageUrl(String homepageUrl) {
        this.homepageUrl = homepageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataSourceEntity that = (DataSourceEntity) o;

        if (id != that.id) return false;
        if (isDelete != that.isDelete) return false;
        if (gmtCreate != null ? !gmtCreate.equals(that.gmtCreate) : that.gmtCreate != null) return false;
        if (gmtModified != null ? !gmtModified.equals(that.gmtModified) : that.gmtModified != null) return false;
        if (imgUrl != null ? !imgUrl.equals(that.imgUrl) : that.imgUrl != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (homepageUrl != null ? !homepageUrl.equals(that.homepageUrl) : that.homepageUrl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (gmtCreate != null ? gmtCreate.hashCode() : 0);
        result = 31 * result + (gmtModified != null ? gmtModified.hashCode() : 0);
        result = 31 * result + (int) isDelete;
        result = 31 * result + (imgUrl != null ? imgUrl.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (homepageUrl != null ? homepageUrl.hashCode() : 0);
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
