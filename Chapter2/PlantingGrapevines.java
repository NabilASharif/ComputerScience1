import java.util.Scanner;

/*
* Nabil Sharif
* Introduction to Computer Science
* Chapter 2 - PlantingGrapevines.java
* Description: 
* A vineyard owner is planting several new rows of grapevines and needs to
* know how many grapevines to plant in each row. She has determined that after 
* measuring the length of a future row, she can use the following formula to 
* calculate the number of vines that will fit in the row, along with the trellis 
* end-post assemblies that will need to be constructed at each end of the row:
* V = (R minus 2E)/S 
* 
* The terms in the formula are: 
* V is the number of grapevines that will fit in the row.
* R is the length of the row, in feet.
* E is the amount of space used by an end-post assembly.
* S is the space between vines, in feet.
* 
* Write a program that makes the calculation for the vineyard owner. 
* The program should ask the user to input the following:
* The length of the row, in feet
* The amount of space used by an end-post assembly, in feet
* The amount of space between the vines, in feet
* 
* Once the input data has been entered, the program should calculate and display 
* the number of grapevines that will fit in the row.
*/

public class PlantingGrapevines
{
	public static void main(String[] args)
	{
		// create vars for the grapevines formula
		// V = numberOfGrapevines_thatFitInTheRow
		// R = lengthOfTheRow_inFeet
		// E = amountofSpaceUsed_endPostAssembly
		// S = spaceBetweenVines_inFeet
		double numberOfGrapevines_thatFitInTheRow = 0;
		double lengthOfTheRow_inFeet = 0;
		double amountofSpaceUsed_endPostAssembly = 0;
		double spaceBetweenVines_inFeet = 0;
	
		
		//create scanner obj and use it to take in user input
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter R the length of the row" +
				" in feet:");
		lengthOfTheRow_inFeet = Scan.nextDouble();
		
		System.out.println("Enter E the amount of space used" +
				" by an end-post assembly:");
		amountofSpaceUsed_endPostAssembly = Scan.nextDouble();
		
		System.out.println("Enter S the space between vines" +
				" in feet:");
		spaceBetweenVines_inFeet = Scan.nextDouble();
		
		// Calculate and display the following:
		// V = numberOfGrapevines_thatFitInTheRow
		
		numberOfGrapevines_thatFitInTheRow = 
				(lengthOfTheRow_inFeet - 
						(2*amountofSpaceUsed_endPostAssembly))
				/spaceBetweenVines_inFeet;
		
		System.out.println("The number of grapevines" +
		" that will fit in the row is " + 
		numberOfGrapevines_thatFitInTheRow);
		
	}
}