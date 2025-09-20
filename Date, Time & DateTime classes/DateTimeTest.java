import java.util.Scanner;

class Date {
    private int day, month, year;

    public Date(int mm, int dd, int yy) {
        year = yy;
        month = mm;
        day = dd;
    }

    public Date(String input) {
        String[] parts = input.split("/");
        month = Integer.parseInt(parts[0]);
        day = Integer.parseInt(parts[1]);
        year = Integer.parseInt(parts[2]);
    }

    public void display() {
        System.out.print(month + "/" + day + "/" + year);
    }

    public boolean isLeapYear() {
        if (year % 4 != 0) {
            return false;
        }
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return true;
    }

    public void increment() {
        int[] daysInMonths = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2 && isLeapYear()) {
            daysInMonths[2] = 29;
        } else {
            daysInMonths[2] = 28;
        }

// WRITE YOUR CODE HERE
        if((day + 1) > daysInMonths[month]) {
            if((month + 1) > 12) {
                year++;
                month = 1;
                day = 1;
            }
            else {
                month++;
                day = 1;
            }
        } 
        else {
            day++;
        }

        

    }
}

class Time {
    private int hour, minute, second;

    public Time(int hh, int mm, int ss) {
        hour = hh;
        minute = mm;
        second = ss;
    }

    public Time(String input) {
        String[] parts = input.split(":");
        hour = Integer.parseInt(parts[0]);
        minute = Integer.parseInt(parts[1]);
        second = Integer.parseInt(parts[2]);
    }

    //return true if time rolls over beyond midnight, return false otherwise.
    public boolean increment() {
        if (second + 1 > 59) {
            if(minute + 1 > 59) {
                if(hour + 1 > 23) {
                    second = 0;
                    minute = 0;
                    hour = 0;
                    return true;
                }
                else {
                    hour++;
                    second = 0;
                    minute = 0;
                    return false;
                }
            }
            else {
                minute++;
                second = 0;
                return false;

            }
        }
        else {
            second++;
            return false;
        }
            
    }
// WRITE YOUR CODE HERE


    public void display() {
        String amPm = hour < 12 ? "AM" : "PM";
        int displayHour = (hour % 12 == 0) ? 12 : hour % 12;
        System.out.printf("%02d:%02d:%02d %s", displayHour, minute, second, amPm);
    }
}

class DateTime {
    private Date date;
    private Time time;

    public DateTime(int mm, int dd, int yy, int hh, int mm2, int ss) {
        date = new Date(mm, dd, yy);
        time = new Time(hh, mm2, ss);
    }

    public DateTime(String input) {
        String[] parts = input.split(" ");
        date = new Date(parts[0]);
        time = new Time(parts[1]);
    }

    public void increment() {
        if (time.increment()) {
            date.increment();
        }
    }

    public void display() {
        date.display();
        System.out.print(" ");
        time.display();
    }
}



public class DateTimeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dataType = sc.next();
        String input, input2;
        int steps;

        switch (dataType) {
            case "D":
                input = sc.next();
                steps = sc.nextInt();
                Date date = new Date(input);
                for (int i = 0; i < steps; i++) {
                    date.increment();
                }
                date.display();
                break;
            case "T":
                input = sc.next();
                steps = sc.nextInt();
                Time time = new Time(input);
                for (int i = 0; i < steps; i++) {
                    time.increment();
                }
                time.display();
                break;
            case "DT":
                input = sc.next();
                input2 = sc.next();
                steps = sc.nextInt();
                DateTime dt = new DateTime(input + " " + input2);
                for (int i = 0; i < steps; i++) {
                    dt.increment();
                }
                dt.display();
                break;
        }
        sc.close();
    }
}
