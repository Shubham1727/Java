import java.util.*;
public class Demo12 {
    public static void main(String args[])
    {
        Scanner S=new Scanner(System.in);
        int n,d,m,y,yog;
        double gpa;
        //String names;
        System.out.println("Enter the Number of Students : ");
        n=S.nextInt();
        Clg_G[]obj;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter your Name : ");
            String names=S.nextLine();
            System.out.println("Enter your Date of Birth : ");
            System.out.println("Date : ");
            d=S.nextInt();
            System.out.println("Month : ");
            m=S.nextInt();
            System.out.println("Year : ");
            y=S.nextInt();
            System.out.println("Enter your GPA : ");
            gpa=S.nextDouble();
            System.out.println("Enter your Year of Graduation : ");
            yog=S.nextInt();
           new Clg_G(names,d,m,y,gpa,yog);
        }
    }
}
class Person
{
    private String name;
    private int d,m,y;
    Person(String name,int d,int m,int y)
    {
        this.name=name;
        this.d=d;
        this.m=m;
        this.y=y;
    }
}
class Clg_G extends Person
{
    private double gpa;
    private int yog;
    Clg_G(String name,int d,int m,int y,double gpa,int yog)
    {
        super(name,d,m,y);
        this.gpa=gpa;
        this.yog=yog;
    }
}
