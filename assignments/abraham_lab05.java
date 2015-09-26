import java.util.Scanner;
import java.text.NumberFormat;

public class abraham_lab05 {

	public static void main(String[] args) {

		int minutes;
		double total = 0;
		final double cost = .99, charge = .10;
		Scanner input = new Scanner(System.in);
      
      NumberFormat currency = NumberFormat.getCurrencyInstance();

		System.out.println("Please enter the number of minutes of the phone call.");
		minutes = input.nextInt();


		if (minutes <= 0) {
			System.out.println("Please enter a valid number of minutes (not 0 or less).");
		} else if (minutes <=10) {
			total = cost;
         System.out.println("The total cost of the phone call is " + currency.format(total));

		} else {
			total = cost + (charge * (minutes - 10)); 
         System.out.println("The total cost of the phone call is " + currency.format(total));
		}

	}
}