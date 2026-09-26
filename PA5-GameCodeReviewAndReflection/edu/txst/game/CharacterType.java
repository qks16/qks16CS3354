package edu.txst.game;

/**
 * The CharacterType class represents a character in the game with health points (HP) and maximum health points (MHP).
 * It provides methods to manage the character's health, including decreasing HP and retrieving the current HP.
 */
public class CharacterType {
	protected int hp; // current health points of the character
	protected int mhp; // maximum health points of the character

	/**
	 * Decreases the character's HP by the specified amount.
	 * 
	 * @param amount the amount by which to decrease HP
	 */
	public void decreaseHp(int amount) {
		this.hp = this.hp - amount;
		if (this.hp < 0)
			this.hp = 0;
	}

	/**
	 * Returns the character's current HP.
	 * 
	 * @return the character's current HP
	 */
	public int getHP() {
		return hp;
	}

	/**
	 * Creates a new character with the specified HP and maximum HP.
	 * 
	 * @param hp the character's current HP
	 * @param mhp the character's maximum HP
	 */
	public CharacterType(int hp, int mhp) {
		if (mhp < 1)
			mhp = 1; // default mhp equal to 1
		this.mhp = mhp;
		if (hp > mhp)
			hp = mhp; // default hp is equal to mhp
		this.hp = hp;
	}
}
