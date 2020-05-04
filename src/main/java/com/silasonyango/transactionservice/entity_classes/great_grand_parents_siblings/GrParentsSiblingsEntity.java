package com.silasonyango.transactionservice.entity_classes.great_grand_parents_siblings;

import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "gr_parents_siblings")
public class GrParentsSiblingsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GrPSId")
    private int grPSId;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "RelativeId")
    private int relativeId;

    @Column(name = "GenderId")
    private int genderId;

    public int getGrPSId() {
        return grPSId;
    }

    public void setGrPSId(int grPSId) {
        this.grPSId = grPSId;
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
