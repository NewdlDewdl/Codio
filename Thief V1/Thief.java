import java.util.Scanner;

public class Thief {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String weightsInput = scanner.nextLine();
        String[] weightStrings = weightsInput.split("\\s+");

        int[] weights = new int[weightStrings.length];
        for (int i = 0; i < weightStrings.length; i++) {
            weights[i] = Integer.parseInt(weightStrings[i]);
        }
        int target = scanner.nextInt();

// WRITE YOUR CODE HERE
        int bestItem = 0;
        for (int weight : weights) {
            if (weight > bestItem && weight <= target) {
                bestItem = weight;
            }
        }
        System.out.print(bestItem);
    }
}
