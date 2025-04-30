
//Evaluation- used array
import java.util.*;

public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=0;
    float maxCgpa = 0;

    System.out.println("Enter the number of students\n");
    n=sc.nextInt();

    Student parr[]=new Student[n];
 
    for(int i=0;i<n;i++)
    {
      System.out.println("\nEnter the details of Student "+ (i+1));
      parr[i]=new Student();
      parr[i].read();
    }

   for(int i=0;i<n;i++)
   {
    System.out.println("\nThe details of Student "+ (i+1));
    parr[i].print();
  }
 
 

     maxCgpa = parr[0].cgpa;
        for (int i = 1; i < n; i++) {
            if (parr[i].cgpa > maxCgpa) {
                maxCgpa = parr[i].cgpa;
            }
        }
       
        System.out.println("\nThe MAX CGPA is " + maxCgpa);
    }
}



class Student
{
 int Rollno;
 String Name;
 String usn;
 float cgpa;

public Student()
{
 this.Rollno=0;
 this.Name=null;
 this.usn=null;
 this.cgpa=0;
}

public Student(int Rno,String Name1,String srn,float gpa)
{
 this.Rollno=Rno;
 this.Name=Name1;
 this.usn=srn;
 this.cgpa=gpa;

}

public Student(Student s1)
{
 this.Rollno=s1.Rollno;
 this.Name= s1.Name;
 this.usn=s1.usn;
 this.cgpa=s1.cgpa;
}

void read()
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Rollno of the student");
 Rollno=sc.nextInt();
 
 System.out.println("\nEnter the Name of the student");
 Name=sc.nextLine();
 sc.nextLine();

 System.out.println("\nEnter the Usn of the student");
 usn=sc.nextLine();

 System.out.println("\nEnter the cgpa of the student");
 cgpa=sc.nextFloat();
 }

void print()
{
 System.out.println("\nThe Rollno is "+Rollno+"\nThe Name is "+Name+"\nThe Usn is "+usn+"\nThe Cgpa is "+cgpa);
}

}