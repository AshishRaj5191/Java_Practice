package lab_assignment_08.unit2.task10;

import java.util.*;
import java.util.stream.Collectors;

public class MainApp {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(101, "Rahul", 85));
        list.add(new Student(102, "Amit", 65));
        list.add(new Student(103, "Neha", 90));

        System.out.println("Traditional Filtering (>70):");

        List<Student> result1 = new ArrayList<>();

        for (Student s : list) {
            if (s.getMarks() > 70) {
                result1.add(s);
            }
        }

        result1.forEach(System.out::println);

        System.out.println("\nLambda Filtering (>70):");

        List<Student> result2 = list.stream()
                .filter(s -> s.getMarks() > 70)
                .collect(Collectors.toList());

        result2.forEach(System.out::println);
    }
}