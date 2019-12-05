package com.nmefc.neargoos.entity.product;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class AreaCategoryAssociationEntityPK implements Serializable {
    private int aid;
    private int tid;

    @Column(name = "aid")
    @Id
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    @Column(name = "tid")
    @Id
    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AreaCategoryAssociationEntityPK that = (AreaCategoryAssociationEntityPK) o;
        return aid == that.aid &&
                tid == that.tid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(aid, tid);
    }
}
