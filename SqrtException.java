package Lab3.Question1;

import java.util.Scanner;

public class SqrtException {

   public static void main(String[] args) {
       //Declaring variable
       int number;
      
       //Scanner object is used to get the inputs entered by the user
       Scanner sc=new Scanner(System.in);

       //Getting the number entered by the user
       System.out.print("Enter the number :");
       number=sc.nextInt();
       try {
           /* if the user entered number is positive calculate the Square root of a number
           * if negative,throws ArithmeticException
           */
           if(number>=0)
           {
               System.out.println("The Square Root of "+number+" is :"+Math.sqrt(number));  
           }
           else
           {
               //Throwing Arithmetic Exception
               throw new ArithmeticException("** Could'nt find the square for Negative Number **");
           }
       } catch (Exception e) {
           //Displaying the Exception Here
           System.out.println("Exception :"+e);
       }
   }

}