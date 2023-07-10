import java.util.Scanner;

/**
 * @author Nabil Sharif
 * Chapter 3 - AverageScore2.java
 * Description: 
 * 
 * This program demonstrates the if statement and flags.
 *
 */
public class AverageScore2 
{

	public static void main(String[] args) 
	{
		
		//Create the required variables.
		double score1, score2, score3;
		
		//Create a Scanner object to read input
		Scanner scan = new Scanner(System.in);
		
		//Ask user to enter their 3 test scores
		System.out.print("Enter score #1: ");
		score1 = scan.nextDouble();
		
		System.out.print("Enter score #2: ");
		score2 = scan.nextDouble();
		
		System.out.print("Enter score #3: ");
		score3 = scan.nextDouble();
		
		//Compute the average of the user's 3 test scores
		double averageScore = (score1+score2+score3)/3.0;
		System.out.println("The average is " +
				averageScore);
		
		//Display a congratulation message if averageScore > 95
		boolean highScore = false;
		
		if (averageScore > 95)
			 highScore = true;
		
		if (highScore)
			System.out.println("That's a great score!");
		
	}

}