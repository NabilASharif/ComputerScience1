
/**
 * Nabil Sharif
 *
 * Chapter 3 - Quiz3Dot4_Question1.java
 *
 * Description:
 *
 * Assume the following int variables have been 
 * declared: score1, score2, player1Wins, player1Losses, 
 * player2Wins, player2Losses, and tieCount.Given these
 * variables, write an if/else if statement does the 
 * following:When score1 is greater than score2, the 
 * message "player1 wins" is displayed. Also, player1Wins
 * is incremented, and player2Losses is incremented.
 * When score1 is less than score2, the message 
 * "player2 wins" is displayed. Also, player2Wins is 
 * incremented, and player1Losses is incremented.
 * In the event of a tie, the message "tie" is displayed
 * and the variable tieCount is incremented.
 *
 */

public class Q3Dot4_Question1 
{
	public static void main(String[] args)
	{
		//Assume these int vars have been declared
		int score1 =1, score2=2, player1Wins=0, 
				player1Losses=0, player2Wins =0, 
				player2Losses=0, tieCount=0;
		
		// Determine & display the winner when score1>score2.
		// Then increment player1Wins and player2Losses.
		if (score1>score2)
		{
			System.out.println(player1Wins + " wins");
			player1Wins++;
			player2Losses++;
		} 
		
		// Determine & display winner when score1<score2. 
		// Then increment player2Wins and player1Losses.
		else if (score1<score2)
		{
			System.out.print(player2Wins + " wins");
			player2Wins++;
			player1Losses++;
		}
		// Determine & display whether there's a tie. 
		// Then increment tieCount
		else if (score1==score2)
		{
			System.out.println("tie");
			tieCount++;
		}
		
	} //end main

} //end class
