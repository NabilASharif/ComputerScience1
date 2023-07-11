import java.util.Scanner;

/*
* Nabil Sharif
* Introduction to Computer Science
* Chapter 3 - Score.java
* Description: 
* 
* Create a program which asks the user to enter their test score.
* If the user's test score score is > 90, then the program displays 
* "That's a great score!" on one line and then the program displays 
* "Keep up the good work." on the next line.If the user's test score 
* is <=90, then the program will prompt the user for a test score but 
* it won't display the print statements nested under the if conditional.
*
*/

public class Score
{
	public static void main(String[]args)
	{
		//Create a scanner object for keyboard input
		Scanner scan = new Scanner(System.in);
		
		//Get a test score
		System.out.print("Enter your test score:");
		double testScore = scan.nextDouble();
		
		//Was the score a good one?
		if (testScore > 90)
		{
			System.out.println("That's a great score!");
			System.out.println("Keep up the good work.");
		}
	}
}