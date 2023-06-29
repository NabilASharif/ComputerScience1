import java.util.Scanner;

/*
Nabil Sharif
Introduction to Computer Science
Chapter 2 - CircuitBoardProfit.java
Description: 
An electronics company sells circuit boards at a 40 percent profit. 
If you know the retail price of a circuit board, 
you can calculate its profit with the following formula:

Profit = retail price * 0.4 

Write a program that asks the user for the retail price of a circuit board, 
calculates the amount of profit earned for that product, and displays the results on the screen.
*/

public class CircuitBoardProfit
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the retail price of a circuit board: ");
		double retailPrice = scan.nextDouble();
		
		double profit = retailPrice * 0.4;
		
		System.out.println("\nThe amount of profit earned for that product is $" + profit);
		
		
		
		
		
		
	
		}
}
