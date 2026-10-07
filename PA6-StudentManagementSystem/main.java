package StudentManagementSystem;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        student student1 = new student("John Doe", 20, "S12345", 3, "Computer Science");
        student student2 = new student("Jane Smith", 22, "S67890", 4, "Mathematics");
        student student3 = new student("Alice Johnson", 21, "S54321", 2, "Physics");
        student student4 = new student("Bob Brown", 23, "S98765", 1, "Chemistry");
        student student5 = new student("Charlie Davis", 19, "S24680", 4, "Biology");

        //create student list
        List<student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        //use collections.sort to sort the student list by GPA in ascending order
        Collections.sort(studentList);

        while (true) {
            System.out.println("Student Management System");
            System.out.println("1. Display Student Information");
            System.out.println("2. Compare Student GPA");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = new java.util.Scanner(System.in).nextInt();

            switch (choice) {
                case 1:
                    // for (student s : studentList) {
                    //     System.out.println(s.toString());
                    // }

                    studentList.forEach(s -> System.out.println(s.toString()));

                    break;
                case 2:
                    System.out.println("select first student to compare (name): ");
                    String firstStudentName = new java.util.Scanner(System.in).nextLine();

                    System.out.println("select second student to compare (name): ");
                    String secondStudentName = new java.util.Scanner(System.in).nextLine();

                    student firstStudent = null;
                    student secondStudent = null;

                    for (student s : studentList) {
                        if (s.getName().equals(firstStudentName)) {
                            firstStudent = s;
                        }
                        if (s.getName().equals(secondStudentName)) {
                            secondStudent = s;
                        }
                    }

                    // Check if both students were found
                    if (firstStudent == null || secondStudent == null) {
                        System.out.println("One or both students not found. Please try again.");
                    break;
                    }

                    // Compare the GPAs of the two students
                    if (firstStudent.compareTo(secondStudent) > 0) {
                        System.out.println(firstStudent.getName() + " has a higher GPA than " + secondStudent.getName());
                    } else if (firstStudent.compareTo(secondStudent) < 0) {
                        System.out.println(secondStudent.getName() + " has a higher GPA than " + firstStudent.getName());
                    } else if (firstStudent.compareTo(secondStudent) == 0) {
                        System.out.println("Both students have the same GPA.");
                    }

                    //fix for choice scanner being skipped issue
                    new java.util.Scanner(System.in).nextLine(); // Consume the newline character
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}