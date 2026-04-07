package lab_assignment_05.unit2.task3;

import java.util.HashSet;

public class TestStudent {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul");
        Student s2 = new Student(101, "Amit");   // Same ID → should be equal
        Student s3 = new Student(102, "Neha");

        HashSet<Student> set = new HashSet<>();

        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println("Total Students in Set: " + set.size());
    }
}
