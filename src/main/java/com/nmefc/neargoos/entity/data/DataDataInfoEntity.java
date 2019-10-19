package com.nmefc.neargoos.entity.data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "data_data_info", schema = "neargoos", catalog = "")
public class DataDataInfoEntity extends DataBaseEntity{
//    private long id;
//    private Timestamp gmtCreate;
//    private Timestamp gmtModified;
//    private byte isDelete;
    private String filename;
    private String extensions;
    private String remark;
    private Timestamp date;
    private byte isDesc;
    private Long categoryId;
    private Long sourceId;
    private Long areaId;
    private String url;

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
    @Column(name = "filename")
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

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
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
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

    @Basic
    @Column(name = "category_id")
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "source_id")
    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    @Basic
    @Column(name = "area_id")
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
        if (filename != null ? !filename.equals(that.filename) : that.filename != null) return false;
        if (extensions != null ? !extensions.equals(that.extensions) : that.extensions != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (sourceId != null ? !sourceId.equals(that.sourceId) : that.sourceId != null) return false;
        if (areaId != null ? !areaId.equals(that.areaId) : that.areaId != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (gmtCreate != null ? gmtCreate.hashCode() : 0);
        result = 31 * result + (gmtModified != null ? gmtModified.hashCode() : 0);
        result = 31 * result + (int) isDelete;
        result = 31 * result + (filename != null ? filename.hashCode() : 0);
        result = 31 * result + (extensions != null ? extensions.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (int) isDesc;
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        result = 31 * result + (sourceId != null ? sourceId.hashCode() : 0);
        result = 31 * result + (areaId != null ? areaId.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }
}
