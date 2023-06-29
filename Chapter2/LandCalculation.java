/*
Nabil Sharif
Introduction to Computer Science
Chapter 2 - LandCalculation.java
Description: 
*
One acre of land is equivalent to 43,560 square feet.
*
Write a program that calculates the number of acres in a 
*
tract of land with 389,767 square feet. Hint: Divide the 
*
size of the tract of land by the size of an 
*
acre to get the number of acres. 
*
*/

public class LandCalculation
{
	public static void main(String[] args)
	{
		double squareFeet = 389767;
		double numAcresInTractOfLand = squareFeet/43560;
		
		System.out.println("Tract of land: " + squareFeet);
		
		System.out.println("Number of acres: " +
		numAcresInTractOfLand);	
	}
}
