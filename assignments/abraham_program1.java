//Prologue Section
/**********************************************************************
 *Program Name:   CSC 111 Program 01
 *Author:   Naif Abraham III
 *Date:     Sept. 29, 2015
 *Course/Section:  CSC 111-003W
 *Program Description:  This program will accept 3 values from the user in
 *                      the forms of integers, and it will then sort them in
 *                      ascending order.
 *---------------------------------------------------------------------
 *                          Initial Algorithm:
 * 1. Get 3 numeric values from users.
 * 2. Compare the values to one another.
 * 3. Sort and display the values in ascending order.
 *
 *---------------------------------------------------------------------
 *                             Input Data:
 * 1. input1, input2, input3, response (as String)
 *
 *---------------------------------------------------------------------
 *                             Output Data:
 * 1. Strings prompting the user to enter the numbers
 * 2. stringAsc, stringDsc (String)
 * 2a.   These strings will be concatenated using the integer values that
 *       the user entered; stringAsc will be in ascending order.
 *
 *---------------------------------------------------------------------
 *                               Formulas:
 * 1. Six possible outcomes exist from greater-than/less-than comparisons
 *    of 3 numbers:
 *          1. a < b < c
 *          2. a < c < b
 *          3. b < a < c
 *          4. b < c < a
 *          5. c < a < b
 *          6. c < b < a
 *
 *    if (a < b)
 *        if (a < c)
 *           if (b < c)
 *                             then (a < b < c)    [1]
 *   
 *           else if (c < b)
 *                             then (a < c < b)    [2]
 * 
 *           else if (c < a)
 *                             then (c < a < b)    [5]
 *
 *    else if (b < c)
 *        if (b < a)
 *           if (c < a)
 *                             then (b < c < a)    [4]
 *
 *           else if (a < c)
 *                             then (b < a < c)    [3]
 *
 *    else if (c < b)
 *        if (c < a)
 *           if (b < a)
 *                             then (c < b < a)    [6]
 *
 * Where this series of greater-than, less-than tests will efficiently
 * break down the 6 possible outcomes by looking at pairs and comparing.
 *
 *---------------------------------------------------------------------
 *                         Refined Algorithm:
 * 1.    Get 3 values from the user.
 *    1a.   If the values are blank, then prompt user with error message.
 *    1b.   If two or more of the values are the same, then prompt the
 *          user with an error message.
 * 2.    Use the formula (above) to test the valid values using extensive 
 *       if/else statements to determine the greatest, middle, and lowest     
 *       values.  No two values will be the same; negative numbers are
 *       valid (within the limit of the data type).
 * 3.    Assign the min, mid, max variables the appropriate values based
 *       on the results of Step 2.
 * 4.    Create a string in ascending order of min < mid < max.
 * 5.    Display the results to the user.
 *                            Optional
 * 6.    Prompt the user to sort the values in descending order.
 * 7.    Display results if the user wishes to display this.
 * 8     END Program.  
 *
 *---------------------------------------------------------------------
 *BEGIN Program abraham_program01 – CSC 111 Program abraham_program01
 *   Display menu of excitement levels
 *   Input your level of excitement
 *   Clear output screen
 *   Display how excited I am about this class
 *END Lab01 – CSC 111 Program Lab01
 *********************************************************************/
 
//Pre-Processor Declaration Section

import java.text.NumberFormat;
import java.util.Scanner;
import java.lang.*;


public class abraham_program1    //Begin Class Definition
{
   
