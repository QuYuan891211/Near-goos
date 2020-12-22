package com.nmefc.neargoos.entity.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "data_data_info", schema = "neargoos", catalog = "")
public class DataDataInfoEntity extends DataBaseEntity {
//    private long id;
//    private Timestamp gmtCreate;
//    private Timestamp gmtModified;
//    private byte isDelete;
//    private String name;
    private String extensions;
    private String remark;
    private Date date;
    private byte isDesc;
    @Basic
    @Column(name = "category_id")
    private Long categoryId;
    @Basic
    @Column(name = "source_id")
    private Long sourceId;
    @Basic
    @Column(name = "area_id")
    private Long areaId;
    private String url;
    private Timestamp dateFtp;
    private Long size;
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id", insertable = false, updatable = false)
    private DataCategoryEntity dataCategoryByCategoryId;
    @ManyToOne
    @JoinColumn(name = "source_id", referencedColumnName = "id", insertable = false, updatable = false)
    private DataSourceEntity dataSourceBySourceId;
    @ManyToOne
    @JoinColumn(name = "area_id", referencedColumnName = "id", insertable = false, updatable = false)
    private DataAreaEntity dataAreaByAreaId;
//    @OneToMany(mappedBy = "dataDataInfoByDid",fetch = FetchType.LAZY)
//    private Collection<DatainfoRecordAssociationEntity> datainfoRecordAssociationsById;

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
    @Column(name = "extensions")
    public String getExtensions() {
        return extensions;
    }

    public void setExtensions(String extensions) {
        this.extensions = extensions;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "is_desc")
    public byte getIsDesc() {
        return isDesc;
    }

    public void setIsDesc(byte isDesc) {
        this.isDesc = isDesc;
    }


    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }


    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }


    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    @Basic
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "date_ftp")
    public Timestamp getDateFtp() {
        return dateFtp;
    }

    public void setDateFtp(Timestamp dateFtp) {
        this.dateFtp = dateFtp;
    }

    @Basic
    @Column(name = "size")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataDataInfoEntity that = (DataDataInfoEntity) o;

        if (id != that.id) return false;
        if (isDelete != that.isDelete) return false;
        if (isDesc != that.isDesc) return false;
        if (gmtCreate != null ? !gmtCreate.equals(that.gmtCreate) : that.gmtCreate != null) return false;
        if (gmtModified != null ? !gmtModified.equals(that.gmtModified) : that.gmtModified != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (extensions != null ? !extensions.equals(that.extensions) : that.extensions != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (sourceId != null ? !sourceId.equals(that.sourceId) : that.sourceId != null) return false;
        if (areaId != null ? !areaId.equals(that.areaId) : that.areaId != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (dateFtp != null ? !dateFtp.equals(that.dateFtp) : that.dateFtp != null) return false;
        if (size != null ? !size.equals(that.size) : that.size != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (gmtCreate != null ? gmtCreate.hashCode() : 0);
        result = 31 * result + (gmtModified != null ? gmtModified.hashCode() : 0);
        result = 31 * result + (int) isDelete;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (extensions != null ? extensions.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (int) isDesc;
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        result = 31 * result + (sourceId != null ? sourceId.hashCode() : 0);
        result = 31 * result + (areaId != null ? areaId.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (dateFtp != null ? dateFtp.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        return result;
    }


    public DataCategoryEntity getDataCategoryByCategoryId() {
        return dataCategoryByCategoryId;
    }

    public void setDataCategoryByCategoryId(DataCategoryEntity dataCategoryByCategoryId) {
        this.dataCategoryByCategoryId = dataCategoryByCategoryId;
    }


    public DataSourceEntity getDataSourceBySourceId() {
        return dataSourceBySourceId;
    }

    public void setDataSourceBySourceId(DataSourceEntity dataSourceBySourceId) {
        this.dataSourceBySourceId = dataSourceBySourceId;
    }


    public DataAreaEntity getDataAreaByAreaId() {
        return dataAreaByAreaId;
    }

    public void setDataAreaByAreaId(DataAreaEntity dataAreaByAreaId) {
        this.dataAreaByAreaId = dataAreaByAreaId;
    }


//    public Collection<DatainfoRecordAssociationEntity> getDatainfoRecordAssociationsById() {
//        return datainfoRecordAssociationsById;
//    }
//
//    public void setDatainfoRecordAssociationsById(Collection<DatainfoRecordAssociationEntity> datainfoRecordAssociationsById) {
//        this.datainfoRecordAssociationsById = datainfoRecordAssociationsById;
//    }
}
