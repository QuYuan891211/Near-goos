package com.nmefc.neargoos.middleModel;

import com.nmefc.neargoos.entity.document.DocumentTabEntity;

import java.util.List;

public class TabMidModel {
    private DocumentTabEntity parent;
    private List<DocumentTabEntity> children;

    public void setChildren(List<DocumentTabEntity> children) {
        this.children = children;
    }

    public void setParent(DocumentTabEntity parent) {
        this.parent = parent;
    }

    public DocumentTabEntity getParent() {
        return parent;
    }

    public List<DocumentTabEntity> getChildren() {
        return children;
    }

    public TabMidModel(DocumentTabEntity parent, List<DocumentTabEntity> children) {
        this.children = children;
        this.parent = parent;
    }
}
