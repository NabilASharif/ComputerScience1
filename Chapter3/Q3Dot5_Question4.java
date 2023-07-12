import java.util.Scanner;

/**
 * Nabil Sharif
 *
 * Chapter 3 - Quiz3Dot5_Question4.java
 *
 * Description:
 *
 * Write a statement that uses the ! operator to toggle
 * the value of the boolean variable onOffSwitch. That is,
 * if onOffSwitch is false, its value is changed to true; 
 * if onOffSwitch is true, its value is changed to false.
 * 
 */

public class Q3Dot5_Question4
{
	public static void main(String[] args)
	{
		// declare required var(s)
		boolean onOffSwitch;
		
		// create scanner object for user input
		Scanner keyboard = new Scanner(System.in);
		
		// ask user to provide model year
		System.out.print("Enter true or false for the "
				+ " onOffSwitch:");
		onOffSwitch = keyboard.nextBoolean();
		
		// my answer for the problem.
		onOffSwitch = !onOffSwitch;
		
	} //end main

} //end class
