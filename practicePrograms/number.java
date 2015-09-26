import java.util.Scanner;
import java.util.Locale;
import java.util.Date;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class number {

	public static void main (String[] args) {

		//Declare Variables
		String number, currencyOut; 
		int numberInt;
		double numberDouble, dollar, cdollar, bitcoin, pound, euro, yuan, won, peso;
		final double cdollarXC = 1.32, bitcoinXC = 0.0043, poundXC = 0.64, euroXC = 0.88, yuanXC = 6.37, wonXC = 900.00, pesoXC = 16.66; 

		Scanner input = new Scanner(System.in);
      DecimalFormat decimal = new DecimalFormat("#,###.00");


		System.out.println("Please enter your favorite integer from 0 to 2,147,483,647: ");
		number = input.nextLine();
		number = number.replaceAll(",", "");

		numberInt = Integer.parseInt(number);
		numberDouble = Double.parseDouble(number);

		System.out.println("");
		System.out.println("The number you chose was " + number + ".");
		System.out.println("");

		//Currency Conversions		
		cdollar = numberDouble * cdollarXC;
		bitcoin = numberDouble * bitcoinXC;
		pound = numberDouble * poundXC;
		euro = numberDouble * euroXC;
		yuan = numberDouble * yuanXC;
		won = numberDouble * wonXC;
		peso = numberDouble * pesoXC;
		System.out.println("Currency\t\t(Rate)             \tExchange");
      System.out.println("________\t\t______             \t________");
      System.out.println("");
		//Currency String Concatenation
		currencyOut = "U.S. Dollars \t\t(1.00) \t\t\t" + decimal.format(numberDouble) + "\n"
					+ "Canadian Dollars \t(" + cdollarXC + ") \t\t\t" + decimal.format(cdollar) + "\n"
					+ "Bitcoins \t\t(" + bitcoinXC + ") \t\t" + decimal.format(bitcoin) + "\n"
					+ "British Pound \t\t(" + poundXC + ") \t\t\t" + decimal.format(pound) + "\n"
					+ "Euros \t\t\t(" + euroXC + ") \t\t\t" + decimal.format(euro) + "\n"
					+ "Chinese Yuan \t\t(" + yuanXC + ") \t\t\t" + decimal.format(yuan) + "\n"
					+ "North Korean Won \t(" + wonXC + ") \t\t" + decimal.format(won) + "\n"
					+ "Mexican Pesos \t\t(" + pesoXC + ") \t\t" + decimal.format(peso);
		//Currency Display
		System.out.println(currencyOut);







	}

}