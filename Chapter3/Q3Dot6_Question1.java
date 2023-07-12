
/**
 * Nabil Sharif
 * Introduction to Computer Science
 * Chapter 3 - Q3Dot6_Question1.java
 * 
 * Description:
 * 
 * Assume the variable s is a String and index is
 * an int. Write an if-else statement that assigns
 * 100 to index if the value of s would come between
 * "mortgage" and "mortuary" in the dictionary. 
 * Otherwise, assign 0 to index.
 *
 */

public class Q3Dot6_Question1 

{

	public static void main(String[] args) 
	{
		String s = "";
		int index;
		
		if (s.compareTo("mortgage") > 0 && 
				s.compareTo("mortuary") <0)
		{
			index = 100;
			
		}
		else
		{
			index =0;
		}
		
		
		
		
	} // end main

} // end class
