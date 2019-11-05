package com.nmefc.neargoos.entity.document;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tab_base_association", schema = "neargoos", catalog = "")
@IdClass(TabBaseAssociationEntityPK.class)
public class TabBaseAssociationEntity {
//    @Column(insertable=false,updatable=false)
    private long bid;
//    @Column(insertable=false,updatable=false)
    private long tabid;
    private DocumentBaseEntity documentBaseByBid;
    private DocumentTabEntity documentTabByTabid;

    @Id
    @Column(name = "bid")
    public long getBid() {
        return bid;
    }

    public void setBid(long bid) {
        this.bid = bid;
    }

    @Id
    @Column(name = "tabid")
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
        TabBaseAssociationEntity that = (TabBaseAssociationEntity) o;
        return bid == that.bid &&
                tabid == that.tabid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bid, tabid);
    }

    @ManyToOne
    @JoinColumn(name = "bid", referencedColumnName = "id", nullable = false,insertable=false,updatable=false)
    public DocumentBaseEntity getDocumentBaseByBid() {
        return documentBaseByBid;
    }

    public void setDocumentBaseByBid(DocumentBaseEntity documentBaseByBid) {
        this.documentBaseByBid = documentBaseByBid;
    }

    @ManyToOne
    @JoinColumn(name = "tabid", referencedColumnName = "id", nullable = false,insertable=false,updatable=false)
    public DocumentTabEntity getDocumentTabByTabid() {
        return documentTabByTabid;
    }

    public void setDocumentTabByTabid(DocumentTabEntity documentTabByTabid) {
        this.documentTabByTabid = documentTabByTabid;
    }
}
