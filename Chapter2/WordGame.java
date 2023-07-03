import java.util.Scanner;

/*
* Nabil Sharif
* Introduction to Computer Science
* Chapter 2 - WordGame.java
* Description: 
* Write a program that plays a word game with the user. 
* The program should ask the user to enter the following:
* His or her name, His or her age, The name of a city, 
* The name of a college, A profession, A type of animal, A pet’s name 
* After the user has entered these items, the program should display the 
* following story, inserting the user’s input into the appropriate locations:
*/

public class WordGame
{
	public static void main(String[] args)
	{
		//create scanner object to take user input
		Scanner scan = new Scanner(System.in);
		
		//ask user for the following input
		
		System.out.println("Enter your name: ");
		String person_Name = scan.nextLine();
		
		System.out.println("Enter your age: ");
		int age  = scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("Enter the name of your city: ");
		String name_Of_City = scan.nextLine();
		
		System.out.println("Enter the name of your college: ");
		String name_Of_College = scan.nextLine();
		
		System.out.println("Enter your profession: ");
		String profession = scan.nextLine();
		
		System.out.println("Enter what type of animal your pet is: ");
		String type_Of_Animal = scan.nextLine();
		
		System.out.println("Enter your pet's name: ");
		String pets_Name = scan.nextLine();
		
		System.out.println("\nThere once was a person named " + person_Name +
				" who lived in " + name_Of_City + ". At the age of " + age +
				", \n " + person_Name + " went to college at " + name_Of_College + 
				". " + person_Name + " graduated and went to work as a \n " +
				profession + ". Then, " + person_Name + " adopted a(n) " + 
				type_Of_Animal + " named " + pets_Name + ". They both lived \nhappily"
						+ " ever after!");	
	}
}