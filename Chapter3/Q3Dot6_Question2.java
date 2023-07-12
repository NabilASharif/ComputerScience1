
/**
 * Nabil Sharif
 * Introduction to Computer Science
 * Chapter 3 - Q3Dot6_Question2.java
 * Description:
 * 
 * Assume the variable s is a String and index
 * is an int. Write an if-else statement that assigns
 * 100 to index if the value of s would come between 
 * "mortgage" and "mortuary" in the dictionary. 
 * Otherwise, assign 0 to index.
 *
 */

public class Q3Dot6_Question2 

{

	public static void main(String[] args) 
	{
		// assume these string vars have been declared
		String name1, name2, first;
		
		// assume that name1 and name2 have 
		// already been assigned values
		name1 = "John";
		name2 = "Jordan";
		
		// compare name1 and name2 and assign the noe
		// that is alphabetically greater to the var 1st
		// if the two strings are equal, assign name1 to 1st
		if (name1.compareTo(name2) >0)
		{
			first = name1;	
		} 
		else if (name1.compareTo(name2) <0)
		{
			first = name2;
		}
		else if (name1.compareTo(name2) ==0)
		{
			first = name1;
		}
		
		// alternatively the assignment could have 
		first = name1;
		
		if (name2.compareTo(first) > 0)
		{
			first = name2;
			
		}
	} // end main

} // end class
