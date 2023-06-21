import java.util.Scanner;

/**
	This program uses the var keyword to declare
	its Scanner variable.
*/

public class VarScanner
{
	public static void main(String[] args)
	{
		String name;
		
		// Create a Scanner object to read input
		var keyboard = new Scanner(System.in);
		
		// Get the user's name.
		System.out.print("Enter your name: ");
		name = keyboard.nextLine();

		// Greet the user
		System.out.println("Hello " + name);
		
	}
}