package lab_assignment_02.unit1.task5;
import java.util.Scanner;

public class TopperIdentificationEngine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int students = 5;
        int subjects = 3;

        int[][] marks = new int[students][subjects];
        int[] total = new int[students];

        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int classSum = 0;

        // Input marks
        System.out.println("Enter marks for 5 students (3 subjects each):");

        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i + 1) + ":");
            for (int j = 0; j < subjects; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();

                total[i] += marks[i][j];
                classSum += marks[i][j];
            }

            // Update highest & lowest (based on total)
            if (total[i] > highest) {
                highest = total[i];
            }
            if (total[i] < lowest) {
                lowest = total[i];
            }
        }

        // Average class score (per subject entry)
        double avg = classSum / (double)(students * subjects);

        // Find toppers (can be multiple)
        System.out.println("\n--- Results ---");
        System.out.println("Highest Total Score: " + highest);
        System.out.println("Lowest Total Score: " + lowest);
        System.out.println("Average Class Score: " + avg);

        System.out.print("Topper Student Index/Indices: ");

        for (int i = 0; i < students; i++) {
            if (total[i] == highest) {
                System.out.print(i + " "); // index (0-based)
            }
        }

        sc.close();
    }
}
