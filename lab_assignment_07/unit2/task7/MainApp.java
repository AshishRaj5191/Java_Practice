package lab_assignment_07.unit2.task7;

import java.util.ArrayList;
import java.util.Collections;

public class MainApp {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(101, "Rahul"));
        list.add(new Student(102, "Amit"));
        list.add(new Student(103, "Neha"));

        Collections.sort(list);

        for (Student s : list) {
            System.out.println(s);
        }
    }
}