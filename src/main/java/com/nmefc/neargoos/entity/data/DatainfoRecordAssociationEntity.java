package com.nmefc.neargoos.entity.data;

import javax.persistence.*;

@Entity
@Table(name = "datainfo_record_association", schema = "neargoos", catalog = "")
@IdClass(DatainfoRecordAssociationEntityPK.class)
public class DatainfoRecordAssociationEntity {
    private long rid;
    private long did;

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
}
