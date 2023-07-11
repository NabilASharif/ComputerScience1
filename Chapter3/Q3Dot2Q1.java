/**
 * @author Nabil
 * 
 * Chapter 3 -  Q3Dot2Q1.java
 * 
 * Description:
 * 
 * Write an if/else statement that does the following: 
 * If the age variable is greater than or equal to 65, 
 * add 1 to the variable seniorCitizens. Otherwise, add 
 * 1 to the variable nonSeniors. [No display to output req]
 *
 *
 */

public class Q3Dot2Q1
{
	public static void main(String[] args)
	{
		int age = 0, seniorCitizens = 0, nonSeniors=0;
		
		if (age >= 65)
			seniorCitizens +=1;
		else
			nonSeniors +=1;
	}
}
