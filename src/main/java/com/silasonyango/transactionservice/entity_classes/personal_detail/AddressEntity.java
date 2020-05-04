package com.silasonyango.transactionservice.entity_classes.personal_detail;

import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "address")
public class AddressEntity implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AddressId")
    private int addressId;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "CountyId")
    private int countyId;

    @Column(name = "SubCountyId")
    private int subCountyId;

    @Column(name = "EstateDescription")
    private int estateDescription;

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCountyId() {
        return countyId;
    }

    public void setCountyId(int countyId) {
        this.countyId = countyId;
    }

    public int getSubCountyId() {
        return subCountyId;
    }

    public void setSubCountyId(int subCountyId) {
        this.subCountyId = subCountyId;
    }

    public int getEstateDescription() {
        return estateDescription;
    }

    public void setEstateDescription(int estateDescription) {
        this.estateDescription = estateDescription;
    }
}
