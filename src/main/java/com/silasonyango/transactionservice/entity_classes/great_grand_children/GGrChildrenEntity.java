package com.silasonyango.transactionservice.entity_classes.great_grand_children;

import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "ggr_children")
public class GGrChildrenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GGrCId")
    private int ggrCId;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "RelativeId")
    private int relativeId;

    @Column(name = "GenderId")
    private int genderId;

    public int getGgrCId() {
        return ggrCId;
    }

    public void setGgrCId(int ggrCId) {
        this.ggrCId = ggrCId;
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

