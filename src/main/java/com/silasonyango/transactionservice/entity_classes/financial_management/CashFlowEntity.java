package com.silasonyango.transactionservice.entity_classes.financial_management;

import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "cash_flow")

public class CashFlowEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CashFlowId")
    private int cashFlowId;

    @Column(name = "CashFlowTypeId")
    private int cashFlowTypeId;

    @Column(name = "ContributionId")
    private int contributionId;

    @Column(name = "ActualDeductionId")
    private int actualDeductionId;

    @Column(name = "PreviousOrganizationAmount")
    private int previousOrganizationAmount;

    @Column(name = "NextOrganizationAmount")
    private int nextOrganizationAmount;

    public int getCashFlowId() {
        return cashFlowId;
    }

    public void setCashFlowId(int cashFlowId) {
        this.cashFlowId = cashFlowId;
    }

    public int getCashFlowTypeId() {
        return cashFlowTypeId;
    }

    public void setCashFlowTypeId(int cashFlowTypeId) {
        this.cashFlowTypeId = cashFlowTypeId;
    }

    public int getContributionId() {
        return contributionId;
    }

    public void setContributionId(int contributionId) {
        this.contributionId = contributionId;
    }

    public int getActualDeductionId() {
        return actualDeductionId;
    }

    public void setActualDeductionId(int actualDeductionId) {
        this.actualDeductionId = actualDeductionId;
    }

    public int getPreviousOrganizationAmount() {
        return previousOrganizationAmount;
    }

    public void setPreviousOrganizationAmount(int previousOrganizationAmount) {
        this.previousOrganizationAmount = previousOrganizationAmount;
    }

    public int getNextOrganizationAmount() {
        return nextOrganizationAmount;
    }

    public void setNextOrganizationAmount(int nextOrganizationAmount) {
        this.nextOrganizationAmount = nextOrganizationAmount;
    }
}
