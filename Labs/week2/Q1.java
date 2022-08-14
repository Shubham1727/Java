import java.util.*;
import java.text.*;
import java.util.Scanner;
 
class Student 
{    
    int regNo;
    String fullName;
    GregorianCalendar date;
    short sem;
    float gpa;
    float cgpa;
    
    Student() 
    {
        regNo = 0;
        fullName = "";
        date = new GregorianCalendar();
        sem = 0;
        gpa = 0.f;
        cgpa = 0.f;
    }
    
    Student(Student s) 
    {
        this.regNo = s.regNo;
        this.fullName = s.fullName;
        this.date = s.date;
        this.sem = s.sem;
        this.gpa = s.gpa;
        this.cgpa = s.cgpa;
    }
    
    public void display() 
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy"); 
        System.out.println("\n\t       Name = " + fullName + 
                           "\n\t     Reg No = " + regNo + 
                           "\n\tDate Joined = " + dateFormat.format(date.getTime()) +
                           "\n\t   Semester = " + sem + 
                           "\n\t        GPA = " + gpa + 
                           "\n\t       CGPA = " + cgpa + 
                           "\n");
    }
    
    public void input() 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\n\tEnter Your Name = ");
        fullName = sc.nextLine();
        
        System.out.print("\tEnter The Date You Joined (yyyy mm dd) = ");
        date = new GregorianCalendar(sc.nextInt(), sc.nextInt() - 1, sc.nextInt());
        
        System.out.print("\tEnter Your Semester = ");
        sem = sc.nextShort();
        
        System.out.print("\tEnter Your GPA = ");
        gpa = sc.nextFloat();
        
        System.out.print("\tEnter Your CGPA = ");
        cgpa = sc.nextFloat();
        
        System.out.println();
    }
}
 
class Students 
{
    
    Student students[];
    int size;
    
    public Students(int size) 
    {
        this.size = size;
        this.students = new Student[size];
    }
    
    public void inputAll() 
    {
        for (int i = 0; i < size; ++i) 
        {
            System.out.println("\t\tStudent " + (i+1) + " =");
            students[i] = new Student();
            students[i].input();
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yy");
            String regNo = dateFormat.format(students[i].date.getTime());
            regNo += String.format( "%02d", i+1);
            students[i].regNo = Integer.parseInt(regNo);
        }
    }
    
    public void displayAll() 
    {
        for (Student stud: students)
        {
            stud.display();
        }
    }
    
    public void list(String str) 
    {
        for (Student stud: students) 
        {
            if (stud.fullName.contains(str))
            {
                stud.display();
            }
        }
    }
    
    public void list(char ch) 
    {
        for (Student stud: students) 
        {
            if (stud.fullName.indexOf(ch) == 0)
            {
                stud.display();
            }
        }
    }
    
    
    public void sort(String wrt) 
    {
        for (int i = 0; i < size - 1; ++i) 
        {
            int min = i;
            for (int j = i + 1; j < size; ++j) 
            {
                
                if (wrt.equals("fullName") && (students[j].fullName.compareTo(students[min].fullName)) < 0)
                {
                    min = j;
                }
            }
            
            if (min != i) 
            {
                Student temp = students[i];
                students[i] = students[min];
                students[min] = temp;
            }
        }
    }
}
 
public class StudentExam 
{    
    public static void main (String args[])
     {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\n\tEnter the number of records = ");
        int size = sc.nextInt();
        if (size < 5 )
        {
            System.out.print("\n\t not valid according to question");
            System.exit(0);
 
        }    
        
        Students students = new Students (size);
        students.inputAll();
sc.nextLine();
        
        char choice;
        
        do 
        {
            System.out.print("\n\t1. Display All The Records." + 
"\n\t2. Sort With Respect To Name." +
"\n\t3. List Of All The Students whose name contains a string." +
"\nAnything Other To exit." +
"\n\n\t Enter Your choice: ");
            choice = sc.next().charAt(0);
sc.nextLine();
            
            switch (choice) 
            {
                case '1': 
 
                students.displayAll();
                
                break;
                
                case '2': 
 
                students.sort("FullName");
                System.out.println("\nSort With Respect To Name.\n");
                students.displayAll();
                
                break;
                
                case '3': 
 
                System.out.print("\n\tEnter the string = ");
                String subs = sc.nextLine();
                students.list(subs);
System.out.println("\n\tAll the student names containing \' " + subs + "\' : \n");
students.displayAll();
                
                break;
                
                default: 
                
                break;
            }
        }while ("1234567".indexOf(choice) != -1);
    }
}
