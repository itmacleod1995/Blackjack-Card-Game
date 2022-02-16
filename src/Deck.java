
public class Deck {
	
	//Member variables
	private int size;
	private Card[] deck;
	
	/**
	 * Constructor that builds the deck of 52 cards
	 */
	public Deck() {
		size = 52;
		deck = new Card[52];
		int cardNum = 0;
		
		int typeOfCard = 1;
		while(typeOfCard < 5) { //change this back to 5
			if(typeOfCard == 1) {
				for(int i = 2; i < 11; i++) {
					deck[cardNum] = new Card(i + "", "\u2666");
					cardNum++;
				}
				deck[cardNum] = new Card("J", "\u2666");
				cardNum++;
				deck[cardNum] = new Card("Q", "\u2666");
				cardNum++;
				deck[cardNum] = new Card("K", "\u2666");
				cardNum++;
				deck[cardNum] = new Card("A", "\u2666");
				cardNum++;
				typeOfCard++;
			}
			
			if(typeOfCard == 2) {
				for(int i = 2; i < 11; i++) {
					deck[cardNum] = new Card(i + "", "\u2665");
					cardNum++;
				}
				deck[cardNum] = new Card("J", "\u2665");
				cardNum++;
				deck[cardNum] = new Card("Q", "\u2665");
				cardNum++;
				deck[cardNum] = new Card("K", "\u2665");
				cardNum++;
				deck[cardNum] = new Card("A", "\u2665");
				cardNum++;
				typeOfCard++;
			}
			
			if(typeOfCard == 3) {
				for(int i = 2; i < 11; i++) {
					deck[cardNum] = new Card(i + "", "\u2663");
					cardNum++;
				}
				deck[cardNum] = new Card("J", "\u2663");
				cardNum++;
				deck[cardNum] = new Card("Q", "\u2663");
				cardNum++;
				deck[cardNum] = new Card("K", "\u2663");
				cardNum++;
				deck[cardNum] = new Card("A", "\u2663");
				cardNum++;
				typeOfCard++;
			}
			
			if(typeOfCard == 4) {
				for(int i = 2; i < 11; i++) {
					deck[cardNum] = new Card(i + "", "\u2660");
					cardNum++;
				}
				deck[cardNum] = new Card("J", "\u2660");
				cardNum++;
				deck[cardNum] = new Card("Q", "\u2660");
				cardNum++;
				deck[cardNum] = new Card("K", "\u2660");
				cardNum++;
				deck[cardNum] = new Card("A", "\u2660");
				cardNum++;
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

}
