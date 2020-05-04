package com.silasonyango.transactionservice.entity_classes.parents;
import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "parents_siblings")
public class ParentsSiblingsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ParentsSiblingsId")
    private int parentsSiblingsId;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "RelativeId")
    private int relativeId;

    @Column(name = "GenderId")
    private int genderId;

    public int getParentsSiblingsId() {
        return parentsSiblingsId;
    }

    public void setParentsSiblingsId(int parentsSiblingsId) {
        this.parentsSiblingsId = parentsSiblingsId;
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
