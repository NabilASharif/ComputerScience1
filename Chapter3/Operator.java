import java.util.Scanner;
/**
 * Nabil Sharif
 * Introduction to Computer Science
 *
 * Chapter 3 - Operator.java
 *
 * Description:
 * In the following program, rewrite the 
 * if-else statement as a statement that use
 *  the conditional operator.
 *
 *
 *
 */

public class Operator 
{ 
	public static void main(String[] args) 
	{ 
		int temp; 
		float population, base; 
		
		Scanner keyboard = new Scanner(System.in); 
		
		System.out.println ("Enter values for temp and base"); 
		temp = keyboard.nextInt(); 
		base = keyboard.nextFloat(); 
		
		// Part to re-write using the conditional op
		if (temp > 45) 
			population = base * 10; 
		else 
			population = base * 2;
		
		// Rewriten part using conditional op
		population = temp > 45 ? base * 10 : base * 2;
	
		System.out.println ("The value of population is " + population); 
	}
}