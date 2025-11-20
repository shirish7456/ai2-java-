import java.util.Scanner;
/**
 * Write a description of class UserInput here.
 *we use scanner to take input from user 
 *it is built in type class 
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserInput
{
   public static void mian (String[]arg) 
   {
       Scanner sc=new Scanner (System.in);
       System.out.println("enter the firstNumber");
       int firstNumber=sc.nextInt ();
       
       System.out.println("enter the secondNumber");
       int secondNumber = sc.nextInt();
       int sum=firstNumber + secondNumber ;
       System.out.println("sum of two number is"+sum );
       
       int bigger=(firstNumber>secondNumber)?firstNumber:secondNumber;
       System.out.println("GreatestNumberis " +bigger);
       
   }
}