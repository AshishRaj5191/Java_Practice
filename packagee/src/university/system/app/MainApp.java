package packagee.src.university.system.app;
// import packagee.src.university.system.student.Student;
import packagee.src.university.system.student.*;
import packagee.src.university.system.academics.*;
import packagee.src.university.system.rules.*;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student(24, "RAJ");
        GradeCalculator gc = new GradeCalculator();
        UniversityRules ur = new UniversityRules();

        s.printInfo();

        double avg = 82.5;
        String grade = gc.calculateGrade(avg);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);

        ur.printScholarshipPolicy(grade);
    }
}
// WAP to accept name and id of the student and marks of three subject and calculate the average and grade and eligibility for scholarship.