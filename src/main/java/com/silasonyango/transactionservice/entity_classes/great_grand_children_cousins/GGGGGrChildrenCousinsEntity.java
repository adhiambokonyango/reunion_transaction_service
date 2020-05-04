package com.silasonyango.transactionservice.entity_classes.great_grand_children_cousins;

import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "gggggr_children_cousins")
public class GGGGGrChildrenCousinsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GGGGGrChildrenCousinId")
    private int gggggrChildrenCousinId;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "RelativeId")
    private int relativeId;

    @Column(name = "GenderId")
    private int genderId;

    public int getGggggrChildrenCousinId() {
        return gggggrChildrenCousinId;
    }

    public void setGggggrChildrenCousinId(int gggggrChildrenCousinId) {
        this.gggggrChildrenCousinId = gggggrChildrenCousinId;
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
