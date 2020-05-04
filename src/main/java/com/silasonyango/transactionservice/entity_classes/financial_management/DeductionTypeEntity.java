package com.silasonyango.transactionservice.entity_classes.financial_management;

import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "deduction_type")
public class DeductionTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DeductionTypeId")
    private int deductionTypeId;

    @Column(name = "DeductionTypeDescription")
    private int deductionTypeDescription;

    @Column(name = "DeductionTypeCode")
    private int deductionTypeCode;

    public int getDeductionTypeId() {
        return deductionTypeId;
    }

    public void setDeductionTypeId(int deductionTypeId) {
        this.deductionTypeId = deductionTypeId;
    }

    public int getDeductionTypeDescription() {
        return deductionTypeDescription;
    }

    public void setDeductionTypeDescription(int deductionTypeDescription) {
        this.deductionTypeDescription = deductionTypeDescription;
    }

    public int getDeductionTypeCode() {
        return deductionTypeCode;
    }

    public void setDeductionTypeCode(int deductionTypeCode) {
        this.deductionTypeCode = deductionTypeCode;
    }
}
