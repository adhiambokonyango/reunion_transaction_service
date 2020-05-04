package com.silasonyango.transactionservice.entity_classes.great_grand_children;

import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "gr_children")
public class GrChildrenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GrCId")
    private int grCId;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "RelativeId")
    private int relativeId;

    @Column(name = "GenderId")
    private int genderId;

    public int getGrCId() {
        return grCId;
    }

    public void setGgrCId(int grCId) {
        this.grCId = grCId;
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

