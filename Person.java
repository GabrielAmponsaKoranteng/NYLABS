import java.util.Scanner;

public class Person {
    protected String fNname;
    protected String lNname;
    protected String sAddress;
    protected String phoneNum;

    protected static Scanner input = new Scanner(System.in);

    public Person(){
        //System.out.println("New Person created");
        this.fNname = this.lNname = this.phoneNum = this.sAddress = null;
    }

    public void setFname(String inFname){this.fNname = inFname;}
    public void setLname(String inLname){this.lNname = inLname;}
    public void setSaddress(String inSaddress){this.sAddress = inSaddress;}
    public void setPhoneNum(String inPhoneNum){this.phoneNum = inPhoneNum;}

    public String getFname(){return fNname;}
    public String getLname(){return lNname;}
    public String getAddress(){return sAddress;}
    public String getPhone(){return phoneNum;}

    public void setPerson(){

        System.out.println("Please Enter Your Details");
        System.out.print("First Name: ");
        this.fNname = input.next();
        System.out.print("Last Name: ");
        this.lNname = input.next();
        System.out.print("Street Address: ");
        this.sAddress = input.next();
        System.out.print("Phone Number: ");
        this.phoneNum = input.next();
    }

    public void dispPerson(){
        System.out.print(this.lNname + " " + this.fNname+
            ", " + this.sAddress + ", " + this.phoneNum);
    }
}