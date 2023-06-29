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

public class MaleAndFemalePercentages
{
	public static void main(String[] args)
	{
		//create scanner obj
		Scanner scan = new Scanner(System.in);
		
		//ask user to enter # male and female reg in a class
		System.out.println("Enter # of males registered"
				+ " in a class:");
		double numberOfMales = scan.nextDouble();
		
		System.out.println("Enter # of females registered"
				+ " in a class:");
		double numberOfFemales = scan.nextDouble();
		
		//calculate total, percentmale, and percentfemale.
		double total = numberOfMales+numberOfFemales;
		
		double percentOfMales=(numberOfMales/total)*100;
		double percentOfFemales=(numberOfFemales/total)*100;
		
		//display % male and % female
		System.out.println("male reg: " + percentOfMales + "%");
		System.out.println("female reg: " + percentOfFemales + "%");


	}
}
