package lab_assignment_06.unit2.task4;

import java.util.ArrayList;

public class MainApp {

    public static void main(String[] args) {

        ArrayList<Course> courseList = new ArrayList<>();

        Course javaCourse = new Course("Java");
        Course dsaCourse = new Course("DSA");

        courseList.add(javaCourse);
        courseList.add(dsaCourse);

        Student s1 = new Student(101, "Rahul");
        Student s2 = new Student(102, "Amit");
        Student s3 = new Student(101, "Rahul");

        javaCourse.enrollStudent(s1);
        javaCourse.enrollStudent(s2);
        javaCourse.enrollStudent(s3);

        javaCourse.printTotalStudents();
    }
}
