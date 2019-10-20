package com.nmefc.neargoos.entity.document;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "image_base_association", schema = "neargoos", catalog = "")
@IdClass(ImageBaseAssociationEntityPK.class)
public class ImageBaseAssociationEntity {
    private long bid;
    private Long imageid;
    private DocumentBaseEntity documentBaseByBid;
    private DocumentImageEntity documentImageByImageid;

    @Id
    @Basic
    @Column(name = "bid")
    public long getBid() {
        return bid;
    }

    public void setBid(long bid) {
        this.bid = bid;
    }

    @Id
    @Basic
    @Column(name = "imageid")
    public Long getImageid() {
        return imageid;
    }

    public void setImageid(Long imageid) {
        this.imageid = imageid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImageBaseAssociationEntity that = (ImageBaseAssociationEntity) o;
        return bid == that.bid &&
                Objects.equals(imageid, that.imageid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bid, imageid);
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
    @JoinColumn(name = "imageid", referencedColumnName = "id",insertable=false,updatable=false)
    public DocumentImageEntity getDocumentImageByImageid() {
        return documentImageByImageid;
    }

    public void setDocumentImageByImageid(DocumentImageEntity documentImageByImageid) {
        this.documentImageByImageid = documentImageByImageid;
    }
}
