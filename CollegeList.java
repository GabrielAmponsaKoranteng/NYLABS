import java.util.Scanner;

public class CollegeList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] personCount = {0,0,0};
        String decision;

        CollegeEmployee[] colEmps = new CollegeEmployee[4];
        Faculty[] facultMems = new Faculty[3];
        Student[] students = new Student[7];

        do{
            System.out.println("Enter C, F, or S for college Employee, faculty Member or Student rescpectively."+
            "\nEnter  Q to quit.");
            decision = input.next();
            if(decision.toLowerCase().indexOf('c')==0){
                if(personCount[0]<4){
                    //colEmps[personCount[0]++].fNname = "baron";
                    colEmps[personCount[0]] = new CollegeEmployee();
                    colEmps[personCount[0]++].setPerson();
                }
                else{
                    System.out.println("Number of College Employees exceeded.");
                }
            }
            else if(decision.toLowerCase().indexOf('f')==0){
                if(personCount[1]<3){
                    facultMems[personCount[1]] = new Faculty();
                    facultMems[personCount[1]++].setPerson();
                }
                else{
                    System.out.println("Number of Faculty Member exceeded.");
                }
            }
            else if(decision.toLowerCase().indexOf('s')==0){
                if(personCount[2]<7){
                    students[personCount[2]] = new Student();
                    students[personCount[2]++].setPerson();
                }
                else{
                    System.out.println("Number of Students exceeded.");
                }
            }
            else if(decision.toLowerCase().equals("q")){
                break;
            }
        }while(true);

        System.out.println("\tCollege Employees");
        if(personCount[0]==0){
            System.out.println("No College Employees have been created");
        }
        else{
            for(int i=0;i<personCount[0];i++ ){
                colEmps[i].dispPerson();
                System.out.println();
            }
        }
        System.out.println("\tFaculty Members");
        if(personCount[1]==0){
            System.out.println("No Faculty Members have been created");
        }
        else{
            for(int i=0;i<personCount[1];i++ ){
                facultMems[i].dispPerson();
                System.out.println();
            }
        }
        System.out.println("\tStudents");
        if(personCount[2]==0){
            System.out.println("No Students have been created");
        }
        else{
            for(int i=0;i<personCount[2];i++ ){
                students[i].dispPerson();
                System.out.println();
            }
        }


        input.close();
        
    }    
}