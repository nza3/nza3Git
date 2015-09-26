//
//Will display a random card from a standard deck.
//

import java.util.Scanner;
import java.util.Random;

public class fifty_twoCards_multArray {

   public static void main (String [] args) {
      String [][] cards = {
         {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"},
         {"Spades", "Hearts", "Clubs", "Diamonds"}};

      Random generator = new Random();

      int rndValue;
      int rndSuit;

      rndSuit = generator.nextInt(3);
      rndValue = generator.nextInt(13);
            
      System.out.println("rndValue = " + rndValue + ", rndSuit = " + rndSuit);
      //System.out.println(cards[0][0] + cards[rndValue][rndSuit]);
      
      System.out.println("Cards Array has " + cards.length + " values.");
            

      //System.out.println("Your random card is: " + display);

    }
}

