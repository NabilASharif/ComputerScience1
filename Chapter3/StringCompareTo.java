/*
* Nabil Sharif
* Introduction to Computer Science
* Chapter 3 - SquareArea.java
* 
* Description: 
* This program compares two String object using the
* compareTo method.
* 
*/


public class StringCompareTo 
{
	public static void main(String[] args)
	{
		String name1 = "Mary",
				name2 = "Mark";
	
		// Compare "Mary" and "Mark"
		
		if (name1.compareTo(name2) < 0)
		{
			System.out.println(name1 + " is less "
					+ " than " + name2); 
		}
		else if (name1.compareTo(name2) == 0)
		{
			System.out.println(name1 + " is equal to "
					+ name2); 
		}
		else if (name1.compareTo(name2) > 0)
		{
			System.out.println(name1 + " is greater than "
					+ name2);
		}
		
	} // end main

} //end class
