import java.util.Scanner;

public class palindromes 
{

	public static void main (String[] args) 
	{
		String str = "", strNoSpace = "", strNoPunct = "", strMinimized = "", another = "y";
		int left, right, i = 0, j = 0, k = 0, n = 0, spaceCount = 0, commaCount = 0, dotCount = 0, semiCount = 0;

		Scanner scan = new Scanner(System.in);

      another = "y";
		while (another.equalsIgnoreCase("y"))
		{
			System.out.println("Please enter a potential palindrome.");
			str = scan.nextLine();
         System.out.println(str.length());
			
               i = 0;
               spaceCount = 0;
               //Test Spaces
               if (str.contains(" ")) {

                  while(i < str.length())
                  {
                     if(str.charAt(i) == ' ') {
                        spaceCount++;
                     }   
                    i++;
                  }
         System.out.println("str = " + str);
            
               str = str.replaceAll("\\s+","");
         System.out.println("str = " + str + str.length());
               
               }


               //Test Commas
               j = 0;
               commaCount = 0;
               if (str.contains(",")) {
                  while(j < (str.length() - spaceCount))
                  {
                     if(str.charAt(j) == ',' ) {
                        commaCount++;
                     }   
                    j++;
                  }     
         System.out.println("str = " + str);
               
               str = str.replaceAll(",","");
               }
                  
                  
               //Test Periods
               k = 0;
               dotCount = 0;
               if (str.contains(".")) {
                  while(k < (str.length() - spaceCount - commaCount))
                  {
                      if(str.charAt(k) == '.' ) {
                        dotCount++;
                      }   
                      k++;
                  }            
         System.out.println("str = " + str);
               str = str.replaceAll(".","");
               }
                  
                  
               //Test Semicolons  
               n = 0; 
               semiCount = 0;
               if (str.contains(";")) {
                  
                  while(n < (str.length() - spaceCount - commaCount - dotCount))
                  {
                     if(str.charAt(n) == ';' ) {
                        semiCount++;
                     }   
                    n++;
                  }            
         System.out.println("str = " + str);
                     
               str = str.replaceAll(";","");
               }

            }
         
   		str.equalsIgnoreCase(str);
         System.out.println("str.equalsIgnoreCase = " + str);


			left = (0 - (spaceCount + commaCount + dotCount + semiCount));
         System.out.println(left);

			right = (str.length() - (1 + spaceCount + commaCount + dotCount + semiCount));
         System.out.println("right = " + right);

			while(str.charAt(left) == str.charAt(right) && left < right)
			{
				left ++;
				right --;
			}

			System.out.println("");
			if (left < right) {
				System.out.println("That string is NOT a palindrome.");
			} else {
				System.out.println("That string IS a palindrome.");
				System.out.println("");
				System.out.println("Test another potential palindrome? (Y/N)");
				another = scan.nextLine();
      }  //End If
      
      System.out.println("spaceCount = " + spaceCount + "\n"
                        + "commaCount = " + commaCount + "\n"
                        + "dotCount = " + dotCount + "\n"
                        + "semiCount = " + semiCount);
      
  } //End While 

}	//End Class