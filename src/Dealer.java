import java.util.*;
public class Dealer {
	
	//instance variables
	private Deck deck;
	private List<Card> hand;
	private HashSet<Integer> cardsDealt;
	
	/**
	 * Constructor
	 */
	public Dealer() {
		deck = new Deck();
		hand = new ArrayList<Card>();
		cardsDealt = new HashSet<>();
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
		int randomCardNum = rand.nextInt(51) + 1;
		while(this.cardsDealt.contains(randomCardNum)) {
			randomCardNum = rand.nextInt(51) + 1;
		}
		this.cardsDealt.add(randomCardNum);
		Card card1 = this.deck.getDeck().get(randomCardNum);
		
		this.deck.removeCardFromDeck(card1);
		
		//deal card 2
		int randomCardNum2 = rand.nextInt(51) + 1;
		while(this.cardsDealt.contains(randomCardNum2)) {
			randomCardNum2 = rand.nextInt(51) + 1;
		}
		this.cardsDealt.add(randomCardNum2);
		Card card2 = this.deck.getDeck().get(randomCardNum2);
		
		this.deck.removeCardFromDeck(card2);
		
		System.out.println("You are dealt: " + card1.getValue() + "" + card1.getSuite() + ", " + card2.getValue() + "" + card2.getSuite());
	}
	
	

}
