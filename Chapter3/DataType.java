
/**
 * Nabil Sharif
 * Introduction to Computer Science
 * Chapter 3 - DataType.java
 * Description:
 * Rewrite the System.out.printf statement 
 * to produce the output: 12345.68
 */

public class DataType 
{
	public static void main(String[] args)
	{
		double value = 12345.678;
		
		// Rewrite the following commented out statement
		// System.out.printf("%.3d", value);
		
		// Re-written version of the above statement
		System.out.printf("%.3f", value);
	}

}
