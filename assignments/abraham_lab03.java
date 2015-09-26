/**********************************************************************
 *Program Name:   CSC 111 Lab03
 *Author:   Naif Z. Abraham III
 *Date:     Sept 14, 2015
 *Course/Section:  CSC 111-001 (003W)
 *
 *This program is designed to showcase a series of Strings and formatting
 *methods and conversions. 
 *
 *Initial Algorithm:
 *
 *BEGIN Lab03 – CSC 111
 *   Get user-entered information
 *   Make appropriate conversions
 *   Display converted information
 *END Lab03 – CSC 111
 *********************************************************************/

//Pre-Processor Declarations
import java.util.*;
import java.text.NumberFormat;

public class abraham_lab03
{

   public static void main (String[] args) 
   {
   
   	//Declaration of Variables
      String firstname, lastname, firstfirst, lastfirst;
      double sleep, hourly, sleeprate, hourlyrate;
      final int day = 24;
      
      NumberFormat percent = NumberFormat.getPercentInstance();	//Initialize the percent formatter for later conversion.
      NumberFormat currency = NumberFormat.getCurrencyInstance();	//Initialize the currency formatter for later conversion.
   	
      Scanner input = new Scanner(System.in);                     //Initialize the Scanner class to accept user input.
   	
      System.out.println("Welcome!" );								
      System.out.print("What is your first name?: ");			      //Display prompt to get first name.
      firstname = input.nextLine();	                              //Scan and store first name in appropriate variable.
   
      System.out.print("Please enter your last name: ");		      //Display prompt to get last name.
      lastname = input.nextLine();						               //Scan and store last name in appropriate variable.
         
   	//Get user-entered amount of sleep.
      System.out.print("How many hours of sleep do you get in an average 24 hour period?  (Please include naps, if applicable.): ");
      sleep = input.nextDouble();									   
   	
      //Get user-entered amount of money/hour.
      System.out.print("How many American dollars would you like to make per hour of working?: ");
      hourly = input.nextDouble();								
   
      //Separate the first letter from both strings.
      firstfirst = firstname.substring(0,1);
      lastfirst = lastname.substring(0,1);
   
   	//Convert the separated letter(s) to lower case.
      firstfirst = firstfirst.toLowerCase();
      lastfirst = lastfirst.toLowerCase();
   
      //Equation to determine amount of time user sleeps.
      sleeprate = (sleep / day);									                    
      
      //Equation to determine week's pay at full time.
      hourlyrate = hourly * 40;									         
   
   	//Print & display the culmination of the conversions in one concatenated string.
      System.out.println(firstfirst + " " + lastfirst + " sleeps " + percent.format(sleeprate) + " of each 24 hour period and would like to earn " + currency.format(hourlyrate) + " per week.");
   
   //End Main
   }
	
//End Class
}
