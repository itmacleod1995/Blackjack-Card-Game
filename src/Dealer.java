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
		
		System.out.println("total card count: " + this.deck.getSize());
	}
	

	public void deal() {
		//random number generation to randomly select 1-52 inclusive
		Random rand = new Random();
		
		//deal card 1
		int randomCardNum = rand.nextInt(deck.getSize());
		
		//randomCardNum = rand.nextInt(deck.getSize());
		
		//this.cardsDealt.add(randomCardNum);
		Card card1 = this.deck.getDeck().get(randomCardNum);
		
		this.deck.removeCardFromDeck(card1);
		
		//deal card 2
		int randomCardNum2 = rand.nextInt(deck.getSize());
		//randomCardNum2 = rand.nextInt(deck.getSize());
		
		//this.cardsDealt.add(randomCardNum2);
		Card card2 = this.deck.getDeck().get(randomCardNum2);
		
		this.deck.removeCardFromDeck(card2);
		
		System.out.println("You are dealt: " + card1.getValue() + "" + card1.getSuite() + ", " + card2.getValue() + "" + card2.getSuite());
		
		
		//deal card #3 for dealer
		int randomCardNum3 = rand.nextInt(deck.getSize());
		
		
		Card card3 = this.deck.getDeck().get(randomCardNum3);
				
		this.deck.removeCardFromDeck(card3);
				
		//deal card #4 for dealer
		int randomCardNum4 = rand.nextInt(deck.getSize());
		
		Card card4 = this.deck.getDeck().get(randomCardNum4);
				
		this.deck.removeCardFromDeck(card4);
		this.hand.add(card3);
		this.hand.add(card4);
		
		System.out.println("The dealer is dealt: " + card3.getValue() + "" + card3.getSuite() + ", " + "Unknown");
		
	
	}
	
	

}
