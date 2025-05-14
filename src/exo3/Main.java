package exo3;

import exo2.Account;

public class Main {
  public static void main(String[] args) {
    Client client1 = new Client(1, "Coco", "0380979367");
    System.out.println(client1.toString());
    Account firstAccount = new Account(2, 200, 1.4);
    if (client1.addAccount(firstAccount)) {
      System.out.println("Account successfully added!");
    } else {
      System.out.println("Account could not be added!");
    }
    System.out.println(client1.toString());
    if (client1.removeAccount(2)) {
      System.out.println("Account removed!");
    } else {
      System.out.println("The account doesnt exist!");
    }
    if (client1.addAccount(firstAccount)) {
      System.out.println("Account successfully added!");
    } else {
      System.out.println("Account could not be added!");
    }
    if (client1.addAccount(firstAccount)) {
      System.out.println("Account successfully added!");
    } else {
      System.out.println("Account could not be added!");
    }
    if (client1.removeAccount(1)) {
      System.out.println("Account removed!");
    } else {
      System.out.println("The account doesnt exist!");
    }
    System.out.println(client1.toString());
  }
}
