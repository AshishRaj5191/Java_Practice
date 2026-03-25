package lab_assignment_01.unit1.task_3;

import java.util.Scanner;

public class ScoreEvaluatorMiniEngine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[3];
        int total = 0;

        // Input with validation
        for (int i = 0; i < 3; i++) {
            while (true) {
                System.out.print("Enter marks for Subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();

                if (marks[i] >= 0 && marks[i] <= 100) {
                    break;
                } else {
                    System.out.println("❌ Invalid marks! Please enter between 0 and 100.");
                }
            }
            total += marks[i];
        }

        // Calculate average
        double average = total / 3.0;

        // Grade assignment
        char grade;
        if (average >= 80) {
            grade = 'A';
        } else if (average >= 60) {
            grade = 'B';
        } else if (average >= 40) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        // Output
        System.out.println("\n===== Result =====");
        System.out.println("Total Marks = " + total);
        System.out.println("Average = " + average);
        System.out.println("Grade = " + grade);

        sc.close();
    }
}