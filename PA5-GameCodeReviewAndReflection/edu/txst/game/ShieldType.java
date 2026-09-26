package edu.txst.game;

/**
 * The ShieldType class represents a shield with durability that can be decreased over time.
 */
public class ShieldType {
	private int durability;

	/**
	 * Returns the current durability of the shield.
	 * 
	 * @return the current durability of the shield
	 */
	public int getDurability() {
		return durability;
	}

	/**
	 * Decreases the durability of the shield by the specified amount.
	 * Ensures that the durability does not fall below 1.
	 * 
	 * @param decrement the amount by which to decrease the durability
	 */
	public void decreaseDurability(int decrement) {
		durability = durability - decrement;
		if (durability < 1)
			durability = 1;
	}

	/**
	 * Creates a new shield with the specified durability.
	 * If the provided durability is less than 1, it defaults to 1 to ensure that shields have a positive durability.
	 * 
	 * @param durability the initial durability of the shield
	 */
	public ShieldType(int durability) {
		if (durability < 1)
			durability = 1;
		this.durability = durability;
	}
}
