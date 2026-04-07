package lab_assignment_06.unit2.task4;

import java.util.HashSet;

public class Course {

    private String courseName;
    private HashSet<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new HashSet<>();
    }

    public void enrollStudent(Student student) {
        if (enrolledStudents.add(student)) {
            System.out.println(student + " enrolled in " + courseName);
        } else {
            System.out.println(student + " is already enrolled!");
        }
    }

    public void printTotalStudents() {
        System.out.println("Total students in " + courseName + ": " + enrolledStudents.size());
    }
}
