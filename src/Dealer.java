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
	

	public void deal() {
		//random number generation to randomly select 1-52 inclusive
		Random rand = new Random();
		
		//deal card 1
		Card card1 = this.deck.getDeck().get(rand.nextInt(53));
		this.deck.removeCardFromDeck(card1);
		
		//deal card 2
		Card card2 = this.deck.getDeck().get(rand.nextInt(53));
		this.deck.removeCardFromDeck(card2);
		
		System.out.println("You are dealt: " + card1.getSuite() + "" + card1.getValue() + ", " + card2.getSuite() + "" + card2.getValue());
	}
	
	

}
