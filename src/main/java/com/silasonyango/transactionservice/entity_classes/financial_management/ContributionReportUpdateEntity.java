package com.silasonyango.transactionservice.entity_classes.financial_management;

import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "contribution_report_update")
public class ContributionReportUpdateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UpdateId")
    private int updateId;

    @Column(name = "ContributionReportId")
    private int contributionReportId;

    @Column(name = "ContributionId")
    private int contributionId;

    @Column(name = "PreviousContributionAmount")
    private int previousContributionAmount;

    @Column(name = "PreviousMonthBalance")
    private int previousMonthBalance;

    @Column(name = "PreviousAnnualBalance")
    private int previousAnnualBalance;

    @Column(name = "NextContributionAmount")
    private int nextContributionAmount;

    @Column(name = "NextMonthBalance")
    private int nextMonthBalance;

    @Column(name = "NextAnnualBalance")
    private int nextAnnualBalance;

    public int getUpdateId() {
        return updateId;
    }

    public void setUpdateId(int updateId) {
        this.updateId = updateId;
    }

    public int getContributionReportId() {
        return contributionReportId;
    }

    public void setContributionReportId(int contributionReportId) {
        this.contributionReportId = contributionReportId;
    }

    public int getContributionId() {
        return contributionId;
    }

    public void setContributionId(int contributionId) {
        this.contributionId = contributionId;
    }

    public int getPreviousContributionAmount() {
        return previousContributionAmount;
    }

    public void setPreviousContributionAmount(int previousContributionAmount) {
        this.previousContributionAmount = previousContributionAmount;
    }

    public int getPreviousMonthBalance() {
        return previousMonthBalance;
    }

    public void setPreviousMonthBalance(int previousMonthBalance) {
        this.previousMonthBalance = previousMonthBalance;
    }

    public int getPreviousAnnualBalance() {
        return previousAnnualBalance;
    }

    public void setPreviousAnnualBalance(int previousAnnualBalance) {
        this.previousAnnualBalance = previousAnnualBalance;
    }

    public int getNextContributionAmount() {
        return nextContributionAmount;
    }

    public void setNextContributionAmount(int nextContributionAmount) {
        this.nextContributionAmount = nextContributionAmount;
    }

    public int getNextMonthBalance() {
        return nextMonthBalance;
    }

    public void setNextMonthBalance(int nextMonthBalance) {
        this.nextMonthBalance = nextMonthBalance;
    }

    public int getNextAnnualBalance() {
        return nextAnnualBalance;
    }

    public void setNextAnnualBalance(int nextAnnualBalance) {
        this.nextAnnualBalance = nextAnnualBalance;
    }
}
