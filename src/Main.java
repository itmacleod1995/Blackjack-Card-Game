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
		System.out.println("You are starting with $500. Would you like to play a hand? ");
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
					dealer.deal();
					System.out.println(" ");
					dealer.showDeck();
				}
			}
		}
		 
		
		
		

	}

}
