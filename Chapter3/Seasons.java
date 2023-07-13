import java.util.Scanner;

/**
 * Nabil Sharif
 * Introduction to Computer Science
 *
 * Chapter 3 - Seasons.java
 *
 * Description:
 *
 * This program translates the English 
 * names of the seasons into Spanish.
 *
 */

public class Seasons 
{
	public static void main(String[] args)
	{
		String input; // To hold the user's input
		
		// Create a canner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		// Get a day from the user
		System.out.print("Enter the name of a season:");
		input = keyboard.nextLine();
		
		// Translate the season to Spanish
		switch(input)
		{
			case "spring":
				System.out.println("la primavera");
				break;
			case "summer":
				System.out.println("el verano");
				break;
			case "autumn":
			case "fall":
				System.out.println("el otono");
				break;
			case "winter":
				System.out.println("el invierno");
			default:
				System.out.println("Please enter one of " +
						"these words:\nspring, summer" +
						" autumn, fall, or winter.");
		
		} // end switch case
	} // end main
} // end class
