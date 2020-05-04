package com.silasonyango.transactionservice.entity_classes.financial_management;
import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "organizational_overall_amount")
public class OrganizationalOverallAmountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrganizationalOverallAmountId")
    private int organizationalOverallAmountId;

    @Column(name = "OrganizationalOverallAmount")
    private int organizationalOverallAmount;

    public int getOrganizationalOverallAmountId() {
        return organizationalOverallAmountId;
    }

    public void setOrganizationalOverallAmountId(int organizationalOverallAmountId) {
        this.organizationalOverallAmountId = organizationalOverallAmountId;
    }

    public int getOrganizationalOverallAmount() {
        return organizationalOverallAmount;
    }

    public void setOrganizationalOverallAmount(int organizationalOverallAmount) {
        this.organizationalOverallAmount = organizationalOverallAmount;
    }
}
