package com.silasonyango.transactionservice.entity_classes.cousins;

import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "cousins")
public class CousinsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CousinsId")
    private int cousinsId;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "RelativeId")
    private int relativeId;

    @Column(name = "GenderId")
    private int genderId;

    public int getCousinsId() {
        return cousinsId;
    }

    public void setCousinsId(int cousinsId) {
        this.cousinsId = cousinsId;
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
