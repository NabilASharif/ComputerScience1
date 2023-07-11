import java.util.Scanner;

/**
 * Nabil Sharif
 *
 * Chapter 3 - Q3Dot3Q3.java
 *
 * Description:
 *
 * Online Book Merchants offers the following 
 * benefits to premium customers: 1 free book with 
 * every purchase of 5 or more books and offers 2 
 * free books with every purchase of 8 or more books. 
 * It offers the following benefits to regular 
 * customers:1 free book with every purchase of 7 or
 * more books, and offers 2 free books with every 
 * purchase of 12 or more books.Write a statement that 
 * assigns freeBooks the appropriate value based on the
 * values of the boolean variable isPremiumCustomer and
 * the int variable nbooksPurchased.
 *
 */

public class Q3Dot3Q1 
{
	public static void main(String[] args)
	{
		//declare and initialize given vars
		int freeBooks, nbooksPurchased=0;
		boolean isPremiumCustomer;
		
		//create scanner for keyboard input
		Scanner scan = new Scanner(System.in);
		
		//determine key information
		System.out.print("Premium"
				+ " customer? (True or False) ");
		isPremiumCustomer = scan.nextBoolean();
		
		System.out.print("What number"
				+ " of books did the user purchase? ");
		nbooksPurchased = scan.nextInt();
		
		if (isPremiumCustomer)
		{
			if (nbooksPurchased >=8)
			{
				freeBooks = 2;
				System.out.println("Customer earned "
						+ freeBooks + " free books.");
			} 
			else 
			{
				if (nbooksPurchased >=5)
				{
					freeBooks = 1;
					System.out.println("Customer earned "
							+ freeBooks + " free books.");
				}
				else
				{
					freeBooks = 0;
					System.out.println("Sorry, customer "
							+ " earned " + freeBooks 
							+ " free books.");
				}
			}
		} 
		else
		{
			if (nbooksPurchased >=12)
			{
				freeBooks = 2;
				System.out.println("You've earned "
						+ freeBooks + " free books.");
			} 
			else 
			{
				if (nbooksPurchased >=7)
				{
					freeBooks = 1;
					System.out.println("You've earned "
							+ freeBooks + " free books.");
				}
				else
				{
					freeBooks = 0;
					System.out.println("Sorry, you've "
							+ " earned " + freeBooks 
							+ " free books.");
				}
			}
		}
			
	}
}
