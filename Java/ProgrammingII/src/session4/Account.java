package session4;

import java.util.Date;

public class Account {
    public int id = 0;
    public double balance = 0;
    public double annualInterestRate = 0;
    public java.util.Date dateCreated;

    public Account() {
        Date dateCreated = new Date();
        this.dateCreated = dateCreated;
    }

    public Account(int id, double balance) {
        Date dateCreated = new Date();
        this.dateCreated = dateCreated;
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;

    }

    public double getBalance() {
        return balance;
    }


    public double getAnnualInterestRate() {
        return annualInterestRate;

    }


    public void setId(int id) {
        this.id = id;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String getDateCreated() {
        return dateCreated.toString();
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;

    }

    public double withDraw(double withdraw) {
        return this.balance = this.balance - withdraw;
    }

    public double deposit(double deposit) {
        return this.balance = this.balance + deposit;
    }
}
