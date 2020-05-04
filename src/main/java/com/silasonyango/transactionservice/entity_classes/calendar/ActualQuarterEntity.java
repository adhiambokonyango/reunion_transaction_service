package com.silasonyango.transactionservice.entity_classes.calendar;

import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "actual_quarter")
public class ActualQuarterEntity implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ActualQuarterId")
    private int actualQuarterId;

    @Column(name = "QuarterIterationId")
    private int quarterIterationId;

    @Column(name = "YearId")
    private int yearId;

    public int getActualQuarterId() {
        return actualQuarterId;
    }

    public void setActualQuarterId(int actualQuarterId) {
        this.actualQuarterId = actualQuarterId;
    }

    public int getQuarterIterationId() {
        return quarterIterationId;
    }

    public void setQuarterIterationId(int quarterIterationId) {
        this.quarterIterationId = quarterIterationId;
    }

    public int getYearId() {
        return yearId;
    }

    public void setYearId(int yearId) {
        this.yearId = yearId;
    }
}

