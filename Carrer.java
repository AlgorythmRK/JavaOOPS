import java.util.*;

public class Carrer {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); 

       Employee parr[]=new Employee[n];     


       for(int i=0;i<n;i++)
       {
        System.out.println("Enter the deatils of the employee "+i);
        parr[i] = new Employee();
        parr[i].reading();
       }


       for(int i=0;i<n;i++)
       {
        System.out.println("The details of the employe is "+i+"\n");
        parr[i].print();
       }

       double SumSal=0;
       for(int i=0;i<n;i++)
       {
       SumSal+=parr[i].Salary;
       }

       System.out.println("The sum of the salary is:"+SumSal);
    }

}


//creating a class called Employee
class Employee
{
    int Eid;
    String Ename;
    double Salary;
    String Courses;


//creating a class constructor for the class employee
 public Employee()
{
    Eid=0;
    Ename=null;
    Salary=0;
    Courses=null;
}
//creating a parameterized constructor
public Employee(int id, String name, double salary, String courses) {
    this.Eid = id;
    this.Ename = name;
    this.Salary = salary;
    this.Courses = courses;
}
//creating a copy constructor
public Employee(Employee anoEmp){
    this.Eid=anoEmp.Eid;
    this.Courses=anoEmp.Courses;
    this.Ename=anoEmp.Ename;
    this.Salary=anoEmp.Salary;
}

//reading method
void reading()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Employee ID: ");
    Eid = sc.nextInt();
    sc.nextLine(); 
    System.out.println("Enter Employee Name: ");
    Ename = sc.nextLine(); 

    System.out.println("Enter Course: ");
    Courses = sc.nextLine(); 

    System.out.println("Enter Salary: ");
    Salary = sc.nextDouble(); 

    
}

void print()
{
  System.out.println("The EId is "+Eid+"\nthe course is "+Courses+"\nThe salary is "+Salary+"\nthe name of the emp is "+Ename);
}
}
