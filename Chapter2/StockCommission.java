/*
* Nabil Sharif
* Introduction to Computer Science
* Chapter 2 - StockCommission.java
* Description: 
* Kathryn bought 600 shares of stock at a price of 
* $21.77 per share. She must pay her stock-broker a 
* 2 percent commission for the transaction. Write a program 
* that calculates and displays the following:
* The amount paid for the stock alone (without the commission)
* The amount of the commission
* The total amount paid (for the stock plus the commission)
*/

public class StockCommission
{
	public static void main(String[] args)
	{
		//instantiate and initialize the given variables
		double sharesOfStock = 600;
		double stockPricePerShare = 21.77;
		double percentStockCommission = 0.02;
		
		//calculations
		double amountPaidForStockAlone = 
				sharesOfStock*stockPricePerShare;
		double amountOfCommission = 
				percentStockCommission * 
				amountPaidForStockAlone;
		double totalAmountPaid =
				amountPaidForStockAlone + amountOfCommission;
		
		//display
		System.out.println("Amount paid for the stock alone:"
				+ " $" + amountPaidForStockAlone);
		
		System.out.println("Amount of commission:"
				+ " $" + amountOfCommission);
		
		System.out.println("Total amount paid:"
				+ " $" + totalAmountPaid);
		
	}
}
