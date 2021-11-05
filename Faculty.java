public class Faculty extends CollegeEmployee{
    protected boolean tenure;

    public Faculty(){
        super();
        //System.out.println("Faculty created");
    }

    public void setPerson(){
        super.setPerson();
        System.out.print("Tenured(y/n): ");
        String dec = input.next();
        do{
        if(dec.toLowerCase().indexOf('y')==0){
            tenure = true;
            break;
        }
        else if(dec.toLowerCase().indexOf('n')==0){
            tenure = false;
            break;
        }
        }while(true);
    }

    public void dispPerson(){
        super.dispPerson();
        if(tenure){
            System.out.print(" Tenured");
        }
        else{
            System.out.print(" Not Tenured");
        }
        //System.out.println();
    }
}