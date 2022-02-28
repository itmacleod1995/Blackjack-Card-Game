/**
 * Card class
 * @author Ian MacLeod
 * @date 2/28/22
 *
 */
public class Card {
	
	//Member variables
	private String suite;
	private String value;
	
	/**
	 * Non-Default Constructor that builds a single card
	 * @param value numerical value of card as a String
	 * @param suite suite of the card
	 */
	public Card(String value, String suite) {
		this.value = value;
		this.suite = suite;
	}
	
	/**
	 * Method that shows the card
	 */
	public void showCard() {
		System.out.println(this.value + "" + this.suite);
	}
	
	/**
	 * Method to return the card's suite
	 * @return suite
	 */
	public String getSuite() {
		return this.suite;
	}
	
	/**
	 * Method to return card's value
	 * @return value
	 */
	public String getValue() {
		return this.value;
	}

}
