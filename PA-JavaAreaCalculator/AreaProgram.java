import java.util.Scanner;

/**
 * AreaProgram is an application that can calculate the area of multiple 2D shapes.
 * It executes the full area application
 */
public class AreaProgram {

	/**
	 * calculates the area of a square given its length
	 *
	 * @param length the length of the square
	 * @return the area of the square
	 */
	public static double calculateSquareArea(double length) {
		return Math.pow(length, 2);
	}

	/**
	 * calculates the area of a circle given its radius
	 *
	 * @param radius the radius of the circle
	 * @return the area of the circle
	 */
	public static double calculateCircleArea(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}

	/**
	 * calculates the area of a triangle given its base and height
	 *
	 * @param base the base of the triangle
	 * @param height the height of the triangle
	 * @return the area of the triangle
	 */
	public static double calculateTriangleArea(double base, double height) {
		return base * height / 2.0;
	}
	
	/**
	 * It executes the full area application
	 *
	 * @param args
	 */
	public static void main(String[] args) {
	  Scanner keyboard = new Scanner(System.in); //the scanner object to read user input
	  int choice = 0; //the menu option choice given by the user
	  double area = 0.0; //the area of the shape chosen by the user

	  do {
		//display the menu and get the user's choice
	    System.out.print("=== AREA CALCULATOR ===\n1. Square\n2. Circle\n3. Triangle\n4. Exit\n"); //corrected one statement per line
		System.out.print("Enter the desired option[1-4]: ");
		choice = keyboard.nextInt();

		  //validate the user's choice
		  if (choice < 1 || choice > 4)
		    System.out.println("Option is invalid. Please provide a valid option."); //corrected One statement per line
		  else
		    switch (choice) {
			  case 1:
			  //find the area of a square
			    System.out.print("Area of a Square\nEnter the square's lenght: ");
				double length = keyboard.nextDouble(); //the length of the square
				area = calculateSquareArea(length);
				System.out.println("area of the square is: " + area);
				break;
				  case 2:
				  //find the area of a circle
					  System.out.print("Area of a Circle\nEnter the circle's radius: ");
					  double radius = keyboard.nextDouble(); //the radius of the circle
					  area = calculateCircleArea(radius);
					  System.out.println("area of the circle is: " + area);
					  break;
				  case 3:
				  //find the area of a triangle
					  System.out.print("Area of a Triangle\nEnter the triangle's base: ");
					  double base = keyboard.nextDouble(); //the base of the triangle
					  System.out.print("Area of a Triangle\nEnter the triangle's height: "); //corrected one statement per line
					  double height = keyboard.nextDouble(); //the height of the triangle
					  area = calculateTriangleArea(base, height);
					  System.out.println("area of the triangle is: " + area);
					  break;
			  }
	  } while (choice != 4);
	  
	  System.out.println("exiting the program...");
	  keyboard.close();
  }
}
