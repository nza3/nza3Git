//Prologue Section
/**********************************************************************
 *Program Name:   CSC 111 Lab 06
 *Author:   Naif Abraham III
 *Date:     Sept. 30, 2015
 *Course/Section:  CSC 111-003W
 *Program Description:  This program prompt the user to enter how many grades
 *                      he/she would like the program to average.  It will then
 *                      display the running and final average once all of the
 *                      user's input has been accepted.
 *---------------------------------------------------------------------
 *                          Initial Algorithm:
 * 1. 
 *
 *---------------------------------------------------------------------
 *                             Input Data:
 * 1. 
 *
 *---------------------------------------------------------------------
 *                             Output Data:
 * 1. 
 *
 *---------------------------------------------------------------------
 *                               Formulas:
 * 1. 
 *
 *---------------------------------------------------------------------
 *                         Refined Algorithm:
 * 1.     
 *
 *---------------------------------------------------------------------
 *BEGIN Program abraham_lab06 – CSC 111 Program abraham_lab06
 *   
 *********************************************************************/
 
//Pre-Processor Declaration Section

import java.util.Scanner;
import java.util.*;
import java.text.DecimalFormat;

public class abraham_lab06 {

	public static void main(String[] args) {

		int count = 0, maxCount = 0, averageInt = 0;
      double gradeAverage = 0, grade = 0, gradeSum = 0;
		String reply = "y";

		Scanner input = new Scanner(System.in);
      Scanner scan = new Scanner(System.in);
      Scanner dInput = new Scanner(System.in);
      DecimalFormat decimal = new DecimalFormat("###.##");

		while (reply.equals("y") || reply.equals("Y") || reply.equals("")) {

			System.out.println("Please enter the total number of grades you wish to average.");
			maxCount = input.nextInt();

			if (maxCount <= 0) {
				System.out.println("Please enter a valid number greater than 0.");
			} else {
				while (count < maxCount) {
					System.out.print("Enter grade: ");
					grade = dInput.nextDouble();
						if (grade < 0) {
							System.out.println("That is not a valid grade.  Please enter a value greater than or equal to 0.");
							count--;
						} else {
                     gradeSum = grade + gradeSum;
							gradeAverage = gradeSum / (count + 1);
                     System.out.println();
							System.out.println("The overall average is currently: " + decimal.format(gradeAverage) + ".");
							System.out.println("You have entered " + (count + 1) + " out of " + maxCount + " grades." );
                     System.out.println();
						}	//End if (grade < 0)
					count++;
				}	//End while (count < maxCount)
				System.out.println("The final average of the grades you entered is: " + decimal.format(gradeAverage) + ".");
            System.out.println();
			} 	//End if (maxCount <= 0)
			System.out.println("Would you like to enter more grades? (Y/N)");
         count = 0;
         gradeSum = 0;
         grade = 0;
         gradeAverage = 0;
			reply = scan.nextLine();
         System.out.println();

		}	//End while (reply == "y")
	}
}