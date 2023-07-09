import java.util.Scanner;

/*
* Nabil Sharif
* Introduction to Computer Science
* Chapter 3 - SquareArea.java
* Description: 
* Create a program which computes the square area given that  
* the length is 10 and the width is 5. The program should then 
* display the message "The area is {givenarea}" without brackets.
*/

public class SquareArea
{
	public static void main(String[]args)
	{
		//Create and initialize SquareArea variables
		double length, width, area;
		
		length = 10;
		width = 5;
		
		//Use the square area formula to compute the square area
		//Compute the product of length x width and store the result in area
		area = length * width;
			
		
		//Display the square area
		System.out.println("The square area is " + area);
	}
}