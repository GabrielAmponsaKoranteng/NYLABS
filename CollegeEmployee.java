import java.util.Scanner;

public class CollegeEmployee extends Person{
    protected int ssn;
    protected double salary;
    protected String department;

    public CollegeEmployee(){
        //System.out.println("New employee created");
        this.ssn = 0;
        this.salary = 0.00;
        this.department = null;
    }

    public void setPerson(){
        super.setPerson();
        System.out.print("SSN: ");
        this.ssn = input.nextInt();
        System.out.print("Salary: ");
        this.salary = input.nextDouble();
        System.out.print("Department: ");
        this.department = input.next();
    }
   
    public void dispPerson(){
        super.dispPerson();
        System.out.print(", SSN: "  +  this.ssn + ", Salary: " + this.salary + ",Department: " + this.department);
    }
}