//
//Will display a random card from a standard deck.
//

import java.util.Scanner;
import java.util.Random;

public class fifty_twoCards {

   public static void main (String [] args) {
      String [] values = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
      String [] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};

      Random generator = new Random();

      int rndValue;
      int rndSuit;

      rndSuit = generator.nextInt(3);
      rndValue = generator.nextInt(13);

      String display = values[rndValue] + " of " + suits[rndSuit];

      System.out.println("Your random card is: " + display);

    }
}

