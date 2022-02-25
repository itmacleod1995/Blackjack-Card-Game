import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Blackjack!\n");
		
		//Deck deck = new Deck();
		Player player = new Player();
		Dealer dealer = new Dealer();
		
		boolean beginGame = true;
		
		//Begin game
		while(beginGame) {
			System.out.println(" ");
			System.out.println("You are starting with $" + player.getMoney() + ", Would you like to play a hand? ");
			String response = scan.next();
			if(response.equals("yes")) {
				boolean start = true;
				while(start) {
					System.out.println("Place your bet: ");
					double bet = scan.nextDouble();
					if(bet < 1.0) {
						System.out.println("The minimum bet is $1.");
								
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
								int x = dealer.dealSingleCard(player);
								System.out.print("You now have: ");
								for(Card c : player.getHand()) { 
									System.out.print(c.getValue() + "" + c.getSuite() + ", ");
								}
								System.out.println(" ");
								if(x > 21) {
									System.out.println("Your hand value is over 21 and you lose $" + bet + " :(");
									double currentMoney = player.getMoney();
									player.setMoney(currentMoney -= bet); 
									hitOrStay = false;
									start = false;
										
									dealer.showHand().clear();
									player.getHand().clear();
								}
							}else if(response.toLowerCase().equals("stay")) {
								System.out.print("The dealer has: ");
								for(Card c : dealer.showHand()) {
									System.out.print(c.getValue() + "" + c.getSuite() + ", ");
								}
								System.out.println("");
								//Blackjack
								if(player.getHandTotal() == 21 && dealer.getHandTotal() != 21) {
									System.out.println("Blackjack! You win " + bet * 1.5);
									player.setMoney(player.getMoney() + (bet * 1.5) + bet);
								}
									
								boolean dealersTurn = true;
								boolean dealerBusts = false;
								while(dealersTurn) {
									//if the dealer's hand has a value of 16 or less, they must hit
									if(dealer.getHandTotal() > 21) {
										System.out.println("The dealer busts, you win $" + bet);
										player.setMoney(player.getMoney() + bet);
										dealersTurn = false;
										dealerBusts = true;
									}else if(dealer.getHandTotal() <= 16) {
										String dealt = dealer.dealSingleCardForDealer();
										System.out.println("The dealer hits and is dealt: " + dealt);
									}else {
										System.out.println("The dealer stays.");
										dealersTurn = false;
									}
								}
									
								if(dealerBusts == false) {
									if(player.getHandTotal() > dealer.getHandTotal()) {
										System.out.println("You win $" + bet + "!");
										player.setMoney(player.getMoney() + bet);
									}else if(player.getHandTotal() < dealer.getHandTotal()) {
										System.out.println("The dealer wins, you lose $" + bet);
										player.setMoney(player.getMoney() - bet);
									}else {
										System.out.println("You tie. Your bet has been returned.");
									}
								}
									
								hitOrStay = false;
								start = false;
								dealer.showHand().clear();
								player.getHand().clear();
							}
						}
							
							
					}
				}
					
				}else {
					System.out.println("Goodbye");
					beginGame = false;
				}
		}
	}

}
