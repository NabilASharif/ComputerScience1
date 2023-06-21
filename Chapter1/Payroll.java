/*
Nabil Sharif
Introduction to Computer Science
Chapter 1 - Payroll.java
Description: Assume user works 40 hrs/wk and that their
payrate is $25/hr. Then compute and display user's grosspay.
*/

public class Payroll
{
	public static void main(String[] args)
	{
		int hours = 40;
		double grosspay, payrate = 25.0;
		
		grosspay = hours * payrate;
		System.out.println("Your grosspay is $" + grosspay);
		
	}
}