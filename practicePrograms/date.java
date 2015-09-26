//
//Will display numbers that have significant associations or values.
//
//package com.mkyong;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Random;
import java.util.*;


public class date {

   public static void main (String[] args) {
         Scanner scan = new Scanner(System.in);		

         System.out.print("What month is it? ");
         int month = scan.nextInt();
         
         String monthName = "";

            if (month == 1) {
                monthName = "January";
            } else if (month == 2) {
               monthName = "February";
            } else if (month == 3) {
               monthName = "March";
            } else if (month == 4) {
               monthName = "April";
            } else if (month == 5) {
               monthName = "May";
            } else if (month == 6) {
               monthName = "June";
            } else if (month == 7) {
               monthName = "July";
            } else if (month == 8) {
               monthName = "August";
            } else if (month == 9) {
               monthName = "September";
            } else if (month == 10) {
               monthName = "October";
            } else if (month == 11) {
               monthName = "November";
            } else if (month == 12) {
               monthName = "December";
            } else {
               System.out.print("Please enter a valid month");
            }
            
            System.out.println("The month you enetered is " + monthName + ".");
            
            System.out.println("This is my exact calculation about time and date: ");
            
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	         
            //get current date time with Date()
	         Date date = new Date();
	         System.out.println(dateFormat.format(date));
	  
//             Calendar monthNum = Calendar.getInstance().get(Calendar.MONTH);
            
            
  //           
//             if (monthNum <11) {
//                season = 
//         //     
// //             Calendar cal = Calendar.getInstance();
// //             System.out.println(new SimpleDateFormat("MMM").format(cal.getTime()));
//      
     
           //  System.out.println("Would you like to know more? (Y/N)");
//             String answer = scan.nextString();
//             
//             if (answer == "Y") {


       	//Date date = new Date();
        
       	// display time and date using toString()
       	//System.out.println(date.toString());
   

         // Stopwatch timer = Stopwatch.createUnstarted();
//             for (...) {
//                timer.start();
//                methodToTrackTimeFor();
//                timer.stop();
//                methodNotToTrackTimeFor();
//             }
            
         //System.out.println("Method took: " + timer);




	}

}