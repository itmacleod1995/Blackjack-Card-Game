import java.util.*;
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
	 * Method that returns the player's hand
	 * @return player's hand
	 */
	public List<Card> getHand(){
		return this.hand;
	}

}
