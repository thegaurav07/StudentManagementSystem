package studentmangementapp;

import java.util.Scanner;

public class StudentManagementApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    // Add a new student
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Consume newline character
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Student Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();  // Consume newline character
                    System.out.print("Enter Student Grade: ");
                    String grade = scanner.nextLine();

                    Student newStudent = new Student(id, name, age, grade);
                    studentManager.addStudent(newStudent);
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    // View all students
                    studentManager.viewStudents();
                    break;

                case 3:
                    // Update student
                    System.out.print("Enter Student ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline character
                    System.out.print("Enter New Name: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Enter New Age: ");
                    int updateAge = scanner.nextInt();
                    scanner.nextLine();  // Consume newline character
                    System.out.print("Enter New Grade: ");
                    String updateGrade = scanner.nextLine();

                    studentManager.updateStudent(updateId, updateName, updateAge, updateGrade);
                    break;

                case 4:
                    // Delete student
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = scanner.nextInt();
                    studentManager.deleteStudent(deleteId);
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
