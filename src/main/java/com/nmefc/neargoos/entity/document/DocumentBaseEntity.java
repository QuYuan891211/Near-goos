package com.nmefc.neargoos.entity.document;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "document_base", schema = "neargoos", catalog = "")
public class DocumentBaseEntity {
    private int id;
    private String name;
    private Byte isDel;
    private Integer pid;
    private Integer tid;
    private Integer cid;
    private Integer iid;
    private String pageArea;
    private Timestamp gmtCreate;
    private Timestamp gmtModified;

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
    @Column(name = "is_del")
    public Byte getIsDel() {
        return isDel;
    }

    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
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
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "cid")
    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Basic
    @Column(name = "iid")
    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    @Basic
    @Column(name = "page_area")
    public String getPageArea() {
        return pageArea;
    }

    public void setPageArea(String pageArea) {
        this.pageArea = pageArea;
    }

    @Basic
    @Column(name = "gmt_create")
    public Timestamp getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Timestamp gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Basic
    @Column(name = "gmt_modified")
    public Timestamp getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Timestamp gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocumentBaseEntity that = (DocumentBaseEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(isDel, that.isDel) &&
                Objects.equals(pid, that.pid) &&
                Objects.equals(tid, that.tid) &&
                Objects.equals(cid, that.cid) &&
                Objects.equals(iid, that.iid) &&
                Objects.equals(pageArea, that.pageArea) &&
                Objects.equals(gmtCreate, that.gmtCreate) &&
                Objects.equals(gmtModified, that.gmtModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, isDel, pid, tid, cid, iid, pageArea, gmtCreate, gmtModified);
    }
}
