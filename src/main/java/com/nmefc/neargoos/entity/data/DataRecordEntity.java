package com.nmefc.neargoos.entity.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "data_record", schema = "neargoos", catalog = "")
public class DataRecordEntity extends DataBaseEntity {
//    private long id;
//    private Timestamp gmtCreate;
//    private Timestamp gmtModified;
//    private byte isDelete;
    private byte state;
    private String ip;
//    private String name;
//    @OneToMany(mappedBy = "dataRecordByRid",fetch = FetchType.LAZY)
//    private Collection<DatainfoRecordAssociationEntity> datainfoRecordAssociationsById;
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
    @Column(name = "state")
    public byte getState() {
        return state;
    }

    public void setState(byte state) {
        this.state = state;
    }

    @Basic
    @Column(name = "ip")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataRecordEntity that = (DataRecordEntity) o;

        if (id != that.id) return false;
        if (isDelete != that.isDelete) return false;
        if (state != that.state) return false;
        if (gmtCreate != null ? !gmtCreate.equals(that.gmtCreate) : that.gmtCreate != null) return false;
        if (gmtModified != null ? !gmtModified.equals(that.gmtModified) : that.gmtModified != null) return false;
        if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (gmtCreate != null ? gmtCreate.hashCode() : 0);
        result = 31 * result + (gmtModified != null ? gmtModified.hashCode() : 0);
        result = 31 * result + (int) isDelete;
        result = 31 * result + (int) state;
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }


//    public Collection<DatainfoRecordAssociationEntity> getDatainfoRecordAssociationsById() {
//        return datainfoRecordAssociationsById;
//    }
//
//    public void setDatainfoRecordAssociationsById(Collection<DatainfoRecordAssociationEntity> datainfoRecordAssociationsById) {
//        this.datainfoRecordAssociationsById = datainfoRecordAssociationsById;
//    }
}
