package com.silasonyango.transactionservice.entity_classes.great_grand_parents_cousins;
import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "ggggr_parents_cousins")
public class GGGGrParentsCousinsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GGGGrPCousinId")
    private int ggggrPCousinId;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "RelativeId")
    private int relativeId;

    @Column(name = "GenderId")
    private int genderId;

    public int getGgggrPCousinId() {
        return ggggrPCousinId;
    }

    public void setGgggrPCousinId(int ggggrPCousinId) {
        this.ggggrPCousinId = ggggrPCousinId;
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
