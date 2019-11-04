package com.nmefc.neargoos.entity.document;

import javax.persistence.*;
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
@Entity
@Table(name = "content_base_association", schema = "neargoos", catalog = "")
@IdClass(ContentBaseAssociationEntityPK.class)
public class ContentBaseAssociationEntity {
    private long bid;
    private long cid;
    private DocumentBaseEntity documentBaseByBid;
    private DocumentContentEntity documentContentByCid;

    @Id
    @Column(name = "bid")
    public long getBid() {
        return bid;
    }

    public void setBid(long bid) {
        this.bid = bid;
    }

    @Id
    @Column(name = "cid")
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
        ContentBaseAssociationEntity that = (ContentBaseAssociationEntity) o;
        return bid == that.bid &&
                cid == that.cid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bid, cid);
    }

    @ManyToOne
    @JoinColumn(name = "bid", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public DocumentBaseEntity getDocumentBaseByBid() {
        return documentBaseByBid;
    }

    public void setDocumentBaseByBid(DocumentBaseEntity documentBaseByBid) {
        this.documentBaseByBid = documentBaseByBid;
    }

    @ManyToOne
    @JoinColumn(name = "cid", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public DocumentContentEntity getDocumentContentByCid() {
        return documentContentByCid;
    }

    public void setDocumentContentByCid(DocumentContentEntity documentContentByCid) {
        this.documentContentByCid = documentContentByCid;
    }
}
