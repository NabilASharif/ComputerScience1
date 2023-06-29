import java.util.Scanner;

/*
* Nabil Sharif
* Introduction to Computer Science
* Chapter 2 - MaleAndFemalePercentages.java
* Description: 
* Write a program that asks the user for the number of 
* males and the number of females registered in a class. 
* The program should display the percentage of males and 
* females in the class.Hint: Suppose there are 8 males and 
* 12 females in a class. There are 20 students in the class.
* The percentage of males can be calculated as 
* 8÷20=0.4, or 40%. The percentage of females can 
* be calculated as 12÷20=0.6, or 60%.
*/

public class MaleAndFemalePercentages
{
	public static void main(String[] args)
	{
		//create scanner obj
		Scanner scan = new Scanner(System.in);
		
		//ask user to enter # male and female reg in a class
		System.out.println("Enter # of males registered"
				+ " in a class:");
		double numberOfMales = scan.nextDouble();
		
		System.out.println("Enter # of females registered"
				+ " in a class:");
		double numberOfFemales = scan.nextDouble();
		
		//calculate total, percentmale, and percentfemale.
		double total = numberOfMales+numberOfFemales;
		
		double percentOfMales=(numberOfMales/total)*100;
		double percentOfFemales=(numberOfFemales/total)*100;
		
		//display % male and % female
		System.out.println("male reg: " + percentOfMales + "%");
		System.out.println("female reg: " + percentOfFemales + "%");


	}
}
