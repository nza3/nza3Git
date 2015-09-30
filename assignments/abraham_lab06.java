//Prologue Section

/**********************************************************************
 *Program Name:   CSC 111 Lab 06
 *Author:   Naif Abraham III
 *Date:     Sept. 30, 2015
 *Course/Section:  CSC 111-003W
 *Program Description:  This program prompt the user to enter how many 
 *                      grades he/she would like the program to average.  
 *                      It will then display the running and final 
 *                      average once all of the user's input has been 
 *                      accepted.
 *---------------------------------------------------------------------
 *                          Initial Algorithm:
 * 1. Get total number of grades the user wishes to enter.
 * 2. Get that number of grades, display the running sum of grades.
 * 3. Display final average to the user.
 *
 *---------------------------------------------------------------------
 *                             Input Data:
 * 1. The user will input the maximum number of grades he/she wishes to 
 *    add (maxCount).
 * 2. The user will enter maxCount # of grades (grades).
 * 3. The user will input whether or not to run the program again (reply).   
 *
 *---------------------------------------------------------------------
 *                             Output Data:
 * 1. The program will output the total number of grades the user wishes
 *    to input (maxCount).
 * 2. The program will output the running grade average (gradeAverage).
 * 3. The program will display how many grades the user entered out of
 *    total maxCount.
 *
 *---------------------------------------------------------------------
 *                               Formulas:
 * 1.    gradeSum = grade + gradeSum
 *    Where the entered grade will be added to running total to form the 
 *    new running total.
 * 2.    gradeAverage = gradeSum / (count + 1)
 *    Where the gradeAverage will be displayed after  each entry, then 
 *    again after the final entry.  The average will be determined by
 *    the running total [Formula 2] divided by the total number of ent-
 *    ries; in this case, the count was initialized to 0, so the actual
 *    count must be increased by 1 to yield the correct divisor.
 *
 *---------------------------------------------------------------------
 *                         Refined Algorithm:
 * 1. Prompt the user for the total number of grades he/she wishes to 
 *    enter into the program.
 * 2. Get number (n) from user.
 * 3. If the number (n) is greater than zero, proceed to step 4.
 *    3a.   If the number (n) is less than or equal to zero, prompt user
 *          with an error message.
 * 4. Get 1 of n grades from the user.
 * 5. If the entry is greater than or equal to zero, proceed to step 6.
 *    5a.   If the entry is less than zero, prompt the user to enter a
 *          valid number.  [Formula 1]
 * 6. Add each grade entered to the previous total to get gradeSum.  (The
 *    first entry will simply be grade entered + 0.)
 * 7. Increase the count/total number of grades entered by 1 for each
 *    grade the user enters.
 * 8. Repeat steps 4 through 7 until the total number of grades have
 *    been entered.
 * 9. Display the final average.
 * 10.Prompt the user with a Y/N question to see if the user would like 
 *    to run the program again.
 *    10a.  If the user enters "Y" or presses [Enter]/[Return], repeat
 *          steps 1 through 10.
 *    10b.  If the user enters "N" or any other value, end program.
 *    
 *---------------------------------------------------------------------
 *BEGIN Program abraham_lab06 – CSC 111 Program abraham_lab06
 *   
 *********************************************************************/
 
//Pre-Processor Declaration Section

import java.util.Scanner;
import java.util.*;
import java.text.DecimalFormat;

public class abraham_lab06 {  //Begin Class

	public static void main(String[] args) {  //Begin Main Method
      
      //Declare (and Initialize) Variables
		int count = 0, maxCount = 0, averageInt = 0;
      double gradeAverage = 0, grade = 0, gradeSum = 0;
		String reply = "y";

      //Initialize Scanner for user input
		Scanner input = new Scanner(System.in);
      Scanner scan = new Scanner(System.in);
      Scanner dInput = new Scanner(System.in);
      //Initialize decimal format for output of average
      DecimalFormat decimal = new DecimalFormat("#,###.##");

		//Begin While loop to give the user the chance to rerun program
      while (reply.equals("y") || reply.equals("Y") || reply.equals("")) {

			//Prompt user for maximum number of grades that will be entered
         System.out.println("Please enter the total number of grades you wish to average.");
			maxCount = input.nextInt();

			//Error check before beginning nested loop for grades/averages
         if (maxCount <= 0) {
				System.out.println("Please enter a valid number greater than 0.");
            
			} else {
				
            //Begin While loop based on user-entered maxCount of grades to be entered
            while (count < maxCount) {
               //Prompt user for grade(s)
					System.out.print("Enter grade: ");
					grade = dInput.nextDouble();
						
                  //Error check for valid grade value before beginning formulas to find averages
                  if (grade < 0) {
							System.out.println("That is not a valid grade.  Please enter a value greater than or equal to 0.");
							
                     //If this is errant, negate added count for each error
                     count--;
                     
						} else {
                  
                     gradeSum = grade + gradeSum;              //Find total sum of grade(s) entered         [Formula 1]
							gradeAverage = gradeSum / (count + 1);    //Calculate average of all grades entered    [Formula 2]
                     System.out.println();
                     
                     //Display the average
							System.out.println("The overall total is currently: " + gradeSum + ".");
							//Display how many grades have been entered, out of how many will be entered, total
                     System.out.println("You have entered " + (count + 1) + " out of " + maxCount + " grades." );
                     System.out.println();
						}	//End if (grade < 0)
              
               //Increment count forward by one    
					count++;    
                                                   
				}	//End while (count < maxCount)
				
            //Display the final average of all the grades entered
            System.out.println("The final average of the grades you entered is: " + decimal.format(gradeAverage) + ".");
            System.out.println();
			} 	//End if (maxCount <= 0)
         
         //Prompt user: rerun program to enter more grades?
			System.out.println("Would you like to enter more grades? (Y/N)");
			reply = scan.nextLine();   
         
         //If user enters "y," then reinitialize the following for the next iteration
         count = 0;
         gradeSum = 0;
         grade = 0;
         gradeAverage = 0;
         System.out.println();

		}	//End while (reply == "y")
      
	}  //End Main Method
   
}  //End Class