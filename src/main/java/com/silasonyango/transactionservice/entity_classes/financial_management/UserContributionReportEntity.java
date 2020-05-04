package com.silasonyango.transactionservice.entity_classes.financial_management;

import javax.persistence.*;

@javax.persistence.Entity
@Table(name = "user_contribution_report")
public class UserContributionReportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ContributionReportId")
    private int contributionReportId;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "MonthsId")
    private int monthsId;

    @Column(name = "ExpectedAmount")
    private int expectedAmount;

    @Column(name = "ContributedAmount")
    private int contributedAmount;

    @Column(name = "MonthBalance")
    private int monthBalance;

    @Column(name = "AnnualBalance")
    private int annualBalance;

    public int getContributionReportId() {
        return contributionReportId;
    }

    public void setContributionReportId(int contributionReportId) {
        this.contributionReportId = contributionReportId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getMonthsId() {
        return monthsId;
    }

    public void setMonthsId(int monthsId) {
        this.monthsId = monthsId;
    }

    public int getExpectedAmount() {
        return expectedAmount;
    }

    public void setExpectedAmount(int expectedAmount) {
        this.expectedAmount = expectedAmount;
    }

    public int getContributedAmount() {
        return contributedAmount;
    }

    public void setContributedAmount(int contributedAmount) {
        this.contributedAmount = contributedAmount;
    }

    public int getMonthBalance() {
        return monthBalance;
    }

    public void setMonthBalance(int monthBalance) {
        this.monthBalance = monthBalance;
    }

    public int getAnnualBalance() {
        return annualBalance;
    }

    public void setAnnualBalance(int annualBalance) {
        this.annualBalance = annualBalance;
    }
}
