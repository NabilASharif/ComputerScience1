
/**
 * Nabil Sharif
 * Introduction to Computer Science

 * Chapter 3 - ModifyIf.java
 *
 * Description:
 *
 * Modify the if statement in the program below
 * to perform a case-insensitive comparison. 
 *
 */

public class ModifyIf 
{    
    public static void main(String[] args)
    {   
    	// given variables declarations and initializations
        String partNumber;
        boolean available = false;

        // given assignment for var partNumber
        partNumber = "Bq789W4";
        
        // given compare, assign, and display statements
        // changed method from equals to equalsIgnoreCase
        if (partNumber.equalsIgnoreCase("BQ789W4"))
            available = true;
        System.out.print("available = " + available);
        
    } //end main
} // end class