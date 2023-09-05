package Griffin_Ziegler_lab1;

import java.util.Random;
import java.util.Collections;

public class CardDealer {
	
	int numCards;
	// declare deck of cards array
	private static Card[] deck;
	// create new rand object
	public static Random rand = new Random(52);
	// declare hand array
	public static Card[] hand;
	
	public CardDealer() {
		// Constructor 
		// Creates a deck of playing cards
		// initialize deck of cards array
		deck = new Card[52];
		
		// fill the deck with cards
		for (int i = 0; i < 13; i++) {
			for (int j = 0; j <= 4; j++) {
				deck[i * 3 + j] = new Card(i + 1, j);
			}
		}
	}
	
	public static Card[] drawHand() {
		// create hand object
		hand = new Card[5];
		// for loop to select 5 random integers
		for (int i = 0; i < 5; i += 1) {
			// index to keep track of removed cards
			int index = rand.nextInt(52-i);
			hand[i] = deck[index];
		}
		
		return hand;
	}
	
}
