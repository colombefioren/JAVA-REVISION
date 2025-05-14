package exo2;

import java.util.Date;

public class Account {
  private int id;
  private double balance;
  private double annualInterestRate;
  private Date dateCreated;

  Account(int id, double balance, double annualInterestRate) {
    this.id = id;
    this.balance = balance;
    this.annualInterestRate = annualInterestRate;
    this.dateCreated = new Date();
  }

  public boolean withdraw(double amount) {
    if (amount <= this.balance) {
      this.balance -= amount;
      return true;
    } else {
      return false;
    }
  }

  public void deposit(double amount) {
    this.balance += amount;
  }

  public int getId() {
    return this.id;
  }

  public double getBalance() {
    return this.balance;
  }

  public double getAnnualInterestRate() {
    return this.annualInterestRate;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Date getDateCreated() {
    return this.dateCreated;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setAnnualInterestRate(double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }
}
