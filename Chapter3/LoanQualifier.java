import java.util.Scanner;

/**
 * Nabil Sharif
 *
 * Chapter 3 - LoanQualifier.java
 *
 * Description:
 *
 * This program demonstrates a nested if statement.
 *
 */

public class LoanQualifier 
{
	public static void main(String [] args)
	{
		double salary; // Annual salary
		double yearsOnJob; // Years at current job
		
		// Create a scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		// Get the user's annual salary
		System.out.println("Enter your annual salary: ");
		salary = keyboard.nextDouble();
		
	
		// Get the number of years at the current job
		System.out.println("Enter the number of years: "
				+ "at your current job: ");
		yearsOnJob = keyboard.nextDouble();
		
		// Determines whether the user qualified for the loan.
		
		if (salary >= 50000)
		{
			if (yearsOnJob >= 2)
			{
				System.out.println("You qualify for the loan.");
			} 
			else
			{
				System.out.println("You must have been on your" 
						+ " current job for at least"
						+ " two years to qualify.");
			}			
		} 
		else
		{
			System.out.println("You must earn at least"
					+ " $50,000 per year to qualify.");
		}
		
	}

}
