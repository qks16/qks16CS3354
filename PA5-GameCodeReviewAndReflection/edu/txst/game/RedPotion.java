package edu.txst.game;

/**
 *  the extend keyword is used to define the RedPotion class as a subclass of Potion,
 *  allowing it to inherit shared potion data and behavior, while adding red potion-specific features.
 */
public class RedPotion extends Potion {

	/**
	 * Creates a new red potion with the specified value.
	 * because the red potion extends Potion, the super keyword is used to call the parent
	 * constructor to initialize inherited fields before setting red potion-specific fields.
	 * 
	 * @param value the value of the red potion
	 */
	public RedPotion(int value) {
		super(value);
	}

	/**
	 * Returns the value of the red potion, which is twice the base value.
	 * 
	 * 
	 * @return the value of the red potion
	 */
	@Override //this method overrides the getValue method in the parent Potion class, providing
	// a new implementation that returns twice the base value of the red potion.
	public int getValue() {
		return 2 * this.value;
	}
}
