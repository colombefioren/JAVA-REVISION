package basics.exo5;

import basics.exo3.Client;
import java.util.ArrayList;
import java.util.Date;

public class Account {
  private int id;
  private double balance;
  private double annualInterestRate;
  private Date dateCreated;
  private Client client;
  private ArrayList<Transaction> transactions;

  Account(int id, double balance, double annualInterestRate, Client client) {
    this.id = id;
    this.balance = balance;
    this.annualInterestRate = annualInterestRate;
    this.client = client;
    this.dateCreated = new Date();
    this.transactions = new ArrayList<>();
  }

  public boolean withdraw(double amount) {
    if (balance >= amount) {
      balance -= amount;
      this.transactions.add(new Transaction('W', amount, this.balance, ("Withdrawing " + amount)));
      return true;
    } else {
      return false;
    }
  }

  public void deposit(double amount) {
    balance += amount;
    this.transactions.add(new Transaction('D', amount, this.balance, "Deposit " + amount));
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getBalance() {
    return balance;
  }

  public double getAnnualInterestRate() {
    return annualInterestRate;
  }

  public void setAnnualInterestRate(double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }

  public Date getDateCreated() {
    return dateCreated;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public ArrayList<Transaction> getTransactions() {
    return transactions;
  }
}
