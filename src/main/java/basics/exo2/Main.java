package basics.exo2;

public class Main {
  public static void main(String[] args) {
    Account myAccount = new Account(1122, 20_000, 4.5);
    printInfo(myAccount);
    if (myAccount.withdraw(2500)) {
      System.out.println("Withdrawal success!");
    } else {
      System.out.println("Withdrawal unsuccessful");
    }
    printInfo(myAccount);
    myAccount.deposit(3000);
    printInfo(myAccount);
  }

  public static void printInfo(Account account) {
    System.out.println("Account id : " + account.getId());
    System.out.println("Balance : " + account.getBalance());
    System.out.println("Annual Interest Rate : " + account.getAnnualInterestRate());
    System.out.println("Date created : " + account.getDateCreated());
  }
}
