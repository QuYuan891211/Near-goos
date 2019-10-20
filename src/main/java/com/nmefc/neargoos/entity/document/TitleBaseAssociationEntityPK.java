package com.nmefc.neargoos.entity.document;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

public class TitleBaseAssociationEntityPK implements Serializable {
    private long tid;
    private Long bid;
    private DocumentTitleEntity documentTitleByTid;
    private DocumentBaseEntity documentBaseByBid;

    @Id
    @Column(name = "tid")
    public long getTid() {
        return tid;
    }

    public void setTid(long tid) {
        this.tid = tid;
    }

    @Id
    @Column(name = "bid")
    public Long getBid() {
        return bid;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TitleBaseAssociationEntityPK that = (TitleBaseAssociationEntityPK) o;
        return tid == that.tid &&
                Objects.equals(bid, that.bid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tid, bid);
    }

}
