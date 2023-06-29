import java.util.Scanner;

/*
Nabil Sharif
Introduction to Computer Science
Chapter 2 - TestAverage.java
Description: 
Write a program that asks the user to enter three
test scores. The program should display each test score, 
as well as the average of the scores.

*/

public class TestAverage
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Test Score 1 (i.e. 95.67 evaluates to 95.67%): ");
		double testScore1 = scanner.nextDouble();
		
		System.out.print("\nEnter Test Score 2 (i.e. 45.10 evaluates to 45.10%):  ");
		double testScore2  = scanner.nextDouble();
		
		System.out.print("\nEnter Test Score 3 (i.e. 89.41 evaluates to 89.41%): ");
		double testScore3  = scanner.nextDouble();	
		
		double average = (testScore1 + testScore2 + testScore3)/3;

		System.out.print("\nTest Score 1: " + testScore1 + "%");
		System.out.println("\nTest Score 2: " + testScore2 + "%");
		System.out.println("Test Score 3: " + testScore3 + "%");
		System.out.println("\nAverage: " + average + "%");
	
		}
}
