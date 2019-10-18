package com.nmefc.neargoos.entity.document;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tab_base_association", schema = "neargoos", catalog = "")
@IdClass(TabBaseAssociationEntityPK.class)
public class TabBaseAssociationEntity {
    private int bid;
    private int tabid;

    @Id
    @Column(name = "bid")
    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    @Id
    @Column(name = "tabid")
    public int getTabid() {
        return tabid;
    }

    public void setTabid(int tabid) {
        this.tabid = tabid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabBaseAssociationEntity that = (TabBaseAssociationEntity) o;
        return bid == that.bid &&
                tabid == that.tabid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bid, tabid);
    }
}
