package lab_assignment_06.unit2.task6;

import java.util.ArrayList;
import java.util.Iterator;

public class SafeRemovalDemo {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(101, "Rahul"));
        list.add(new Student(102, "Amit"));
        list.add(new Student(103, "Neha"));

        Iterator<Student> it = list.iterator();

        while (it.hasNext()) {
            Student s = it.next();

            if (s.getStudentId() == 102) {
                it.remove();
            }
        }

        for (Student s : list) {
            System.out.println(s);
        }
    }
}
