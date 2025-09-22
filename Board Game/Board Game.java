import java.util.Scanner;
import java.io.*;

public class BoardGame {
  static int numPlayers;
  static String names[];
  static int balances[];

  public static int findIndex(String name) {
    for (int i = 0; i < numPlayers; i++) {
      if (name.equals(names[i])) {
        return i;
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    numPlayers = input.nextInt();
    names = new String [numPlayers];
    balances = new int [numPlayers];
    for(int i=0; i<numPlayers; i++) {
      names[i] = input.next();
      balances[i] = input.nextInt();
    }

    //read the transactions and process them
    boolean end = false;
    String payer, payee;
    while(!end && input.hasNext()) {
      payer = input.next();
      if (!payer.equals("end")) {
        payee = input.next();
        int payerIndex = findIndex(payer);
        int payeeIndex = findIndex(payee);
        int transaction = input.nextInt();
        balances[payerIndex] -= transaction;
        balances[payeeIndex] += transaction;
      }
      else {
        end = true;
      }
    }

    for(int i=0; i<numPlayers; i++) 
     System.out.println(names[i] + " " + balances[i]);
  }
}
