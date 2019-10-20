package com.nmefc.neargoos.entity.document;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


public class ImageBaseAssociationEntityPK implements Serializable {
    private long bid;
    private Long imageid;
    private DocumentBaseEntity documentBaseByBid;
    private DocumentImageEntity documentImageByImageid;

    @Id
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
        ImageBaseAssociationEntityPK that = (ImageBaseAssociationEntityPK) o;
        return bid == that.bid &&
                Objects.equals(imageid, that.imageid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bid, imageid);
    }

}
