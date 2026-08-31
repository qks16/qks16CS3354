import java.util.Scanner;

/**
 * AreaProgram is an application that can calculate the area of multiple 2D shapes.
 */
public class AreaProgram {
	/**
	 * It executes the full area application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	  Scanner keyboard = new Scanner(System.in);
	  int choice = 0;
	  double area = 0.0;

	  do {
	    System.out.print("=== AREA CALCULATOR ===\n1. Square\n2. Circle\n3. Triangle\n4. Exit\n"); //corrected one statement per line
		System.out.print("Enter the desired option[1-4]: ");
		choice = keyboard.nextInt();

		  if (choice < 1 || choice > 4)
		    System.out.println("Option is invalid. Please provide a valid option."); //corrected One statement per line
		  else
		    switch (choice) {
			  case 1:
			  //find the area of a square
			    System.out.print("Area of a Square\nEnter the square's lenght: ");
				double length = keyboard.nextDouble();
				area = Math.pow(length, 2);
				System.out.println("area of the square is: " + area);
				break;
				  case 2:
				  //find the area of a circle
					  System.out.print("Area of a Circle\nEnter the circle's radius: ");
					  double radius = keyboard.nextDouble();
					  area = Math.pow(radius, 2) * Math.PI;
					  System.out.println("area of the circle is: " + area);
					  break;
				  case 3:
				  //find the area of a triangle
					  System.out.print("Area of a Triangle\nEnter the triangle's base: ");
					  double base = keyboard.nextDouble();
					  System.out.print("Area of a Triangle\nEnter the triangle's height: "); //corrected one statement per line
					  double height = keyboard.nextDouble();
					  area = base * height / 2.0;
					  System.out.println("area of the triangle is: " + area);
					  break;
			  }
	  } while (choice != 4);
	  
	  System.out.println("exiting the program...");
	  keyboard.close();
  }
}
