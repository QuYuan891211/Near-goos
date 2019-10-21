package com.nmefc.neargoos.entity.data;

import javax.persistence.*;

@Entity
@Table(name = "datainfo_record_association", schema = "neargoos", catalog = "")
@IdClass(DatainfoRecordAssociationEntityPK.class)
public class DatainfoRecordAssociationEntity {
    private long rid;
    private long did;
    private DataRecordEntity dataRecordByRid;
    private DataDataInfoEntity dataDataInfoByDid;

    @Id
    @Column(name = "rid")
    public long getRid() {
        return rid;
    }

    public void setRid(long rid) {
        this.rid = rid;
    }

    @Id
    @Column(name = "did")
    public long getDid() {
        return did;
    }

    public void setDid(long did) {
        this.did = did;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DatainfoRecordAssociationEntity that = (DatainfoRecordAssociationEntity) o;

        if (rid != that.rid) return false;
        if (did != that.did) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (rid ^ (rid >>> 32));
        result = 31 * result + (int) (did ^ (did >>> 32));
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "rid", referencedColumnName = "id", nullable = false,insertable = false, updatable = false)
    public DataRecordEntity getDataRecordByRid() {
        return dataRecordByRid;
    }

    public void setDataRecordByRid(DataRecordEntity dataRecordByRid) {
        this.dataRecordByRid = dataRecordByRid;
    }

    @ManyToOne
    @JoinColumn(name = "did", referencedColumnName = "id", nullable = false,insertable = false, updatable = false)
    public DataDataInfoEntity getDataDataInfoByDid() {
        return dataDataInfoByDid;
    }

    public void setDataDataInfoByDid(DataDataInfoEntity dataDataInfoByDid) {
        this.dataDataInfoByDid = dataDataInfoByDid;
    }
}
