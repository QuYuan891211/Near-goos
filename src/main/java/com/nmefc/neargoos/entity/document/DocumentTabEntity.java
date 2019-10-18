package com.nmefc.neargoos.entity.document;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "document_tab", schema = "neargoos", catalog = "")
public class DocumentTabEntity {
    private int id;
    private String name;
    private String viewName;
    private String url;
    private Byte idDel;
    private String icon;
    private String imageUrl;
    private String imageHeight;
    private String imageWidth;
    private Integer level;
    private Integer pid;
    private Timestamp gmtCreate;
    private Timestamp gmtModified;
    private Integer dbid;

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
    @Column(name = "view_name")
    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
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
    @Column(name = "id_del")
    public Byte getIdDel() {
        return idDel;
    }

    public void setIdDel(Byte idDel) {
        this.idDel = idDel;
    }

    @Basic
    @Column(name = "icon")
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Basic
    @Column(name = "image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Basic
    @Column(name = "image_height")
    public String getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(String imageHeight) {
        this.imageHeight = imageHeight;
    }

    @Basic
    @Column(name = "image_width")
    public String getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(String imageWidth) {
        this.imageWidth = imageWidth;
    }

    @Basic
    @Column(name = "level")
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
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

    @Basic
    @Column(name = "dbid")
    public Integer getDbid() {
        return dbid;
    }

    public void setDbid(Integer dbid) {
        this.dbid = dbid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocumentTabEntity that = (DocumentTabEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(viewName, that.viewName) &&
                Objects.equals(url, that.url) &&
                Objects.equals(idDel, that.idDel) &&
                Objects.equals(icon, that.icon) &&
                Objects.equals(imageUrl, that.imageUrl) &&
                Objects.equals(imageHeight, that.imageHeight) &&
                Objects.equals(imageWidth, that.imageWidth) &&
                Objects.equals(level, that.level) &&
                Objects.equals(pid, that.pid) &&
                Objects.equals(gmtCreate, that.gmtCreate) &&
                Objects.equals(gmtModified, that.gmtModified) &&
                Objects.equals(dbid, that.dbid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, viewName, url, idDel, icon, imageUrl, imageHeight, imageWidth, level, pid, gmtCreate, gmtModified, dbid);
    }
}
