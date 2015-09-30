//Prologue Section
/**********************************************************************
 *Program Name:   CSC 111 Lab 05
 *Author:   Naif Abraham III
 *Date:     Sept. 29, 2015
 *Course/Section:  CSC 111-003W
 *Program Description:  This program will accept a numeric value from the user
 *                      and will calculate the cost of a phone call that is the
 *                      number of minutes that the user entered.
 *---------------------------------------------------------------------
 *                          Initial Algorithm:
 * 1. Get the number entered by the user.
 * 2. Convert the amount of time to the appropriate cost.
 * 3. Display the cost to the user.
 *
 *---------------------------------------------------------------------
 *                             Input Data:
 * 1. int minutes 	//Variable that will contain user-entered # 
 *
 *---------------------------------------------------------------------
 *                             Output Data:
 * 1. double total	//Variable that will hold the calculated information
 * 					   //to be displayed to the user.
 *
 *---------------------------------------------------------------------
 *                               Formulas:
 * 1. If the number entered is <= 10, then the formula is:
 *		   total = cost 	
 *		//Where cost is simply equal to .99.
 * 2. If the number entered is >10, then the formula is as follows:
 *		   total = cost + (charge * (minutes - 10))	
 *		//Where cost equals .99; charge (equal to .10) is multiplied with
 *		//the total number of minutes (minues 10, to not charge the user)
 *		//twice for the initial 10 minutes.
 *
 *---------------------------------------------------------------------
 *                         Refined Algorithm:
 * 1.    Get value from the user.
 *    1a.   If the value is zero or less, then prompt user with error message.
 * 2.    If the value is <= 10, then
 *	  2a.	Use the formula [1] (above) (= $0.99)
 * 3.    If the value is >10, then
 *	  3a.	Use the formula [2] (above) where .10 is added to every minute from
 *			>=11 (up to int max value); sum will be .99 + .10/minute 11+
 * 4.    Display the results to the user.
 * 5     END Program.  
 *
 *---------------------------------------------------------------------
 *BEGIN Program abraham_lab05 – CSC 111 Program abraham_lab05
 *   
 *********************************************************************/
 
//Pre-Processor Declaration Section

import java.util.Scanner;
import java.text.NumberFormat;

public class abraham_lab05 {		//Begin Class 

	public static void main(String[] args) {		//Begin Main Method

		//Declare (and initialize) Variables
		int minutes;
		double total = 0;
		final double cost = .99, charge = .10;
		//Initialize Scanner for accessing input.
		Scanner input = new Scanner(System.in);
      //Initialize NumberFormat into currency format for appropriate output format.
      NumberFormat currency = NumberFormat.getCurrencyInstance();

      //Prompt user for numeric value.
		System.out.println("Please enter the number of minutes of the phone call.");
		
      //Assign input into variable
		minutes = input.nextInt();

		//If value is less than or equal to 10 minutes, then the charge is .99
		if (minutes <= 0) {
			System.out.println("Please enter a valid number of minutes (not 0 or less).");
		//If value is greater than 10 minutes, then employ formula [2]
		} else if (minutes <=10) {
			total = cost;
         //Format output into appropriate currency format.
         System.out.println("The total cost of the phone call is " + currency.format(total));

		} else {
			total = cost + (charge * (minutes - 10)); 
         //Format output into appropriate currency format.
         System.out.println("The total cost of the phone call is " + currency.format(total));
		}

	}		//End Main Method
}		//End Class