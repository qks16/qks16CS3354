package edu.txst.game;

/**
 * the implements keyword is used to define the Pig class as an implementation of the Animal interface,
 * because pig is an implementation of the Animal interface, it is required to provide a concrete implementation of the makeSound() method.
 */
public class Pig implements Animal {

	@Override //this method overrides the makeSound method in the Animal interface, providing a concrete implementation that outputs the sound a pig makes.
	public void makeSound() {
		System.out.println("The pig says: wee wee");
	}

	/**
	 * The sleep method is a concrete implementation of the sleep method in the Animal interface,
	 * providing a specific behavior for the Pig class that outputs a sleeping sound.
	 * providing extra methods in the Pig class that are not part of the Animal interface
	 * demonstrates that a class can have additional functionality beyond what is defined in the
	 * interface it implements.
	 */
	public void sleep() {
		System.out.println("Zzz");
	}

	/**
	 * The main method demonstrates polymorphism by creating instances of the Pig and Cat classes
	 * and calling their makeSound methods through the Animal interface reference.
	 * This shows that different classes can be treated as the same type (Animal) while still
	 * exhibiting their own specific behaviors.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Animal animal0 = new Pig();
		animal0.makeSound();

		Animal animal1 = new Cat();
		animal1.makeSound();
	}
}
