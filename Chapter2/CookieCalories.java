import java.util.Scanner;

/*
Nabil Sharif
Introduction to Computer Science
Chapter 2 - SalesTax.java
Description: 
*
* A bag of cookies holds 40 cookies. 
* The calorie information on the bag claims that 
* there are 10 servings in the bag and that a serving 
* equals 300 calories. Write a program that lets the user 
* enter the number of cookies he or she actually ate and then
* reports the number of total calories consumed.
* 
*/

public class CookieCalories
{
	public static void main(String[] args)
	{
		//Create and instantiate the given variables
		double bagOfCookies = 40;
		double servingsPerBag = 10;
		double servingSizeInCal = 300;
		
		//Compute cookies per serving and calorie per serving
		double cookiesPerServing=bagOfCookies/servingsPerBag ;
		double calPerCookie=servingSizeInCal/cookiesPerServing;
		
		//Use scanner to request # Of cookies eaten & store it
		Scanner keyboard = new Scanner(System.in);
		
		//Request user to enter the number of cookies eaten
		System.out.print("Enter number of cookies eaten: ");
		double numberOfCookies = keyboard.nextDouble();
		
		
		//Compute and store the total # of calories consumed
		double totalCalConsumed = numberOfCookies*calPerCookie;
		
		//Display the number of total calories consumed.
		System.out.println("You have consumed " 
		+ totalCalConsumed + " calories.");
		
	}
}
