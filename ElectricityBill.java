/*
For first 50 units $ 0.50/unit
For next 100 units $ 0.75/unit
For next 100 units $ 1.20/unit
For unit above 250 $ 1.50/unit
An additional surcharge of 20% is added to the bill.
 */

// FREEZE CODE BEGIN
import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        int units;
        double bill = 0;
// FREEZE CODE END
// WRITE YOUR CODE HERE
        Scanner scan = new Scanner(System.in);
        units = scan.nextInt();

        if (units > 250) {
            bill = bill + 1.5 * (units - 250) + 220;
        }
        else if (units > 150) {
            bill = bill + 1.2 * (units - 150) + 100;
        }
        else if (units > 50) {
            bill = bill + 0.75 * (units - 50) + 25;
        }
        else {
            bill += 0.5 * units;
        }
        bill *= 1.2;

        System.out.printf("The electricity bill is $%.2f\n", bill);
    }
}
