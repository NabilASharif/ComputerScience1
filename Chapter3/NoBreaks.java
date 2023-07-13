import java.util.Scanner;

/**
 * Nabil Sharif
 * Introduction to Computer Science
 *
 * Chapter 3 - NoBreaks.java
 *
 * Description:
 *
 * This program demonstrates the switch statement.
 *
 *
 */

public class NoBreaks 
{
	public static void main(String[] args)
	{
		int number; // A number entered by the user
		
		// Create a Scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		// Get one of the numbers 1,2, or 3 from the user
		System.out.print("Enter 1, 2, or 3: ");
		number = keyboard.nextInt();
		
		// Determine the unmber entered
		switch (number)
		{
			case 1:
				System.out.println("You entered 1.");
			case 2:
				System.out.println("You entered 2.");
			case 3:
				System.out.println("You entered 3.");
			default: 
				System.out.println("That's not 1, 2 " +
						"or 3.");
		} // end switch case
	} // end main
} // end clas
