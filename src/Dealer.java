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
	
	/**
	 * Method that deals the initial two cards to both player and dealer
	 * @param player player that is playing
	 */
	public void deal(Player player) {
		//random number generation to randomly select 1-52 inclusive
		Random rand = new Random();
		
		/**
		 * Deal card 1 for player
		 */
		
		int randomCardNum = rand.nextInt(deck.getSize());
		
		Card card1 = this.deck.getDeck().get(randomCardNum);
		
		this.deck.removeCardFromDeck(card1);
		
		
		/**
		 * Deal card 2 for player
		 */
		int randomCardNum2 = rand.nextInt(deck.getSize());
		
		
		Card card2 = this.deck.getDeck().get(randomCardNum2);
		this.deck.removeCardFromDeck(card2);
		
		player.getHand().add(card1);
		player.getHand().add(card2);
		
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
	
	public int dealSingleCard(Player player) {
		//random number generation to randomly select 1-52 inclusive
		Random rand = new Random();
		int randomCardNum = rand.nextInt(deck.getSize());
		Card card = this.deck.getDeck().get(randomCardNum);
		this.deck.removeCardFromDeck(card);
		System.out.println("You are dealt " + card.getValue() + card.getSuite());
		player.getHand().add(card);
		
		//check to see if player's hand is over 21
		int val = 0;
		for(Card c : player.getHand()) {
			if(c.getValue().equals("Q") || c.getValue().equals("K") || c.getValue().equals("J")) {
				val += 10;
			}else if(c.getValue().equals("A")) {
				val += 1;
			}
			else {
				val += Integer.parseInt(c.getValue());
			}
		}
		
		if(val > 21) {
			return 22;
		}else {
			return -1;
		}
		
	}
	
	public String dealSingleCardForDealer() {
		Random rand = new Random();
		int randomCard = rand.nextInt(this.deck.getSize());
		Card card = this.deck.getDeck().get(randomCard);
		this.hand.add(card);
		this.deck.removeCardFromDeck(card);
		
		return card.getValue() + "" + card.getSuite(); 
	}
	
	/**
	 * Method that prints the dealers hand
	 * @return arraylist of dealers hand
	 */
	public List<Card> showHand(){
		return this.hand;
	}
	
	/**
	 * Method that returns the total value in the dealer's hand
	 * @return total in dealer's hand
	 */
	public double getHandTotal() {
		double total = 0.0;
		for(Card c : this.hand) {
			if(c.getValue().equals("K") || c.getValue().equals("Q") || c.getValue().equals("J")) {
				total += 10;
			}else if(c.getValue().equals("A")) {
				total += 1;
			}else {
				total += Double.parseDouble(c.getValue());
			}
			
		}
		
		return total;
	}
	
	

}
