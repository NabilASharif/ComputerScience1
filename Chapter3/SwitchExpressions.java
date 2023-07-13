import java.util.Scanner;

/**
 * Nabil Sharif
 * Introduction to Computer Science
 * Chapter 3 - SwitchExpressions.java
 */

public class SwitchExpressions 
{
	public static void main(String[] args)
	{
		// Variables 
		int dayNumber;
		String dayName;
		
		// Create a Scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		// Get the number for the day of the week.
		System.out.print("What is the day of the " +
				"week? (1-7): ");
		dayNumber = keyboard.nextInt();
		
		// Get the name of the day.
		dayName = switch(dayNumber)
		{
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		case 7 -> "Sunday";
		default -> "Invalid day number";
		};
		
	} // end main
	
} // end class