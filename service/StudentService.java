package service;

import model.Student;
import java.util.ArrayList;

public class StudentService {

    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student Added!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }

        for (Student s : students) {
            System.out.println(s.rollNo + " | " + s.name + " | " + s.age);
        }
    }

    public void searchStudent(String rollNo) {
        for (Student s : students) {
            if (s.rollNo.equals(rollNo)) {
                System.out.println("Found: " + s.rollNo + " | " + s.name + " | " + s.age);
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void deleteStudent(String rollNo) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).rollNo.equals(rollNo)) {
                students.remove(i);
                System.out.println("Student Deleted!");
                return;
            }
        }
        System.out.println("Student not found!");
    }
}
