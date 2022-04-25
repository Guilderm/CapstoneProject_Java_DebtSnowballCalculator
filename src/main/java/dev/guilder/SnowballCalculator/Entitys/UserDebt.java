package dev.guilder.SnowballCalculator.Entitys;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "UserDebt")
public class UserDebt implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userDebtId;
    private String Description;
    private double Amount;
    private double InterestRate;
    private double bankFees;
    private double montlyPayment;
    private Date StartDate;
    private Date EndDate;

    public long getUserDebtId() {
        return userDebtId;
    }

    public void setUserDebtId(long userDebtId) {
        this.userDebtId = userDebtId;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }

    public double getInterestRate() {
        return InterestRate;
    }

    public void setInterestRate(double InterestRate) {
        this.InterestRate = InterestRate;
    }

    public double getBankFees() {
        return bankFees;
    }

    public void setBankFees(double bankFees) {
        this.bankFees = bankFees;
    }

    public double getMontlyPayment() {
        return montlyPayment;
    }

    public void setMontlyPayment(double montlyPayment) {
        this.montlyPayment = montlyPayment;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date EndDate) {
        this.EndDate = EndDate;
    }
}
