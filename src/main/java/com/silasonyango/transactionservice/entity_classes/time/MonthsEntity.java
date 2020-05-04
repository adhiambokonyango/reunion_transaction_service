package com.silasonyango.transactionservice.entity_classes.time;
import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "months")
public class MonthsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MonthsId")
    private int monthsId;

    @Column(name = "MonthsIterationId")
    private int monthsIterationId;

    @Column(name = "QuarterIterationId")
    private int quarterIterationId;

    public int getMonthsId() {
        return monthsId;
    }

    public void setMonthsId(int monthsId) {
        this.monthsId = monthsId;
    }

    public int getMonthsIterationId() {
        return monthsIterationId;
    }

    public void setMonthsIterationId(int monthsIterationId) {
        this.monthsIterationId = monthsIterationId;
    }

    public int getQuarterIterationId() {
        return quarterIterationId;
    }

    public void setQuarterIterationId(int quarterIterationId) {
        this.quarterIterationId = quarterIterationId;
    }
}
