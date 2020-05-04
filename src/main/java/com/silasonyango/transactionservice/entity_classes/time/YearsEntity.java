package com.silasonyango.transactionservice.entity_classes.time;
import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "years")
public class YearsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "YearId")
    private int yearId;

    @Column(name = "Year")
    private int year;

    public int getYearId() {
        return yearId;
    }

    public void setYearId(int yearId) {
        this.yearId = yearId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
