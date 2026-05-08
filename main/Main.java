package main;

import model.Student;
import service.StudentService;
import util.InputHelper;

public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            int choice = InputHelper.getInt("Enter choice: ");

            switch (choice) {

                case 1:
                    String roll = InputHelper.getString("Enter Roll No: ");
                    String name = InputHelper.getString("Enter Name: ");
                    int age = InputHelper.getInt("Enter Age: ");

                    service.addStudent(new Student(roll, name, age));
                    break;

                case 2:
                    service.viewStudents();
                    break;

                case 3:
                    String searchRoll = InputHelper.getString("Enter Roll No: ");
                    service.searchStudent(searchRoll);
                    break;

                case 4:
                    String deleteRoll = InputHelper.getString("Enter Roll No: ");
                    service.deleteStudent(deleteRoll);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
