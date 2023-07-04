/*
* Nabil Sharif
* Introduction to Computer Science
* Chapter 2 - StockTransactionProgram.java
* Description: 
* Last month Joe purchased some stock in Acme Software, Inc. 
* 
* Here are the details of the purchase:
* • The number of shares that Joe purchased was 1,000.
* • When Joe purchased the stock, he paid $32.87 per share.
* • Joe paid his stockbroker a commission that amounted to 2% of 
* the amount he paid for the stock. Two weeks later Joe sold the stock. 
* 
* Here are the details of the sale:
* 
* • The number of shares that Joe sold was 1,000.
* • He sold the stock for $33.92 per share.
* • He paid his stockbroker another commission that amounted to 2% of the amount he
* received for the stock.
* 
* Write a program that displays the following information:
* • The amount of money Joe paid for the stock.
* • The amount of commission Joe paid his broker when he bought the stock.
* • The amount that Joe sold the stock for.
* • The amount of commission Joe paid his broker when he sold the stock.
* • Display the amount of profit that Joe made after selling his stock and paying
* the two commissions to his broker. (If the amount of profit that your program 
* displays is a negative number, then Joe lost money on the transaction.)
*/

public class StockTransactionProgram
{
	public static void main(String[] args)
	{
		//initialize and instantiate vars
		double sharesPurchased = 1000;
		double paidPricePerShare = 32.87;
		double sharesSold = 1000;
		double soldPricePerShare = 33.92;
		
		//calculations
		double amountPaidForStock = sharesPurchased*paidPricePerShare;
		double paidStockCommission = 0.02*(amountPaidForStock);
		double amountSoldStockFor = sharesSold*soldPricePerShare;
		double soldStockCommission = 0.02*(amountSoldStockFor);
		double profit = amountSoldStockFor - (paidStockCommission+soldStockCommission);


		
		
		System.out.println("The amount of money Joe Paid for the "
				+ "stock is $" + amountPaidForStock);
		
		System.out.println("The amount of commission Joe Paid his broker "
				+ "when he bought the stock is $" + paidStockCommission);
		
		System.out.println("The amount that Joe sold the stock for "
				+ "is $" + amountSoldStockFor);
		
		System.out.println("The amount of commission Joe paid his broker when "
				+ "he sold the stock is $" + soldStockCommission);
		
		System.out.println("The amount of profit that Joe made after selling his "
				+ "stock and paying the two commissions to his broker. $" 
				+ profit);
	}
}