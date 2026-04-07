package lab_assignment_06.unit2.task6;

import java.util.ArrayList;

public class FailFastDemo {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(101, "Rahul"));
        list.add(new Student(102, "Amit"));
        list.add(new Student(103, "Neha"));

        for (Student s : list) {
            if (s.getStudentId() == 102) {
                list.remove(s);
            }
        }
    }
}