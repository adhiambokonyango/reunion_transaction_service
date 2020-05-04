package com.silasonyango.transactionservice.entity_classes.personal_detail;

import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "gender")
public class GenderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GenderId")
    private int genderId;

    @Column(name = "GenderDescription")
    private int genderDescription;

    @Column(name = "GenderCode")
    private int genderCode;

    public int getGenderId() {
        return genderId;
    }

    public void setGenderId(int genderId) {
        this.genderId = genderId;
    }

    public int getGenderDescription() {
        return genderDescription;
    }

    public void setGenderDescription(int genderDescription) {
        this.genderDescription = genderDescription;
    }

    public int getGenderCode() {
        return genderCode;
    }

    public void setGenderCode(int genderCode) {
        this.genderCode = genderCode;
    }
}
