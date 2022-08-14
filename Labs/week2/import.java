import java.util.Scanner;
import java.lang.*;
import java.io.*;

class Time {
    int hr;
    int min;
    int sec;

    public void input(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    public void add(Time obj1, Time obj2) {
        Time ob = new Time();
        ob.hr = obj1.hr + obj2.hr;
        ob.min = obj1.min + obj2.min;
        ob.sec = obj1.sec + obj2.sec;
        if (ob.sec >= 60) {
            ob.min = ob.min + 1;
            ob.sec = ob.sec - 60;
        }
        if (ob.min >= 60) {
            ob.hr = ob.hr + 1;
            ob.min = ob.min - 60;
        }
        if (ob.hr >= 24) {
            ob.hr = ob.hr - 24;
        }
        display(ob);
    }

    public void subtract(Time obj1, Time obj2) {
        Time ob = new Time();
        ob.hr = (int) Math.abs(obj1.hr - obj2.hr);
        ob.min = (int) Math.abs(obj1.min - obj2.min);
        ob.sec = (int) Math.abs(obj1.secobj2.sec);
        display(ob);
    }

    public void display(Time ob) {
        System.out.println(ob.hr + ":" + ob.min + ":" + ob.sec);
    }

    public void compare(Time obj1, Time obj2) {
        if (obj1.hr == obj2.hr && obj1.min == obj2.min && obj1.sec == obj2.sec) {
            System.out.println("Both Time are Equal");
        } else if (obj1.hr > obj2.hr) {
            System.out.println("Time 1 is greater");
        } else if (obj2.hr > obj1.hr) {
            System.out.println("Time 2 is greater");
        } else {
            if (obj1.min > obj2.min) {
                System.out.println("Time 1 is greater");
            } else if (obj2.min > obj1.min) {
                System.out.println("Time 2 is greater");
            } else {
                if (obj1.sec > obj2.sec) {
                    System.out.println("Time 1 is greater");
                } else {
                    System.out.println("Time 2 is greater");
                }
            }
        }
    }
}

public class TimeMain {
    public static void main(String[] args) {
        Time obj1 = new Time();
        Time obj2 = new Time();
        Time ob = new Time();
        obj1.input(8, 59, 59);
        obj2.input(7, 8, 9);
        ob.compare(obj1, obj2);
        ob.add(obj1, obj2);
        ob.subtract(obj1, obj2);
    }
}