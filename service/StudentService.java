package servic

import java.util.ArrayList;
import model.Student;

public class StudentService {

    ArrayList<Student> students = new ArrayList<>();

   public void addStudent(Student s) {

    for (Student st : students) {
        if (st.getRollNo().equals(s.getRollNo())) {
            System.out.println("Student already exists!");
            return;
        }
    }

    students.add(s);
    System.out.println("Student Added!");
}

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }

        for (Student s : students) {
            System.out.println(s);

        }
    }

    public void searchStudent(String rollNo) {
        for (Student s : students) {
            if (s.getRollNo().equals(rollNo)) {
               System.out.println("Found: " + s);

                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void deleteStudent(String rollNo) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRollNo().equals(rollNo)) {

                students.remove(i);
                System.out.println("Student Deleted!");
                return;
            }
        }
        System.out.println("Student not found!");
    }
}