	public static void main(String[] args)    //Begin Main Method
   {
		//Define (and initialize, where appropriate) Local Variables
      String input1, input2, input3, response = "", output = "", positive = "y", negative = "n", stringAsc, stringDsc;
		int min = 0, mid = 0, max = 0;
		Integer inputInt1, inputInt2, inputInt3;

		//Initialize Scanner to receive two inputs
		Scanner scan = new Scanner(System.in);
      Scanner input = new Scanner(System.in);

		//Prompt user with instructions
      System.out.println("I am going to ask you for three numbers, then I will list them in order of their value.");
		System.out.println("");
      
		//Input1
      //Prompt user to enter first number
		System.out.println("Please enter the first number: ");
		input1 = scan.nextLine();                 //Assign user-entered value to variable
         if (input1.equals("")) {               //If value is null, prompt with error message.
         System.out.println("Please enter a valid numeric value.");
         } else {
      inputInt1 = Integer.parseInt(input1);     //Parse int value to Integer (to test for > or < value)

		
		//Input2
      //Prompt user to enter second number
		System.out.println("Please enter a second number: ");
		input2 = scan.nextLine();                 //Assign user-entered value to variable
         if (input2.equals("")) {               //If value is null, prompt with error message.
         System.out.println("Please enter a valid numeric value.");
         } else {
      inputInt2 = Integer.parseInt(input2);     //Parse int value to Integer (to test for > or < value)

		
		//Input3
      //Prompt user to enter third number      
		System.out.println("Please enter your final number: ");
		input3 = scan.nextLine();                 //Assign user-entered value to variable
         if (input3.equals("")) {               //If value is null, prompt with error message.
         System.out.println("Please enter a valid numeric value.");
         } else {
      inputInt3 = Integer.parseInt(input3);     //Parse int value to Integer (to test for > or < value)
      
      //Test to make sure no two (or more) values are the same.
      if ((inputInt1 == inputInt2) || (inputInt2 == inputInt3) || (inputInt1 == inputInt3)) {
         System.out.println("Please rerun the program and enter 3 different, valid numeric values.");
      
      //If the values are valid, non-repeating, then test to see which is min, mid and max.
      } else {
        
            if (inputInt1 < inputInt2) {						
      			if (inputInt1 < inputInt3) {					
      				min = inputInt1;								
      				if (inputInt2 < inputInt3) {					// input1 < input2 < input3   ||   a < b < c    [1]
      					mid = inputInt2;	
      					max = inputInt3;
      				} else if (inputInt3 < inputInt2) {			// input1 < input3 < input2   ||   a < c < b    [2]
      					mid = inputInt3;
      					max = inputInt2;
      				}
      			} else if (inputInt3 < inputInt1) {				// input3 < input1 < input2   ||   c < a < b    [5]
      				min = inputInt3;
      				mid = inputInt1;
      				max = inputInt2;
      			}
      		} else if (inputInt2 < inputInt3) {					
      			if (inputInt2 < inputInt1) {					
      				min = inputInt2;
      				if (inputInt3 < inputInt1) {					// input2 < input3 < input1   ||   b < c < a    [4]
      					mid = inputInt3;
      					max = inputInt1;
      				} else if (inputInt1 < inputInt3) {			// input2 < input1 < input3   ||   b < a < c    [3]
      					mid = inputInt1;
      					max = inputInt3;
      				}
      			}
      		} else if (inputInt3 < inputInt2) {
      			if (inputInt3 < inputInt1) {
      				min = inputInt3;
      				if (inputInt2 < inputInt1) {					// input3 < input2 < input1   ||   c < b < a    [6]
      					mid = inputInt2;
      					max = inputInt1;
      				}
      			}	
      		}
            
            //Concatenate a string to list the values in ascending order.
      		stringAsc = ("In ascending order, your numbers are:\n"
      				+ min + "\n"
      				+ mid + "\n"
      				+ max);
      	   System.out.println("");
            //Print the string for user.
            System.out.println(stringAsc);
            System.out.println("");
            
            //Concatenate a string to list the values in descending order.
            stringDsc = ("In descending order, your numbers are:\n"
         		   + max + "\n"
         		   + mid + "\n"
         		   + min);
                  
            //Prompt user if he/she would like to see the desceding order.
            System.out.println("Would you like to see them in descending order? (Y/N)");
            response = input.nextLine();                    //Get response from user.
            output = response.toLowerCase();                //Convert response to lower case for if/else test
            
            //Test response, if positive display results, else END.                        
            if (output.equals(positive)) {
               System.out.println("");
               System.out.println(stringDsc);
            } else {
               System.out.println("Thanks for playing!");
            }
      	}  //End if (sorting out repititious values)
         
         }  //End if (input3 null?)
         }  //End if (input2 null?)
         }  //End if (input1 null?)
         
   }     //End Method

}     //End Class