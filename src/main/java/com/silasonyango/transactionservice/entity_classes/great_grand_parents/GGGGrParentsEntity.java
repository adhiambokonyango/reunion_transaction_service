package com.silasonyango.transactionservice.entity_classes.great_grand_parents;

import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "ggggr_parents")
public class GGGGrParentsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GGGGrPId")
    private int ggggrPId;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "RelativeId")
    private int relativeId;

    @Column(name = "GenderId")
    private int genderId;

    public int getGgggrPId() {
        return ggggrPId;
    }

    public void setGgggrPId(int ggggrPId) {
        this.ggggrPId = ggggrPId;
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
