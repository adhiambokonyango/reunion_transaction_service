package com.silasonyango.transactionservice.entity_classes.users;
import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "users")
public class UsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserId")
    private int userId;

    @Column(name = "FirstName")
    private int firstName;

    @Column(name = "MiddleName")
    private int middleName;

    @Column(name = "SurName")
    private int surName;

    @Column(name = "GenderId")
    private int genderId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getFirstName() {
        return firstName;
    }

    public void setFirstName(int firstName) {
        this.firstName = firstName;
    }

    public int getMiddleName() {
        return middleName;
    }

    public void setMiddleName(int middleName) {
        this.middleName = middleName;
    }

    public int getSurName() {
        return surName;
    }

    public void setSurName(int surName) {
        this.surName = surName;
    }

    public int getGenderId() {
        return genderId;
    }

    public void setGenderId(int genderId) {
        this.genderId = genderId;
    }
}
