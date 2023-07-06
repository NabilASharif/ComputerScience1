import java.util.Scanner;
import java.math.*;

/*
* Nabil Sharif
* Introduction to Computer Science
* Chapter 2 - CompoundInterest.java
* Description: 
* When a bank account pays compound interest, it pays interest not only on the
* principal amount that was deposited into the account, but also on the interest
* that has accumulated over time. Suppose you want to deposit some money into a 
* savings account, and let the account earn compound interest for a certain 
* number of years. The formula for calculating the balance of the account after 
* a specified number of years is:A=P (1+rn)nt The terms in the formula are:
* 
* A is the amount of money in the account after the specified number of years.
* P is the principal amount that was originally deposited into the account.
* r is the annual interest rate.
* n is the number of times per year that the interest is compounded.
* t is the specified number of years.
* 
* Write a program that makes the calculation for you. 
* The program should ask the user to input the following:
* 
* The amount of principal originally deposited into the account
* The annual interest rate paid by the account
* The number of times per year that the interest is compounded 
* (For example, if interest is compounded monthly, enter 12.
* And If interest is compounded quarterly, enter 4.
* 
* The number of years the account will be left to earn interest
* Once the input data has been entered, the program should calculate and display
* the amount of money that will be in the account after the specified # of years.
*/

public class CompoundInterest //start class
{
	//start main method
	
	public static void main(String[] args)
	{
		// create vars for the grapevines formula
		// A = amountOfMoneyInAccount_SpecifiedNumberOfYears
		// P = principalAmount_DepositedIntoAccount
		// r = annual_Interest_Rate
		// n = numberOfTimesPerYear_ThatInterestIsCompounded
		// t = specified_Number_Of_Years
		
		double amountOfMoneyInAccount_SpecifiedNumberOfYears = 0;
		double principalAmount_DepositedIntoAccount = 0;
		double annual_Interest_Rate = 0;
		double numberOfTimesPerYear_ThatInterestIsCompounded = 0;
		double specified_Number_Of_Years = 0;
	
		
		//create scanner obj and use it to take in user input
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter P the amount of principal" +
				" originally deposited into the account:");
		principalAmount_DepositedIntoAccount = Scan.nextDouble();
		
		System.out.println("Enter r the annual interest rate: ");
		annual_Interest_Rate = Scan.nextDouble()/100;
		
		System.out.println("Enter n the number of times per year " +
				"that interest is compounded: ");
		numberOfTimesPerYear_ThatInterestIsCompounded = Scan.nextDouble();
		
		System.out.println("Enter t the number of years the account " +
				"will be left to earn interest: ");
		specified_Number_Of_Years = Scan.nextDouble();
		
		// Calculate and display the following:
		// A = amountOfMoneyInAccount_SpecifiedNumberOfYears
		
		amountOfMoneyInAccount_SpecifiedNumberOfYears = 
				Math.pow(principalAmount_DepositedIntoAccount *
						 (1+((annual_Interest_Rate)/
								 numberOfTimesPerYear_ThatInterestIsCompounded)), 
						 numberOfTimesPerYear_ThatInterestIsCompounded *
						 specified_Number_Of_Years);
				
		System.out.println("The amount of money in the account" +
		" after the specified number of years: $" +
		amountOfMoneyInAccount_SpecifiedNumberOfYears);
	
		
	} // end main
} // end class