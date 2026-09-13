public class Student {
	private String firstName; // First name of the student
	private String lastName; // Last name of the student
	private String major; // Major of the student
	private double gpa; // GPA of the student

	// setters for each data member
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	// getters for each data member
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMajor() {
		return major;
	}

	public double getGpa() {
		return gpa;
	}

	//default constructor for Student class, initializes all data members to default values
	public Student() {
		this("", "", "", 0.0);
	}

	//parameterized constructor for Student class, initializes all data members to the provided values
	public Student(String firstName, String lastName, String major, double gpa) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.major = major;
		this.gpa = gpa;
	}

	/**
	 * Prints the information of the student.
	 * 
	 * @return void
	 */
	public void printStudentInfo() {
		System.out.println("First name: " + this.firstName);
		System.out.println("Last name: " + this.lastName);
		System.out.println("Major: " + this.major);
		System.out.println("GPA: " + this.gpa);
	}

	/**
	 * It executes the full area application
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// create three Student objects using the default and parameterized constructors
		Student student1 = new Student();
		Student student2 = new Student("Peter", "Parker", "CS", 3.5);
		Student student3 = new Student("Clark", "Kent", "Journalism", 3.8);

		// display the information of each student
		student1.printStudentInfo();
		student2.printStudentInfo();
		student3.printStudentInfo();
	}
}
