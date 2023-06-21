import java.util.Scanner;

public class Oktest123
{
	public static void main(String[] args)
	{
		String input; // To hold a line of input
		char answer; // To hold a single character
		
		// Create a scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
		// Ask user a question
		System.out.println("Are you having fun? "
				+ "(Y=yes, N=no)");
		input = keyboard.nextLine(); // Get string input
		answer = input.charAt(0); // Get 1st char in input
		
		System.out.println(input);
		System.out.println(answer);

		
	
	}
}