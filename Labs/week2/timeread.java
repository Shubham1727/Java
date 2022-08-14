import java.util.Scanner;

class Time {
    int hours, minutes, seconds;

    void setTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    void disp() {
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }

    Time add(Time t1) {
        Time t = new Time();
        int testSeconds = 0, testMinutes = 0, testHours = 0;
        testSeconds = t1.seconds + seconds;
        testMinutes = t1.minutes + minutes;
        testHours = t1.hours + hours;
        t.setTime(testHours, testMinutes, testSeconds);
        t.minutes += t.seconds / 60;
        t.seconds = t.seconds % 60;
        t.hours += t.minutes / 60;
        t.minutes = t.minutes % 60;
        return t;
    }

    Time subtract(Time t) {
        Time test = new Time();
        test.setTime((Math.abs(t.hours - hours)), (Math.abs(t.minutes - minutes)), Math.abs(t.seconds - seconds));
        return test;
    }

    public int isGreaterThan(Time t) {
        if (this.hours * 24 + this.minutes * 60 + this.seconds > t.hours * 24 + t.minutes * 60 + t.seconds)
            return 1;
        else if (this.hours * 24 + this.minutes * 60 + this.seconds == t.hours * 24 + t.minutes * 60 + t.seconds)
            return 0;
        else
            return -1;
    }
}

public class timeread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first time : ");
        int h, m, s;
        h = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt();
        Time time1 = new Time();
        time1.setTime(h, m, s);
        time1.disp();
        System.out.println("Enter second time : ");
        h = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt();
        Time time2 = new Time();
        time2.setTime(h, m, s);
        time2.disp();
        Time add = time1.add(time2);
        Time sub = time1.subtract(time2);
        System.out.println("Added time is : ");
        add.disp();
        System.out.println("Subtracted time is : ");
        sub.disp();
        if (time1.isGreaterThan(time2) == 1) {
            System.out.println("Time-1 is greater.");
        } else if (time1.isGreaterThan(time2) == 0) {
            System.out.println("Equal times.");
        } else {
            System.out.println("Time-2 is greater.");
        }
    }
}