package exo4;

import exo2.Account;
import exo3.Client;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Client> clients = new ArrayList<>();
    clients.add(new Client(1, "Colombe", "0320537535"));
    clients.add(new Client(2, "Anaelle", "0320267950"));
    clients.get(0).addAccount(new Account(1, 200, 1));
    clients.get(0).addAccount(new Account(2, 200, 1));

    clients.get(1).addAccount(new Account(3, 200, 1));
    clients.get(1).addAccount(new Account(4, 200, 1));
    clients.get(1).addAccount(new Account(5, 200, 1));

    for (Client client : clients) {
      String info = client.toString();
      System.out.println(info);
    }
  }
}
