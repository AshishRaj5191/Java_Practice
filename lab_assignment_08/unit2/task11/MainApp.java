package lab_assignment_08.unit2.task11;

import java.util.*;
import java.util.stream.Collectors;

public class MainApp {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(101, "Rahul", 85, "BTech"));
        list.add(new Student(102, "Amit", 75, "MCA"));
        list.add(new Student(103, "Neha", 90, "BTech"));
        list.add(new Student(104, "Simran", 65, "MCA"));

        List<String> names = list.stream()
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println("Student Names: " + names);

        Map<String, Long> countByProgram = list.stream()
                .collect(Collectors.groupingBy(
                        Student::getProgram,
                        Collectors.counting()
                ));

        System.out.println("Count by Program: " + countByProgram);

        Optional<Student> topScorer = list.stream()
                .max(Comparator.comparingInt(Student::getMarks));

        topScorer.ifPresent(s ->
                System.out.println("Top Scorer: " + s)
        );
    }
}
