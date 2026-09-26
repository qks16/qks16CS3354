package edu.txst.game;

/**
 * the extend keyword is used to define the SuperWarrior class as a subclass of WarriorType,
 * allowing it to inherit shared warrior data and behavior, while adding super warrior-specific features.
 * It provides methods to manage the super warrior's health points (HP) and shield durability, including
 * decreasing HP and retrieving the current HP and shield durability.
 */
public class SuperWarrior extends WarriorType {
	ShieldType shield;

	/**
	 * Creates a new super warrior with the specified HP, maximum HP, attack points, and shield.
	 * because the super warrior extends WarriorType, the super keyword is used to call the parent
	 * constructor to initialize inherited fields before setting super warrior-specific fields.
	 * 
	 * @param hp the super warrior's current HP
	 * @param mhp the super warrior's maximum HP
	 * @param ap the super warrior's attack points
	 * @param shield the super warrior's shield
	 */
	public SuperWarrior(int hp, int mhp, int ap, ShieldType shield) {
		super(hp, mhp, ap);
		this.shield = shield;
	}

	/**
	 * Decreases the super warrior's HP by the specified amount, taking into account the shield's durability.
	 * The shield's durability is decreased by 1 each time this method is called.
	 * 
	 * @param amount the amount by which to decrease HP
	 */
	@Override //this method overrides the decreaseHp method in the parent WarriorType class, providing
	//a new implementation that takes into account the shield's durability.
	public void decreaseHp(int amount) {
		amount = amount / shield.getDurability();
		super.decreaseHp(amount);
		shield.decreaseDurability(1);
	}

	/**
	 * Returns a string representation of the super warrior, including its HP, maximum HP, attack points,
	 * and shield durability.
	 * 
	 * @return a string representation of the super warrior
	 */
	@Override //this method overrides the toString method in the parent WarriorType class, providing
	//a new implementation that includes the shield's durability in the string representation.
	public String toString() {
		return "[hp=" + hp + ", mhp=" + mhp + ", ap=" + ap + ", sd=" + shield.getDurability() + "]";
	}
}
