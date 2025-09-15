import java.util.*;

class Pay1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.printf("Input hourly pay rate: ");
    float rate = input.nextFloat();
    System.out.printf("Input # of hours: ");
    float hours = input.nextFloat();
    System.out.printf("Your weekly pay: %f", rate * hours);
  }
}
