package com.silasonyango.transactionservice.entity_classes.financial_management;

import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "cash_flow_types")
public class CashFlowTypesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CashFlowTypeId")
    private int cashFlowTypeId;

    @Column(name = "CashFLowTypeDescription")
    private int cashFLowTypeDescription;

    @Column(name = "CashFLowCode")
    private int cashFLowCode;

    @Column(name = "FlowFlag")
    private int flowFlag;

    public int getCashFlowTypeId() {
        return cashFlowTypeId;
    }

    public void setCashFlowTypeId(int cashFlowTypeId) {
        this.cashFlowTypeId = cashFlowTypeId;
    }

    public int getCashFLowTypeDescription() {
        return cashFLowTypeDescription;
    }

    public void setCashFLowTypeDescription(int cashFLowTypeDescription) {
        this.cashFLowTypeDescription = cashFLowTypeDescription;
    }

    public int getCashFLowCode() {
        return cashFLowCode;
    }

    public void setCashFLowCode(int cashFLowCode) {
        this.cashFLowCode = cashFLowCode;
    }

    public int getFlowFlag() {
        return flowFlag;
    }

    public void setFlowFlag(int flowFlag) {
        this.flowFlag = flowFlag;
    }
}
