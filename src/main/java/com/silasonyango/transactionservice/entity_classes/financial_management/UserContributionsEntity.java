package com.silasonyango.transactionservice.entity_classes.financial_management;
import javax.persistence.*;
@javax.persistence.Entity
@Table(name = "user_contributions")
public class UserContributionsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ContributionId")
    private int contributionId;

    @Column(name = "UserId")
    private int userId;

    @Column(name = "MonthsId")
    private int monthsId;

    @Column(name = "ActualQuarterId")
    private int actualQuarterId;

    @Column(name = "ContributionAmount")
    private int contributionAmount;

    @Column(name = "SessionId")
    private int sessionId;

    public int getContributionId() {
        return contributionId;
    }

    public void setContributionId(int contributionId) {
        this.contributionId = contributionId;
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

    public int getActualQuarterId() {
        return actualQuarterId;
    }

    public void setActualQuarterId(int actualQuarterId) {
        this.actualQuarterId = actualQuarterId;
    }

    public int getContributionAmount() {
        return contributionAmount;
    }

    public void setContributionAmount(int contributionAmount) {
        this.contributionAmount = contributionAmount;
    }

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }
}
