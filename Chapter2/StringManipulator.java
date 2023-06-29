import java.util.Scanner;

/*
* Nabil Sharif
* Introduction to Computer Science
* Chapter 2 - StringManipulator.java
* Description: 
* Write a program that asks the user to enter the 
* name of his or her favorite city. Use a String variable to store the input.
* The program should display the following:
* • The number of characters in the city name
* • The name of the city in all uppercase letters
* • The name of the city in all lowercase letters
* • The first character in the name of the city
*/

public class StringManipulator
{
	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter your favorite city: ");	
	String favoriteCity = scan.nextLine();
	
	double numCharFavoriteCity = favoriteCity.length();
	String uppecaseLetters = favoriteCity.toUpperCase();
	String lowercaseLetters = favoriteCity.toLowerCase();
	char firstCharCityName = favoriteCity.charAt(0);
	
	System.out.println("\nThe number of characters in the city name: " + numCharFavoriteCity);
	System.out.println("\nThe name of the city in all uppercase letters " + uppecaseLetters);
	System.out.println("\nThe name of the city in all lowercase letters " + lowercaseLetters);
	System.out.println("\nThe first character in the name of the city " + firstCharCityName);

	}
}
