import java.util.Scanner;
/*
* Nabil Sharif
* Introduction to Computer Science
* Chapter 3 - SecretWord.java
* 
* Description: 
* This program demonstrates a case insensitive string comparison
* 
*/


public class SecretWord
{
	public static void main(String[] args)
	{
		String input; // To hold the user's input
		
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
		// Prompt the user to enter the secret word
		System.out.print("Enter the secret word: ");
		input = keyboard.nextLine();
		
		if (input.equalsIgnoreCase("PROSPERO"))
		{
			System.out.println("Congratulations! You " +
					" know the secret word!");
		}
		else
		{
			System.out.println("Sorry, that is NOT the" +
					" secret word!");
		}
	
	} // end main

} //end class
