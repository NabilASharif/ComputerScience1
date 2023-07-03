/*
* Nabil Sharif
* Introduction to Computer Science
* Chapter 2 - EnergyDrinkConsumption.java
* Description: 
* A soft drink company recently surveyed 
* 12,467 of its customers and found that approximately 
* 14 percent of those surveyed purchase one or more energy
* drinks per week. Of those customers who purchase energy 
* drinks, approximately 64 percent of them prefer 
* citrus-flavored energy drinks. Write a program that 
* displays the following:• The approximate number of 
* customers in the survey who purchase one or more energy 
* drinks per week• The approximate number of customers in 
* the survey who prefer citrus-flavored energy drinks
*/

public class EnergyDrinkConsumption
{
	public static void main(String[] args)
	{
		//instantiate and initialize the given variables
		double totalCustSurveyed = 12467,
				custSurveyed_OnePlusEnergyDrinksPerWeek,
				custSurveyed_CitrusEnergyDrinks;
				;
		
		
		//calculations
		custSurveyed_OnePlusEnergyDrinksPerWeek= 
				totalCustSurveyed*0.14;
		
		custSurveyed_CitrusEnergyDrinks=
				custSurveyed_OnePlusEnergyDrinksPerWeek*0.64;
		
		
		//display
		System.out.println("Customers Surveyed who purchase"
				+ " one or more energy drinks per week: " + 
				custSurveyed_OnePlusEnergyDrinksPerWeek);
		
		System.out.println("Customers Surveyed who prefer"
				+ " citrus-flavored energy drinks: " + 
				custSurveyed_CitrusEnergyDrinks);
		
	
		
	}
}
