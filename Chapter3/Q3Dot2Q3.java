import java.util.Scanner;

/**
 * @author Nabil
 * 
 * Chapter 3 -  Q3Dot2Q3.java
 * 
 * Description:
 * 
 * note: in mathematics, division by zero is undefined. 
 * So, in Java, division by zero is always an error.
 * Assume the following declarations exist:
 * 
 * int callsReceived;
 * int operatorsOnCall; 
 * Scanner stdin = new Scanner(System.in); 
 * 
 * Given these declarations, write code that does the following:
 * 
 * Use the stdin object to read a value into the callsReceived 
 * variable.Use the stdin object to read a value into the 
 * operatorsOnCall variable. If the value read into 
 * operatorsOnCall is greater than 0, display the number of 
 * calls received per operator (integer division will do). 
 * Otherwise, display the message "INVALID".
 */

public class Q3Dot2Q3
{
	public static void main(String[] args)
	{
		//declared and initialized vars
		int callsReceived = 0, operatorsOnCall = 0; 
		Scanner stdin = new Scanner (System.in);
		
		//read in callsReceived
		System.out.print("Enter the calls received: ");
		callsReceived = stdin.nextInt();
		
    	//read in operatosrOnCall
		System.out.println("Enter the operators on call: ");
		operatorsOnCall = stdin.nextInt();
		
		//if operatorsOnCall exceeds 0, display int division for 
		//callsReceived per operator. Otherwise display "INVALID".
		if (operatorsOnCall > 0)
			System.out.println("The number of calls " 
					+ "received per operator is "
					+ (callsReceived/operatorsOnCall));
		else
			System.out.println("INVALID"); 
		}
}
