package com.nmefc.neargoos.entity.data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class DatainfoRecordAssociationEntityPK implements Serializable {
    private long rid;
    private long did;

    @Column(name = "rid")
    @Id
    public long getRid() {
        return rid;
    }

    public void setRid(long rid) {
        this.rid = rid;
    }

    @Column(name = "did")
    @Id
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

        DatainfoRecordAssociationEntityPK that = (DatainfoRecordAssociationEntityPK) o;

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
