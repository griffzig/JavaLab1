package Griffin_Ziegler_lab1;

public class Card {

	// string objects for card suit and rank
	private int rank;
	private String suit;
	
	private final String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	
	public Card(int suit, int rank) {
		// constructor 
		// assign suit and rank to instance variables
		this.suit = suits[suit];
		this.rank = rank;
	}
	
	public int getRank() {
		// returns the rank of the card
		return rank;
	}
	
	public String getSuit() {
		// returns the suit of the card
		return suit;
	}
	
	public String toString() {
		// returns string version of card rank
		// Initialize string card object
		// ex output: 10 of Spades
		String card = " of " + suit;
		
		// assign string version to each rank
		switch(rank) {
		case 1:
			card = "Ace" + card;
		case 11:
			card = "Jack" + card;
		case 12:
			card = "Queen" + card;
		case 13:
			card = "King" + card;
		// default case
		default:
			card = rank + card;
		}
		return card;
	}
	
	
}
