import java.util.Scanner;

/*
* Nabil Sharif
* Introduction to Computer Science
* Chapter 2 - IngredientAdjuster.java
* Description: 
* A cookie recipe calls for the following ingredients:
* 1.5 cups of sugar, 1 cup of butter, 2.75 cups of flour
* The recipe produces 48 cookies with these amounts of the 
* ingredients. Write a program that asks the user how many 
* cookies he or she wants to make, and then displays the # of 
* cups of each ingredient needed for the specified # of cookies.
*/

public class IngredientAdjuster
{
	public static void main(String[] args)
	{
		//create scanner object to to later take in input
		Scanner scan = new Scanner(System.in);
		
		//instantiate and initialize the given variables
		double cupsOfSugar= 1.5;
		double cupsOfButter= 1;
		double cupsOfFlour= 2.75;
		double numCookiesProduced_GivenIngredients=48;
		
		//use scanner object to take in input
		System.out.print("Please enter the number of cookies you want to make: ");
		double numCookies_UserWantsToMake = scan.nextDouble();
		
		
		//calculations
		double numCupsOfSugar_SpecifiedNumCookies = (cupsOfSugar/
				numCookiesProduced_GivenIngredients) * numCookies_UserWantsToMake ;
		
		double numCupsOfButter_SpecifiedNumCookies = (cupsOfButter/
				numCookiesProduced_GivenIngredients) * numCookies_UserWantsToMake ;
		
		double numCupsOfFlour_SpecifiedNumCookies = (cupsOfFlour/
				numCookiesProduced_GivenIngredients) * numCookies_UserWantsToMake ;
				
	
		
		//display
		System.out.println("\nNumber of cups of each ingredient" + 
		" needed for the specified number of cookies: \n\n" +  
				numCupsOfSugar_SpecifiedNumCookies + 
				" cups of sugar \n" + numCupsOfButter_SpecifiedNumCookies +
				" cups of butter \n" + numCupsOfFlour_SpecifiedNumCookies +
				" cups of flour");
		
	}
}
