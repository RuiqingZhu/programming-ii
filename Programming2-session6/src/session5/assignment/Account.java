package session5.assignment;

import java.util.Date;

public class Account {
    private String accountNumber;
    private double balance;
    private float interestRate;
    private Date dateCreated;

    public Account() {
    }

    public Account(String accountNumber, double balance, float interestRate, Date dateCreated) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
        this.dateCreated = dateCreated;
    }

    public void depositOrWithdraw(boolean deposit, double amount) {
        if (deposit) {
            balance = balance + amount;
        } else {
            balance = balance - amount;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return accountNumber + " " + balance + " " + interestRate + "\n" + dateCreated+"\n";
    }
}
