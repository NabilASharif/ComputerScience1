/*
Nabil Sharif
Introduction to Computer Science
Chapter 2 - StringLength.java
Description: This program demonstrates the 
String class's Length method.
*/

public class StringLength {
	public static void main(String[] args)
	{
		String name ="Herman";
		int stringSize;
		
		stringSize = name.length();
		System.out.println(name + " has " + stringSize + 
				" characters.");
	}

}
