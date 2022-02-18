import java.util.*;
public class Dealer {
	
	//instance variables
	private Deck deck;
	private List<Card> hand;
	
	/**
	 * Constructor
	 */
	public Dealer() {
		deck = new Deck();
		hand = new ArrayList<Card>();
	}
	
	/**
	 * Method that has the dealer reveal all cards in the deck
	 */
	public void showDeck() {
		int count = 0;
		for(Card card : this.deck.getDeck()) {
			card.showCard();
			count++;
		}
		
		System.out.println("total card count: " + count);
	}
	
	

}
