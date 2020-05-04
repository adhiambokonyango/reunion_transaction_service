package com.silasonyango.transactionservice.entity_classes.financial_management;

import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "actual_deductions")
public class ActualDeductionsEntity implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ActualDeductionId")
    private int actualDeductionId;

    @Column(name = "DeductionTypeId")
    private int deductionTypeId;

    @Column(name = "ActualQuarterId")
    private int actualQuarterId;

    @Column(name = "MonthsId")
    private int monthsId;

    @Column(name = "DeductionAmount")
    private int deductionAmount;

    @Column(name = "DeductionDescription")
    private int deductionDescription;

    @Column(name = "DeductionDate")
    private int deductionDate;

    public int getActualDeductionId() {
        return actualDeductionId;
    }

    public void setActualDeductionId(int actualDeductionId) {
        this.actualDeductionId = actualDeductionId;
    }

    public int getDeductionTypeId() {
        return deductionTypeId;
    }

    public void setDeductionTypeId(int deductionTypeId) {
        this.deductionTypeId = deductionTypeId;
    }

    public int getActualQuarterId() {
        return actualQuarterId;
    }

    public void setActualQuarterId(int actualQuarterId) {
        this.actualQuarterId = actualQuarterId;
    }

    public int getMonthsId() {
        return monthsId;
    }

    public void setMonthsId(int monthsId) {
        this.monthsId = monthsId;
    }

    public int getDeductionAmount() {
        return deductionAmount;
    }

    public void setDeductionAmount(int deductionAmount) {
        this.deductionAmount = deductionAmount;
    }

    public int getDeductionDescription() {
        return deductionDescription;
    }

    public void setDeductionDescription(int deductionDescription) {
        this.deductionDescription = deductionDescription;
    }

    public int getDeductionDate() {
        return deductionDate;
    }

    public void setDeductionDate(int deductionDate) {
        this.deductionDate = deductionDate;
    }
}
