package edu.txst.game;

/**
 * The interface keyword is used to define the Animal interface, which declares a contract for classes that implement it.
 * Any class that implements the Animal interface must provide an implementation for the makeSound() method,
 * ensuring that all animal types can produce a sound, while allowing for different behaviors in each implementing class.
 */
interface Animal {
	void makeSound();
}
