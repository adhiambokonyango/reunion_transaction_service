package com.silasonyango.transactionservice.entity_classes.great_grand_children_cousins;

import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "ggggr_children_cousins")
public class GGGGrChildrenCousinsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GGGGrChildrenCousinId")
    private int ggggrChildrenCousinId;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "RelativeId")
    private int relativeId;

    @Column(name = "GenderId")
    private int genderId;

    public int getGgggrChildrenCousinId() {
        return ggggrChildrenCousinId;
    }

    public void setGgggrChildrenCousinId(int ggggrChildrenCousinId) {
        this.ggggrChildrenCousinId = ggggrChildrenCousinId;
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
