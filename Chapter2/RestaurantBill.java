import java.util.Scanner;

/*
* Nabil Sharif
* Introduction to Computer Science
* Chapter 2 - RestaurantBill.java
* Description: 
* Write a program that computes the tax and tip 
* on a restaurant bill. The progrtam should ask the 
* user to enter the charge for the meal. The tax should be 
* 6.75 percent of the meal charge. The tip should be 20 
* percent of the total after adding the tax. Display the meal 
* charge, tax amount, tip amount, and total bill on screen.
*/

public class RestaurantBill
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter charge for meal: ");
		double mealCharge = scan.nextDouble();
		
		double mealTax = 0.0675 * mealCharge;
		double mealTotal = mealCharge + mealTax;
		double mealTip = 0.20 * mealTotal;
		
		System.out.println("Meal charge: $" + mealCharge);
		System.out.println("Meal tax: $" + mealTax);
		System.out.println("Meal tip: " + mealTip);
		System.out.println("Meal total: " + mealTotal);

	}
}
