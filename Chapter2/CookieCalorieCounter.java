import java.util.Scanner;

/*
Nabil Sharif
Introduction to Computer Science
Chapter 2 - CookieCalorieCounter.java
*/

public class CookieCalorieCounter
{
	public static void main(String [] args)
	{
		
		// define variables and initialize them
		
		final int COOKIES_PER_BAG=40;
		final int SERVINGS_PER_BAG=10;
		final int CALORIES_PER_SERVING=300;
		final int COOKIES_PER_SERVING=COOKIES_PER_BAG/SERVINGS_PER_BAG;
		final int CALORIES_PER_COOKIE=CALORIES_PER_SERVING/COOKIES_PER_SERVING;

		// Create a scanner and store it in memory
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter number of cookies eaten:");
		int COOKIES_EATEN = keyboard.nextInt();
		int TOTAL_CALORIES_CONSUMED = COOKIES_EATEN*CALORIES_PER_COOKIE;
		
		System.out.println("Your Calorie intake was: " +
		TOTAL_CALORIES_CONSUMED + " calories.");
	}
	
	public int classic = 40;
}