import java.util.*;

/**
 * Deck class that constructs the 52 card deck
 * @author Ian MacLeod
 * @date 2/28/22
 *
 */
public class Deck {
	
	//Member variables
	private List<Card> deck;
	
	/**
	 * Constructor that builds the deck of 52 cards
	 */
	public Deck() {
	
		deck = new ArrayList<Card>();
		
		int typeOfCard = 1;
		while(typeOfCard < 5) { //change this back to 5
			if(typeOfCard == 1) {
				for(int i = 2; i < 11; i++) {
					deck.add(new Card(i + "", "\u2666"));
					
				}
				deck.add(new Card("J", "\u2666"));
				deck.add(new Card("Q", "\u2666"));
				deck.add(new Card("K", "\u2666"));
				deck.add(new Card("A", "\u2666"));
	
				typeOfCard++;
			}
			
			if(typeOfCard == 2) {
				for(int i = 2; i < 11; i++) {
					deck.add(new Card(i + "", "\u2665"));
				}
				deck.add(new Card("J", "\u2665"));
				deck.add(new Card("Q", "\u2665"));
				deck.add(new Card("K", "\u2665"));
				deck.add(new Card("A", "\u2665"));
				typeOfCard++;
			}
			
			if(typeOfCard == 3) {
				for(int i = 2; i < 11; i++) {
					deck.add(new Card(i + "", "\u2663"));
				}
				deck.add(new Card("J", "\u2663"));
				deck.add(new Card("Q", "\u2663"));
				deck.add(new Card("K", "\u2663"));
				deck.add(new Card("A", "\u2663"));
				typeOfCard++;
			}
			
			if(typeOfCard == 4) {
				for(int i = 2; i < 11; i++) {
					deck.add(new Card(i + "", "\u2660"));
				}
				deck.add(new Card("J", "\u2660"));
				deck.add(new Card("Q", "\u2660"));
				deck.add(new Card("K", "\u2660"));
				deck.add(new Card("A", "\u2660"));
				typeOfCard++;
			}
			
			
			
		}
	}
	
	/**
	 * Method that prints the entire deck and total card count
	 */
	public void showDeck() {
		int count = 0;
		for(Card card : this.deck) {
			card.showCard();
			count++;
		}
		
		System.out.println("total card count: " + count);
	}
	
	/**
	 * Method that returns the deck
	 * @return deck
	 */
	public List<Card> getDeck() {
		return this.deck;
	}
	
	/**
	 * Method that removes card from deck
	 * @param card card to be removed
	 */
	public void removeCardFromDeck(Card card) {
		this.deck.remove(card);
	}
	
	/**
	 * Method that gets the current deck size
	 * @return size of deck
	 */
	public int getSize() {
		return this.deck.size();
	}

}
