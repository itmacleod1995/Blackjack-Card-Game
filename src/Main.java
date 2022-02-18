import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Blackjack!\n\n");
		
		Deck deck = new Deck();
		Player player = new Player();
		//deck.showDeck();
		
		//Begin game
		System.out.println("You are starting with $500. Would you like to play a hand? ");
		boolean start = true; 
		
		while(start) {
			String answer = scan.next();
			if(answer.toLowerCase().equals("yes")) {
				System.out.println("Place your bet: ");
				double bet = scan.nextDouble();
				if(bet < 1.0) {
					System.out.println("The minimum bet is $1.");
				}else if(bet > player.getMoney()) {
					System.out.println("You do not have sufficient funds.");
				}
			}
			start = false;
		}
		

	}

}
