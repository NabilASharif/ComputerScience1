import java.util.Scanner; // Needed for the 

/**
	This program correctly reads numeric & string input
*/

public class CorrectedInputProblem
{
	public static void main(String[] args)
	{
		String name;   // To hold the user's name
		int age;       // To hold the user's age
		double income;  // To hold the user's income
		
		// Create a scanner object in memory
		Scanner keyboard = new Scanner(System.in);
		
		// Get the user's age.
		System.out.print("What is your age? ");
		age = keyboard.nextInt();
		
		// Get the user's annual income
		System.out.print("What is your annual income? ");
		income = keyboard.nextDouble();
		
		// Consume the remaining newline.
		keyboard.nextLine();
		
		// Get the user's name
		System.out.print("What is your name? ");
		name = keyboard.nextLine();
		
		// Display the result
		System.out.println("Hello " + name + ". Your age is " +
		age + " and your income is " + income);
		
		
		
		
	}
}