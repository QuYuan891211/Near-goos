package com.nmefc.neargoos.entity.document;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "title_base_association", schema = "neargoos", catalog = "")
@IdClass(TitleBaseAssociationEntityPK.class)
public class TitleBaseAssociationEntity {
    private long tid;
    private Long bid;
    private DocumentTitleEntity documentTitleByTid;
    private DocumentBaseEntity documentBaseByBid;

    @Id
    @Basic
    @Column(name = "tid")
    public long getTid() {
        return tid;
    }

    public void setTid(long tid) {
        this.tid = tid;
    }

    @Id
    @Basic
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
        TitleBaseAssociationEntity that = (TitleBaseAssociationEntity) o;
        return tid == that.tid &&
                Objects.equals(bid, that.bid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tid, bid);
    }

    @ManyToOne
    @JoinColumn(name = "tid", referencedColumnName = "id", nullable = false,insertable=false,updatable=false)
    public DocumentTitleEntity getDocumentTitleByTid() {
        return documentTitleByTid;
    }

    public void setDocumentTitleByTid(DocumentTitleEntity documentTitleByTid) {
        this.documentTitleByTid = documentTitleByTid;
    }

    @ManyToOne
    @JoinColumn(name = "bid", referencedColumnName = "id",insertable=false,updatable=false)
    public DocumentBaseEntity getDocumentBaseByBid() {
        return documentBaseByBid;
    }

    public void setDocumentBaseByBid(DocumentBaseEntity documentBaseByBid) {
        this.documentBaseByBid = documentBaseByBid;
    }
}
