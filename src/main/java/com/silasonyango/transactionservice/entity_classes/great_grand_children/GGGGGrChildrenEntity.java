package com.silasonyango.transactionservice.entity_classes.great_grand_children;

import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "gggggr_children")
public class GGGGGrChildrenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GGGGGrCId")
    private int gggggrCId;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "RelativeId")
    private int relativeId;

    @Column(name = "GenderId")
    private int genderId;

    public int getGggggrCId() {
        return gggggrCId;
    }

    public void setGggggrCId(int gggggrCId) {
        this.gggggrCId = gggggrCId;
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
