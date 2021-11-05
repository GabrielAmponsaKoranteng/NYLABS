public class Student extends Person{
    protected String studyField; 
    protected double gpa;

    public void setPerson(){
        super.setPerson();
        System.out.print("Field of Study: ");
        this.studyField = input.next();
        System.out.print("GPA: ");
        this.gpa = input.nextDouble();
    }
   
    public void dispPerson(){
        super.dispPerson();
        System.out.print(", "  +  this.studyField + ", GPA: " + this.gpa);
    }
}