import java.util.Scanner;

/**
 * Nabil Sharif
 *
 * Chapter 3 - LogicalAnd.java
 *
 * Description:
 *
 * This program demonstrates the logical && operator
 *
 */

public class LogicalAnd 
{
	public static void main(String[] args)
	{
		// declare required variables
		
		double salary;     // Annual salary
		double yearsOnJob; // Years at current job
		
		// Create a scanner object for keyboard input
		Scanner keyboard  = new Scanner(System.in);
		
		// Get the user's annual salary.
		System.out.print("Enter your annual salary: ");
		salary = keyboard.nextDouble();
		
		// Get the number of years at the current job.
		System.out.print("Enter the number of years "
				+ "at your current job: ");
		yearsOnJob = keyboard.nextDouble();
		
		// Determine whether the user qualified for the loan.
		if (salary >= 50000 && yearsOnJob >=2)
		{
			System.out.println("You qualify for the loan");
		}
		else 
		{
			System.out.println("You do not qualify.");
		}
		
	} // end main

} // end class
