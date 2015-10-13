//***************************************************************
/* CSC-111 Fundamentals of Computing
 * Tuesday, Oct. 06, 2015
 * Naif Z. Abraham III
 * Lab 07
 *
 * Refined Algorithms:
 * While Loop:
 * 1. Initialize the variable that will be utilized in the While
 *    Loop with a value of -1, thereby setting the conditions for
 *    at least one passage through the loop.
 * 2. Set While Loop conditions to keep looping if the value en-
 *    tered by the user is <0 or >100.
 * 3. Get value from user.
 * 4. If the value meets the conditions of the While Loop (user 
 *    entered a number defined as invalid) loop back to the prompt
 *    to recieve new user input.
 * 5. Once the user enters a number between 0 and 100, setting the
 *    While Loop conditions to false, the loop will end and the
 *    next line of code after the While Loop will execute.
 * 6. Display the valid value that the user entered.
 *
 *
 *
 * Do/While Loop:
 * 1. Enter the Do Loop.
 * 2. Get value from user.
 * 3. Test the conditions of the value entered.
 * 4. If the value is such that the Do Loop conditions are true,
 *    i.e. the value is <0 and >100, then return through the loop
 *    and prompt the user for a new value.
 * 5. If the value is such that the conditions are false, i.e. the
 *    value is between 0 and 100, then the loop conditions are set
 *    false, exit the Do Loop.
 * 6. Display the valid value that the user entered.
 *
 *
*/
//***************************************************************

import java.util.Scanner;

public class abraham_lab07    //Begin Clas.
{
   public static void main(String[] args)    //Begin Main Method.
   {
   
   //Declare (and Initialize) Variables.
   int valueWhile = -1, valueDo;
   
   //Initialize Scanners to accept user input.
   Scanner inputWhile = new Scanner(System.in);
   Scanner inputDo = new Scanner(System.in);
   
   //Begin While Loop
         //valueWhile was initialized to -1, allowing this loop to begin;
   while(valueWhile < 0 || valueWhile >=101) { 
      System.out.println("Please enter a score between 0 and 100.");    //Prompt user for input.
      valueWhile = inputWhile.nextInt();     //Assign value to variable.
   }  //End While
         //If the value entered by the user remains outside the parameters of the conditions, then the loop
         //will run begin again, prompting the user to enter a value.
   
   //Once the loop conditions are false and the loop is exited, display the valid value.
   System.out.println("The value you entered is " + valueWhile + ".  Thank you.");
   
   //Space for the next loop.
   System.out.println("________________________________________________________");
   System.out.println();

//***************************************************************
   
   //Begin Do/While Loop
   do {
      System.out.println("Please enter a score between 0 and 100.");    //Prompt user for input.
      valueDo = inputDo.nextInt();     //Assign value to variable.
         //Test the value of the input to see if the loop must be rerun.
   } while(valueDo < 0 || valueDo > 100);    //End Do/While Loop if the value is between 0 and 100.
   
   //Once the loop conditions are false and the loop is exited, display the valid value.
   System.out.println("The value you entered is " + valueDo + ".  Thank you.");
   
   
   }  //End Main Method.

}  //End Class.