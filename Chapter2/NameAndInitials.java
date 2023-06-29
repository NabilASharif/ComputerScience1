/*
Nabil Sharif
Introduction to Computer Science
Chapter 2 -  NameAndInitials.java
Description: 

Write a program that has the following: 
*
*String variables: firstName, middleName, and lastName.
*Initialize these with your first, middle,and last names.
*
*The program should also have the following char variables:
**firstInitial, middleInitial, and lastInitial.
*
*Store first, middle, and last initials in these variables. 
*
*The program should display their contents on the screen.
*/

public class NameAndInitials
{
	public static void main(String[] args)
	{
		String firstName = "John";
		String middleName = "Anderson";
		String lastName = "Doe";

		char firstInitial = firstName.charAt(0);
		char middleInitial = middleName.charAt(0);
		char lastInitial = lastName.charAt(0);

		System.out.println("First name: " + firstName);
		System.out.println("First initial: " + firstInitial);
		System.out.println("Middle name: " + middleName);
		System.out.println("Middle initial: " + middleInitial);
		System.out.println("Last name: " + lastName);
		System.out.println("Last initial: " + lastInitial);
		
		}
}
