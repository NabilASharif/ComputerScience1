import java.util.Scanner;
/**
 * Nabil Sharif
 * Introduction to Computer Science
 *
 * Chapter 3 - Q3Dot8_Question1.java
 *
 * Description:
 * Assume that x, y, and z are int variables. 
 * Write a statement using the conditional operator 
 * (? :) that compares the values of the variables x 
 * and y. The value of the larger of the two variables
 * should be assigned to z.
 *
 *
 */

public class Q3Dot8_Question1 
{ 
	public static void main(String[] args) 
	{ 
		// assume that x, y, and z are int vars
		int x = 2, y = 1, z = 0;
		
		// answer
		z =((x > y) ? x : y);
	}
}