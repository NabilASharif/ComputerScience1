/*
Nabil Sharif
Introduction to Computer Science
Chapter 2 - Contribution.java
Description: This program calculates the amount of pay
that will be contributed to a retirement plan if 5%, 
8%, or 10% monthly pay is withheld from ones paycheck.
*/

public class Contribution
{
	public static void main(String[] args)
	{
		// Variables to hold monthly pay and
		// the amount of contribution. 
		double monthlyPay = 6000;
		double contribution;
		
		// Calculate and display a 5% contribution
		contribution = 6000 * 0.05;
		System.out.println("5 percent is $" +
		contribution + " per month");
		
		contribution = 6000 * 0.08;
		System.out.println("8 percent is $" +
		contribution + " per month");
		
		contribution = 6000 * 0.10;
		System.out.println("10 percent is $" +
		contribution + " per month");
		
		
	}
}
