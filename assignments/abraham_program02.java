//Prologue Section

/**********************************************************************
 *Program Name:   CSC 111 Lab 06
 *Author:   Naif Abraham III
 *Date:     Oct. 12, 2015
 *Course/Section:  CSC 111-003W
 *Program Description:  This program prompt the user to enter a value in 
 *                      inches, which he/she would like the program to  
 *                      then convert to centimeters. 
 *
 *---------------------------------------------------------------------
 *                          Initial Algorithm:
 * 1. Prompt user with instructions.
 * 2. Get lower of two numbers for conversion from user.
 * 3. Get second of two numbers for conversion from user.
 * 4. Convert inch values to centimeters.
 * 5. Display conversions.
 *
 *---------------------------------------------------------------------
 *                             Input Data:
 * 1. The user will input the lower of two numbers that will be converted.
 * 2. The user will input the higher of two numbers to be converted.
 * 3. The program will request input about rerunning the conversion process.
 *
 *---------------------------------------------------------------------
 *                             Output Data:
 * 1. The program will display instructions to guide user through steps.
 * 2. The program will display the converted values.
 * 3. The program will display prompt to allow user to rerun program.
 *
 *---------------------------------------------------------------------
 *                               Formulas:
 * 1.    1 inch = 2.54 centimeters
 *          cm = (inch * CONVERT), where CONVERT is a constant value = 2.54
 *
 *---------------------------------------------------------------------
 *                         Refined Algorithm:
 * 1. Prompt the user with instructions. 
 * 2. Get the lower of the two numbers for conversion.
 * 3. Error check that user-entry is valid (>=0).
 * 4. Get the second number from the user.
 * 5. Error check the entry: >=0 && >= (first entry + 6)
 * 6. Establish a table outline to receive input for final display of con-
 *    versions.
 * 7. Convert the values from inches to centimeters, using a For Loop that
 *    will fall out of the loop when the the final value is >= (intitial value + 6).
 * 8. Display each conversion through each iteration through the previously
 *    defined For Loop.
 * 9. Prompt the user with a Y/N question to see if the user would like 
 *    to run the program again.
 * 10.If the user enters "Y" repeat steps 1 through 9.
 * End Program
 *    
 *---------------------------------------------------------------------
 *BEGIN Program abraham_program02 – CSC 111 Program abraham_program02
 *   
 *********************************************************************/
 
//Pre-Processor Declaration Section

import java.util.Scanner;
import java.util.*;
import java.text.DecimalFormat;

public class abraham_program02
{  //Begin Class

	public static void main(String[] args) 
	{  //Begin Main Method

		//Declare (and Initialize) Variables
		double inch, cm, inchLow = -1, inchHigh = 0;
		final double CONVERT = 2.54;
		String response;

	   //Initialize DecimalFormat into decimal format for appropriate output format.
	   DecimalFormat decimal = new DecimalFormat("#,###.##");

		//Initialize Scanner to receive two inputs
		Scanner lowest = new Scanner(System.in);
      Scanner highest = new Scanner(System.in);
      Scanner input = new Scanner(System.in);

      //Begin Do Loop to allow user to rerun promgram
      do {
      
         //Begin While Loop to accept valid user values
         while(inchLow < 0) {
            //Prompt user for input
            System.out.print("This program will convert up to 36 inches into centimeters.  \n"
                              + "Please enter the lowest number of inches that you wish to calculate. ");
            inchLow = lowest.nextDouble();
            
            //Error check user input for valid number, greater than 0
            if(inchLow < 0) {
               System.out.println("Please enter a valid number of inches, greater than 0.");
               System.out.println();
            }  //End if(inchlow...Error Check
               
         }  //End while(inchLow...Valid entry ends loop
         
         //Prompt user with instruction for next entry
         System.out.println("Next you will be asked to enter a number between 6 and 36 inches larger than " + inchLow + ".");
         System.out.println();
         
         //Begin While Loop to accept valid, second user entry
         while(inchHigh < (inchLow + 6) || inchHigh > (inchLow + 36)) {
            //Prompt user for second input value (includes guide to valid numbers)
            System.out.print("Please enter a number at least 6 inches larger than " + inchLow + ", that is no more than 36 inches larger (" + (inchLow + 36) + "). ");
            inchHigh = highest.nextDouble();
            
            //Error check user input for valid number, greater than 0, greater than 5+ previous entry
            if(inchHigh < (inchLow + 6)) {
               System.out.println("Please enter a valid number, at least 6 inches greater than " + inchLow + ".");
               System.out.println();
            } else if(inchHigh > (inchLow + 36)) {
               System.out.println("Please enter a valid number that is less than " + inchLow + " + 36 inches.");
               System.out.println();
            }  //End if(inchHigh...Error Check
               
         }  //End while(inchHigh...Valid entry, meeting criteria, ends loop
         
         //Assign valid value to variable for entry into formula
         inch = inchLow;
         
         //Establish a table outline (that will be filled in by the following For Loop)
         System.out.println();
         System.out.println("\t\tConversion Chart \n"
                           + "\n"
                           + "\tInches\t\tCentimeters\n"
                           + "\t______\t\t___________\n");
                           
         //Begin For Loop to loop through formula and print the results
         for (inch = inchLow; inch <= inchHigh; inch = (inch + 6)) {
            cm = (inch * CONVERT);
            System.out.println("\t" + decimal.format(inch) + "\t\t" + decimal.format(cm));
         }  //End For Loop
         
         //Reinitialize variables to accept next input
         inchLow = -1;
         inchHigh = 0;
         System.out.println();
         
         //Prompt user to enter more numbers
         System.out.println("Would you like to convert more numbers? (Y/N)");
         response = input.nextLine();
         System.out.println();
      
      }
      while (response.equals("y") || response.equals("Y"));
      //End While Loop when user does not enter "y" to rerun program
      
	}	//End Main Method

}	//End Class