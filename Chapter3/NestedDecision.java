import java.util.Scanner;

/**
 * Nabil Sharif
 *
 * Chapter 3 - NestedDecision.java
 *
 * Description:
 *
 * This program asks the user to enter a numeric test
 * score and displays a letter grade for the score. 
 * The program uses nested decision structures to 
 * determine the grade that the student got.
 *
 */

public class NestedDecision 
{
	public static void main(String [] args)
	{
		//Declare and initialize var for test score
		double testScore =0;
		
		//Create scanner to hold test score input data
		Scanner stdin = new Scanner(System.in);
		
		//Ask the user to enter a test score
		System.out.println("Enter your test score: ");
		testScore = stdin.nextDouble();
		
		if (testScore < 60)
		{
			System.out.println("Your grade is F.");
			
		}
		else
		{
			if (testScore < 70)
			{
				System.out.println("Your grade is D.");
			}
			else 
			{
				if (testScore < 80)
				{
					System.out.println("Your grade is C.");
				}
				else
				{
					if (testScore < 90)
					{
						System.out.println("Your grade is B.");
					}
					else
					{
						System.out.println("Your grade is A.");
					}
				}
			}
		}
	} // end main
} // end class
