import java.util.*;

class Wss {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int capacity = input.nextInt();
    input.nextLine();
    String line = input.nextLine();

    //need variables to keep track of current usage & also for output summary
    int regular=0, emergency=0, regularAccepted=0, emergencyAccepted=0;
    int regularDenied=0, emergencyDenied=0, regularForcedOut=0;

    String[] events = line.split(" ");
    int spareCapacity = capacity;
    int emergencyCapacity = capacity;

    for (String event : events) {
      if (event.equals("N")) {

        if (spareCapacity > 0) {
          spareCapacity--;
          regularAccepted++;
          regular++;
        } else {
          regularDenied++;
        }
      } else if (event.equals("NE")) {
        if (emergencyCapacity > 0) {
          if (spareCapacity > 0) {
            emergencyCapacity--;
            spareCapacity--;
            emergencyAccepted++;
          } else {
            emergencyAccepted++;
            regularForcedOut++;
            regular--;
            emergencyCapacity--;
          }
          emergency++;
        } else {
          emergencyDenied++;
        }
      } else if (event.equals("E") && regular > 0) {
        regular--;
        spareCapacity++;
      } else if (event.equals("EE") && emergency > 0) {
        emergency--;
        spareCapacity++;
        emergencyCapacity++;
      }
    }
    System.out.println("" + regularAccepted + " " + regularDenied + " "
            + emergencyAccepted + " " + emergencyDenied + " " + regularForcedOut);
  }
}


