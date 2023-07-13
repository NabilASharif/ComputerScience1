import java.util.Scanner;
/**
 * Nabil Sharif
 * Introduction to Computer Science
 * Chapter 3 - Q3Dot9_Question1.java
 */

import java.util.Scanner;

public class Q3Dot9_Question1
{
   public static void main(String[] args)
   {
	   // assumed variable
	   char response = 'y';
	  
	   //my answer
	   switch (response)
	   {
	   case 'y':
		   System.out.println("Your request is being" +
				   " processed");
		   break;
	   case 'n': 
		   System.out.println("Thank you anyway for" +
				   " your consideration");
		   break;
	   case 'h':
		   System.out.println("Sorry, no help is" +
				   " currently available");
		   break;
	   default:
		   System.out.println("Invalid entry;" +
				   "please try again");
       } // end switch
    } // end main
} // end class