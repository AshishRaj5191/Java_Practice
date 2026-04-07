package lab_assignment_07.unit2.task9;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        List<String> courseList = new ArrayList<>();
        courseList.add("Java");
        courseList.add("DSA");

        StudentProfile profile = new StudentProfile(101, "Rahul", courseList);

        System.out.println("Before modification: " + profile);

        courseList.add("OS");

        profile.getCourses().add("DBMS");

        System.out.println("After modification attempts: " + profile);
    }
}
