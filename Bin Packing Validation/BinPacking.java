import java.util.*;

class BinPacking {
  static int items[], binAssignments[];
  final static int BINCAPACITY = 100;

  static void validate() {

    for (int w : items) {
      if (w < 0 || w > BINCAPACITY) {
        System.out.printf("Input item %d out of range%n", w);
        System.exit(2);
      }
    }
    boolean[] used = new boolean[items.length]; 
    int maxBin = -1;
    for (int b : binAssignments) {
      if (b < 0 || b >= items.length) {
        System.out.printf("Bin %d out of range%n", b);
        System.exit(2);
      }
      used[b] = true;
      if (b > maxBin) maxBin = b;
    }
    for (int i = 0; i <= maxBin; i++) {
      if (!used[i]) {
        System.out.printf("Bin %d not used%n", i);
        System.exit(2);
      }
    }
    int[] load = new int[maxBin + 1];
    for (int i = 0; i < items.length; i++) {
      int b = binAssignments[i];
      load[b] += items[i];
      if (load[b] > BINCAPACITY) {
        System.out.printf("Bin %d total goes above 100", b);
        System.exit(2);
      }
    }
    System.out.println("Valid");
  }
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String parts[] = input.nextLine().split(" ");
    items = new int [parts.length];
    for(int i=0; i<parts.length; i++)
      items[i] = Integer.parseInt(parts[i]);

    binAssignments = new int [parts.length];
    parts = input.nextLine().split(" ");
    for(int i=0; i<parts.length; i++)
      binAssignments[i] = Integer.parseInt(parts[i]);

    if (items.length != binAssignments.length) {
      System.err.println("# of items and # of bin assignments mismatch.");
      System.exit(1);
    }
    validate();
  }
}
