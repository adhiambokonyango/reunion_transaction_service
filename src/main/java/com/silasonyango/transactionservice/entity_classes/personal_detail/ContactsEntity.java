package com.silasonyango.transactionservice.entity_classes.personal_detail;

import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "contacts")

public class ContactsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ContactDetailsId")
    private int contactDetailsId;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "PhoneNumber")
    private int phoneNumber;

    @Column(name = "Email")
    private int email;

    @Column(name = "AlternativePhoneNumber")
    private int alternativePhoneNumber;

    public int getContactDetailsId() {
        return contactDetailsId;
    }

    public void setContactDetailsId(int contactDetailsId) {
        this.contactDetailsId = contactDetailsId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getEmail() {
        return email;
    }

    public void setEmail(int email) {
        this.email = email;
    }

    public int getAlternativePhoneNumber() {
        return alternativePhoneNumber;
    }

    public void setAlternativePhoneNumber(int alternativePhoneNumber) {
        this.alternativePhoneNumber = alternativePhoneNumber;
    }
}
