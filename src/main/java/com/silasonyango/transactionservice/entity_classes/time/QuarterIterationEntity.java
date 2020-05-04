package com.silasonyango.transactionservice.entity_classes.time;
import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "quarter_iteration")
public class QuarterIterationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "QuarterIterationId")
    private int quarterIterationId;

    @Column(name = "IterationDescription")
    private int iterationDescription;

    @Column(name = "IterationCode")
    private int iterationCode;

    public int getQuarterIterationId() {
        return quarterIterationId;
    }

    public void setQuarterIterationId(int quarterIterationId) {
        this.quarterIterationId = quarterIterationId;
    }

    public int getIterationDescription() {
        return iterationDescription;
    }

    public void setIterationDescription(int iterationDescription) {
        this.iterationDescription = iterationDescription;
    }

    public int getIterationCode() {
        return iterationCode;
    }

    public void setIterationCode(int iterationCode) {
        this.iterationCode = iterationCode;
    }
}
