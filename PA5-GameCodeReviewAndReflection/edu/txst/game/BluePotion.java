package edu.txst.game;

/**
 * the extend keyword is used to define the BluePotion class as a subclass of Potion,
 * allowing it to inherit shared potion data and behavior, while adding blue potion-specific features.
 */
public class BluePotion extends Potion {
	/**
	 * Creates a new blue potion with the specified value.
	 * because the blue potion extends Potion, the super keyword is used to call the parent
	 * constructor to initialize inherited fields before setting blue potion-specific fields.
	 * 
	 * @param value the value of the blue potion
	 */
	@Override //this method overrides the getValue method in the parent Potion class, providing
	// a new implementation that returns the base value of the blue potion.
	public int getValue() {
		return this.value;
	}

	/**
	 * Creates a new blue potion with the specified value.
	 * because the blue potion extends Potion, the super keyword is used to call the parent
	 * constructor to initialize inherited fields before setting blue potion-specific fields.
	 * 
	 * @param value the value of the blue potion
	 */
	public BluePotion(int value) {
		super(value);
	}
}
