import java.util.Scanner;

/*
Nabil Sharif
Introduction to Computer Science
Chapter 2 - MilesPerGallon.java
*/

public class MilesPerGallon
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Miles Driven: ");
		double milesDriven = scanner.nextDouble();
		
		System.out.print("\nEnter Gallons Used: ");
		double gallonsUsed  = scanner.nextDouble();
		
		double milesPerGallon = milesDriven / gallonsUsed;
		
		System.out.print("\nMiles Per Gallon: " + 
		milesPerGallon);
		
		
		


		
		}
}
