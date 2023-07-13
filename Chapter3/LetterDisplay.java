import java.util.Scanner;
/**
 * Nabil Sharif
 * Introduction to Computer Science
 * Chapter 3 - LetterDisplay.java
 */

import java.util.Scanner;

public class LetterDisplay
{
   public static void main(String[] args)
   {
       char selection;
       Scanner keyboard = new Scanner(System.in);

       System.out.print("Enter A, B, C, D: ");
       selection = keyboard.next().charAt(0);

       switch (selection)
       {
       case 'A':
           System.out.println("You selected A.");
           break;
       case 'B':
           System.out.println("You selected B.");
           break;
       case 'C':
           System.out.println("You selected C.");
           break;
       case 'D':
           System.out.println("You selected D.");
           break;
       default:
           System.out.println("Not good with letters, eh?");

       } // end switch
    } // end main
} // end class