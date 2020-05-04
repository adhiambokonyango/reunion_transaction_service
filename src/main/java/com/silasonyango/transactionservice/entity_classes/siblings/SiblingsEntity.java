package com.silasonyango.transactionservice.entity_classes.siblings;
import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "siblings")
public class SiblingsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SiblingId")
    private int siblingId;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "RelativeId")
    private int relativeId;

    @Column(name = "GenderId")
    private int genderId;

    public int getSiblingId() {
        return siblingId;
    }

    public void setSiblingId(int siblingId) {
        this.siblingId = siblingId;
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
