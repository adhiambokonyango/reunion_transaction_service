package com.silasonyango.transactionservice.entity_classes.parents;
import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "parent_cousins")
public class ParentsCousinsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ParentCousinsId")
    private int parentCousinsId;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "RelativeId")
    private int relativeId;

    @Column(name = "GenderId")
    private int genderId;

    public int getParentCousinsId() {
        return parentCousinsId;
    }

    public void setParentCousinsId(int parentCousinsId) {
        this.parentCousinsId = parentCousinsId;
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
