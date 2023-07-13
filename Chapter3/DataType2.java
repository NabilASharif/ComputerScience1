
/**
 * Nabil Sharif
 * Introduction to Computer Science
 * Chapter 3 - DataType2.java
 */

public class DataType2
{
	public static void main(String[] args)
	{
		int hours=40, dogs=2, cats=4;
		
		double sales=12345.67, temp = 78.42819, 
				temp1=72.5,temp2=83.7, value1=123.45678, 
				value2=123.45678, value3=123.45678;
		
		System.out.printf("I worked %d hours this " + 
		"week.\n", hours);
		
		System.out.printf("We have %d dogs and %d" + 
		" cats.\n", dogs, cats);
		
		System.out.printf("Our sales are %f for the " +
		"day.\n", sales);
		
		System.out.printf("The temperatures are %f" +
		" and %f degrees.\n", temp1, temp2);
		
		System.out.printf("The temperature is %.2f" +
		" degrees.\n", temp);
		
		System.out.printf("The temperature is %.1f" +
				" degrees.\n", temp);
		
		System.out.printf("%.1f %.2f %.3f", value1, 
				value2, value3);
	}

}
