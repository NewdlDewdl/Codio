import java.util.Scanner;

public class Jeopardy {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    //let us array of 4, even though there are just 3 players
    //it enables us to use player number directly as index!
    int scores[] = new int[4]; 
    

// WRITE YOUR CODE HERE
    boolean end = false;
    while(!end && input.hasNextInt()) {
      int playerNumber = input.nextInt();
      if(playerNumber != 0) {
        int deltaPoints = input.nextInt();
        scores[playerNumber] += deltaPoints;
      }
      else {
        end = true;
        input.close();
      }
    }
    int maxScore = 0;
    int winner = 0;
    for (int i = 1; i <= 3; i++) {
      System.out.println("Player " + i + ": " + scores[i]);
      if (scores[i] > maxScore) {
        maxScore = scores[i];
        winner = i;
      }
    }
    System.out.println("Player " + winner + " is the winner!");
  }
}
