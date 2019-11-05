package com.nmefc.neargoos.entity.document;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class TabBaseAssociationEntityPK implements Serializable {
    private long bid;
    private long tabid;

    @Column(name = "bid")
    @Id
    public long getBid() {
        return bid;
    }

    public void setBid(long bid) {
        this.bid = bid;
    }

    @Column(name = "tabid")
    @Id
    public long getTabid() {
        return tabid;
    }

    public void setTabid(long tabid) {
        this.tabid = tabid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabBaseAssociationEntityPK that = (TabBaseAssociationEntityPK) o;
        return bid == that.bid &&
                tabid == that.tabid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bid, tabid);
    }
}
