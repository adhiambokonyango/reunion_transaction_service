package com.silasonyango.transactionservice.entity_classes.time;
import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "months_iterations")
public class MonthsIterationsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MonthsIterationId")
    private int monthsIterationId;

    @Column(name = "MonthsIterationDescription")
    private int monthsIterationDescription;

    @Column(name = "MonthsIterationCode")
    private int monthsIterationCode;

    public int getMonthsIterationId() {
        return monthsIterationId;
    }

    public void setMonthsIterationId(int monthsIterationId) {
        this.monthsIterationId = monthsIterationId;
    }

    public int getMonthsIterationDescription() {
        return monthsIterationDescription;
    }

    public void setMonthsIterationDescription(int monthsIterationDescription) {
        this.monthsIterationDescription = monthsIterationDescription;
    }

    public int getMonthsIterationCode() {
        return monthsIterationCode;
    }

    public void setMonthsIterationCode(int monthsIterationCode) {
        this.monthsIterationCode = monthsIterationCode;
    }
}
