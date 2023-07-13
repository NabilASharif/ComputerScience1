import java.util.Scanner;
/**
 * Nabil Sharif
 * Introduction to Computer Science
 * Chapter 3 - NumberDisplay.java
 */

public class NumberDisplay
{
   public static void main(String[] args)
   {
       int userNum;
       Scanner keyboard = new Scanner(System.in);

       System.out.print("Enter 1, 2, or 3: ");
       userNum = keyboard.nextInt();
       
       switch(userNum)
       {
       case 1:
    	   System.out.println("one");
    	   break;
       case 2:
    	   System.out.println("two");
    	   break;
       case 3:
    	   System.out.println("three");
    	   break;
       default: 
    	  System.out.println("Invalid entry.");
       } // end switch
    } // end main
} // end class