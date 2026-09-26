package edu.txst.game;

/**
 * The extend keyword is used to define the WarriorType class as a subclass of CharacterType,
 * allowing it to inherit shared character data and behavior, while adding warrior-specific features.
 * It provides methods to manage the warrior's attack points, including attacking and using potions
 * to increase HP or AP.
 */
public class WarriorType extends CharacterType {
	protected int ap;

	/**
	 * Returns the warrior's current attack points.
	 * 
	 * @return the warrior's current attack points
	 */
	public int attack() {
		return ap;
	}

	/**
	 * Uses a blue potion to increase the warrior's HP.
	 * 
	 * @param bluePotion the blue potion to use
	 */
	public void use(BluePotion bluePotion) {
		this.hp = this.hp + bluePotion.getValue();
		if (this.hp > this.mhp)
			this.hp = this.mhp;
	}

	/**
	 * Uses a red potion to increase the warrior's attack points.
	 * 
	 * This is an overloaded version of the use method: the same method name accepts
	 * different potion types, so BluePotion and RedPotion each trigger their own
	 * specific behavior without changing the method call syntax.
	 * 
	 * @param redPotion the red potion to use
	 */
	public void use(RedPotion redPotion) {
		this.ap = this.ap + redPotion.getValue();
	}

	/**
	 * Creates a new warrior with the specified HP, maximum HP, and attack points.
	 * because the warrior extends CharacterType, the super keyword is used to call the parent
	 * constructor to initialize inherited fields before setting warrior-specific fields.
	 * 
	 * @param hp the warrior's current HP
	 * @param mhp the warrior's maximum HP
	 * @param ap the warrior's attack points
	 */
	public WarriorType(int hp, int mhp, int ap) {
		super(hp, mhp);
		if (ap < 0)
			ap = 0;
		this.ap = ap;
	}
}
