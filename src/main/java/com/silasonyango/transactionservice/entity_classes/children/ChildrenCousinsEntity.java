package com.silasonyango.transactionservice.entity_classes.children;

import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "children_cousins")
public class ChildrenCousinsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ChildrenCousinId")
    private int childrenCousinId;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "RelativeId")
    private int relativeId;

    @Column(name = "GenderId")
    private int genderId;

    public int getChildrenCousinId() {
        return childrenCousinId;
    }

    public void setChildrenCousinId(int childrenCousinId) {
        this.childrenCousinId = childrenCousinId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRelativeId() {
        return relativeId;
    }

    public void setRelativeId(int relativeId) {
        this.relativeId = relativeId;
    }

    public int getGenderId() {
        return genderId;
    }

    public void setGenderId(int genderId) {
        this.genderId = genderId;
    }
}
