package com.silasonyango.transactionservice.entity_classes.great_grand_children_cousins;

import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "gr_children_cousins")
public class GrChildrenCousinsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GrChildrenCousinId")
    private int grChildrenCousinId;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "RelativeId")
    private int relativeId;

    @Column(name = "GenderId")
    private int genderId;

    public int getGrChildrenCousinId() {
        return grChildrenCousinId;
    }

    public void setGrChildrenCousinId(int grChildrenCousinId) {
        this.grChildrenCousinId = grChildrenCousinId;
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
