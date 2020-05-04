package com.silasonyango.transactionservice.entity_classes.great_grand_parents_cousins;
import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "gggr_parents_cousins")
public class GGGrParentsCousinsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GGGrPCousinId")
    private int gggrPCousinId;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "RelativeId")
    private int relativeId;

    @Column(name = "GenderId")
    private int genderId;

    public int getGggrPCousinId() {
        return gggrPCousinId;
    }

    public void setGggrPCousinId(int gggrPCousinId) {
        this.gggrPCousinId = gggrPCousinId;
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
