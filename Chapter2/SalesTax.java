import java.util.Scanner;

/*
Nabil Sharif
Introduction to Computer Science
Chapter 2 - SalesTax.java
Description: 
*
*Write a program that will ask the user to enter 
*the amount of a purchase. The program should then 
*compute the state and county sales tax. 
*Assume the state sales tax is 4 percent and the county
*sales tax is 2 percent. The program should display the 
*amount of the purchase, the state sales tax, the county sales
*tax, the total sales tax, and the total of the sale 
*(which is the sum of the amount of purchase plus the total 
*sales tax). Hint: Use the value 0.02 to represent 2 percent, 
*and 0.04 to represent 4 percent.
*
*/

public class SalesTax
{
	public static void main(String[] args)
	{
		//Use given info for state & county sales tax rate.
		final double STATE_TAX_RATE = 0.04;
		final double COUNTY_TAX_RATE = 0.02; 
		
		//Create scanner object for purchase amount 
		Scanner keyboard = new Scanner(System.in);
		
		//Ask user for purchase amount and store it 
		System.out.print("Enter purchase amount: $");
		double purchaseAmount = keyboard.nextDouble();
		
		//Compute the state and county sales tax
		double stateSalesTax = purchaseAmount*STATE_TAX_RATE;
		double countySalesTax = purchaseAmount*COUNTY_TAX_RATE;
		double totalSalesTax = stateSalesTax+countySalesTax;
		double totalOfSale=purchaseAmount+totalSalesTax;
		
		//Display purchaseAmount, state sales tax, county sales
		//tax, total sales tax, and total of sale to the user.
		System.out.println("Purchase Amount: $" + purchaseAmount);
		System.out.println("State Sales Tax: $" + stateSalesTax);
		System.out.println("County Sales Tax: $" + countySalesTax);
		System.out.println("Total Sales Tax: $" + totalSalesTax);
		System.out.println("Total of Sale: $" + totalOfSale);
	
		keyboard.close();
	}
}
