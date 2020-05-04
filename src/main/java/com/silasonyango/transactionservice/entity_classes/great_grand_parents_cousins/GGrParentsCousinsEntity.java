package com.silasonyango.transactionservice.entity_classes.great_grand_parents_cousins;
import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "ggr_parents_cousins")
public class GGrParentsCousinsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GGrPCousinId")
    private int ggrPCousinId;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "RelativeId")
    private int relativeId;

    @Column(name = "GenderId")
    private int genderId;

    public int getGgrPCousinId() {
        return ggrPCousinId;
    }

    public void setGgrPCousinId(int ggrPCousinId) {
        this.ggrPCousinId = ggrPCousinId;
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
