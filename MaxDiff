import java.util.Scanner;

public class MaxDiff {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

// WRITE YOUR CODE HERE

    int diff;
    int maxNum = 0, minNum = 0;
    boolean end = false;
    System.out.print("Enter number: ");
    int number = input.nextInt();
    maxNum = number;
    minNum = number;
    diff = 0;
    System.out.println("Max difference so far: 0");
    while(!end) {
      System.out.print("Enter number: ");
      number = input.nextInt();
      if (number < 0) {

        end = true;
        System.out.printf("Maximum difference: %d\n", diff);
      }
      else {
        if (number > maxNum) {
          maxNum = number;
        }
        if ((number < minNum) && (number > 0)) {
          minNum = number;
        }
        diff = maxNum - minNum;
        System.out.printf("Max difference so far: %d\n", diff);
      }
    }
  }
}
