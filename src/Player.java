import java.util.*;

/**
 * Player class
 * @author Ian MacLeod
 * @date 2/28/22
 *
 */
public class Player {
	
	//data fields
	private double money;
	private List<Card> hand;
	
	/**
	 * Constructor that initializes starting money to $500 and player hand
	 */
	public Player() {
		money = 500;
		hand = new ArrayList<Card>();
	}
	
	//----Getters and Setters-----//
	/**
	 * Method that returns the users total current money
	 * @return total current money
	 */
	public double getMoney() {
		return this.money;
	}
	
	/**
	 * Setter method that updates the player's money
	 * @param money player's money
	 */
	public void setMoney(double money) {
		this.money = money;
	}
	
	/**
	 * Method that returns the player's hand
	 * @return player's hand
	 */
	public List<Card> getHand(){
		return this.hand;
	}
	
	/**
	 * Method that returns the total value in the player's hand
	 * @return total in player's hand
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
