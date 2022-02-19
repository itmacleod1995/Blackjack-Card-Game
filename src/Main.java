import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Blackjack!\n\n");
		
		//Deck deck = new Deck();
		Player player = new Player();
		Dealer dealer = new Dealer();
		//deck.showDeck(); 
		
		//Begin game
		System.out.println("You are starting with $" + player.getMoney() + ", Would you like to play a hand? ");
		String response = scan.next();
		if(response.equals("yes")) {
			boolean start = true;
			while(start) {
				System.out.println("Place your bet: ");
				double bet = scan.nextDouble();
				if(bet < 1.0) {
					System.out.println("The minimum bet is $1.");
						//start = false;
				}else if(bet > player.getMoney()) {
					System.out.println("You do not have sufficient funds.");
				}else {
					dealer.deal(player);
					boolean hitOrStay = true;
					while(hitOrStay) {
						System.out.println("Would you like to hit or stay?");
						response = scan.next();
						if(!response.toLowerCase().equals("hit") && !response.toLowerCase().equals("stay")) {
							System.out.println("That is not a valid option.");
						}else if(response.equals("hit")) {
							for(Card card : player.getHand()) {
								System.out.println(card.getValue() + "" + card.getSuite());
								hitOrStay = false;
								start = false;
							}
						}
					}
					
					
				}
			}
		}
		 
		
		
		

	}

}
