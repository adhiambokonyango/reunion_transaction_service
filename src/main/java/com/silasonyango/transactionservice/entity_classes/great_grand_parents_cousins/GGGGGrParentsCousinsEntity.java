package com.silasonyango.transactionservice.entity_classes.great_grand_parents_cousins;
import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "gggggr_parents_cousins")
public class GGGGGrParentsCousinsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GGGGGrPCousinId")
    private int gggggrPCousinId;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "RelativeId")
    private int relativeId;

    @Column(name = "GenderId")
    private int genderId;

    public int getGggggrPCousinId() {
        return gggggrPCousinId;
    }

    public void setGggggrPCousinId(int gggggrPCousinId) {
        this.gggggrPCousinId = gggggrPCousinId;
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
