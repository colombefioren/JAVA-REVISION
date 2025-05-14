package exo3;

import exo2.Account;
import java.util.ArrayList;

public class Client {
  private int id;
  private String name;
  private String phone;
  private ArrayList<Account> accounts;

  public Client(int id, String name, String phone) {
    this.id = id;
    this.name = name;
    this.phone = phone;
    this.accounts = new ArrayList<>();
  }

  public boolean addAccount(Account account) {
    if (accounts.contains(account)) {
      return false;
    } else {
      accounts.add(account);
      return true;
    }
  }

  public boolean removeAccount(int accountId) {
    for (Account account : accounts) {
      if (account.getId() == accountId) {
        accounts.remove(account);
        return true;
      }
    }
    return false;
  }

  public String toString() {
    return "Id : "
        + this.id
        + " - "
        + "Name : "
        + this.name
        + " - "
        + "accounts : "
        + this.accounts.size();
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public ArrayList<Account> getAccounts() {
    return accounts;
  }

  public void setAccounts(ArrayList<Account> accounts) {
    this.accounts = accounts;
  }
}
