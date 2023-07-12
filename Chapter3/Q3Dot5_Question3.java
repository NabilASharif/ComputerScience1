import java.util.Scanner;

/**
 * Nabil Sharif
 *
 * Chapter 3 - Quiz3Dot5_Question3.java
 *
 * Description:
 *
 * Clunker Motors Inc. is recalling all vehicles from 
 * model years 2001—2006.Given a variable modelYear write
 * a statement that displays the message "NO RECALL" if 
 * the value of modelYear does not fall within that range.
 */

public class Q3Dot5_Question3
{
	public static void main(String[] args)
	{
		// declare required var(s)
		int modelYear;
		
		// create scanner object for user input
		Scanner keyboard = new Scanner(System.in);
		
		// ask user to provide model year
		System.out.print("Enter Clunker Motor Vehicle"
				+ " model year:");
		modelYear = keyboard.nextInt();
		
		// my answer for the problem. 
		if (modelYear < 2001 || modelYear > 2006)
			System.out.print("NO RECALL");
		
	} //end main

} //end class
