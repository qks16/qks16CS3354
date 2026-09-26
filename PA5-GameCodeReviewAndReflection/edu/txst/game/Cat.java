package edu.txst.game;

/**
 * the implements keyword is used to define the Cat class as an implementation of the Animal interface,
 * because cat is an implementation of the Animal interface, it is required to provide a concrete implementation of the makeSound() method.
 */
public class Cat implements Animal {

	@Override //this method overrides the makeSound method in the Animal interface, providing a concrete implementation that outputs the sound a cat makes.
	public void makeSound() {
		System.out.println("The cat says: meow");
	}

}
