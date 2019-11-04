package com.nmefc.neargoos.entity.document;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: DELL
 * \* Date: 2019/10/22
 * \* Time: 15:12
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class ContentBaseAssociationEntityPK implements Serializable {
    private long bid;
    private long cid;

    @Column(name = "bid")
    @Id
    public long getBid() {
        return bid;
    }

    public void setBid(long bid) {
        this.bid = bid;
    }

    @Column(name = "cid")
    @Id
    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContentBaseAssociationEntityPK that = (ContentBaseAssociationEntityPK) o;
        return bid == that.bid &&
                cid == that.cid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bid, cid);
    }
}
