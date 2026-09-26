package edu.txst.game;


/**
 * The Potion class is an abstract class that serves as a base for different types of potions in the game.
 * It defines a common structure for potions, including a value that represents the effect of the potion.
 * Subclasses of Potion must implement the getValue() method to provide the specific value of the potion.
 */
public abstract class Potion {
	protected int value;

	public abstract int getValue(); // abstract keyword is used to declare methods that subclasses must provide their own implementation of this method.

	/**
	 * Creates a new potion with the specified value.
	 * If the provided value is less than 1, it defaults to 1 to ensure that potions have a positive effect.
	 * 
	 * @param value the value of the potion
	 */
	public Potion(int value) {
		if (value < 1)
			this.value = 1;
		this.value = value;
	}
}
