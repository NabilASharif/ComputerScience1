/**
 * @author Nabil
 * 
 * Chapter 3 -  Q3Dot2Q2.java
 * 
 * Description:
 * 
 * Write an if/else statement that compares the
 * variables soldYesterday and soldToday. If soldYesterday
 * is greater than soldToday, assign -1 to the variable 
 * salesTrend. Otherwise, assign 1 to the variable salesTrend.
 * [Please note that there is no display to output required]
 */

public class Q3Dot2Q2
{
	public static void main(String[] args)
	{
		int soldYesterday = 0, soldToday = 0, salesTrend=0;
		
		if (soldYesterday > soldToday)
			salesTrend = -1;
		else
			salesTrend = 1;
	}
}
