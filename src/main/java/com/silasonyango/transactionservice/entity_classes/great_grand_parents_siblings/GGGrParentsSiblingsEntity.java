package com.silasonyango.transactionservice.entity_classes.great_grand_parents_siblings;

import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "gggr_parents_siblings")
public class GGGrParentsSiblingsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GGGrPSId")
    private int gggrPSId;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "RelativeId")
    private int relativeId;

    @Column(name = "GenderId")
    private int genderId;

    public int getGggrPSId() {
        return gggrPSId;
    }

    public void setGggrPSId(int gggrPSId) {
        this.gggrPSId = gggrPSId;
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
