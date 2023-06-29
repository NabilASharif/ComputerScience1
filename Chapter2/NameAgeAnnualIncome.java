/*
Nabil Sharif
Introduction to Computer Science
Chapter 2 - NameAgeAnnualIncome.java
Description: 
A program that declares the following: 
• a String variable named name 
• an int variable named age 
• a double variable named annualPay 
stores a name age, name, and desired annual income *
* as literals in these variables as stated in the textbook. 
*/

public class NameAgeAnnualIncome
{
	public static void main(String[] args)
	{
		String name= "Joe Mahoney";
		int age=26;
		double annualPay=100000;
		
		System.out.println("My name is " + name + 
		", my age is " + age + " and");
		
		System.out.println("I hope to earn $" + annualPay +
		" per year.");
		
		}
}
