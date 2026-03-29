package lab_assignment_02.unit2.task4;
import java.util.Scanner;

public class ClassStrengthAnalyzer {
    public static void main(String[] args) {

        boolean[] feesPaid = new boolean[50]; // total students = 50
        Scanner sc = new Scanner(System.in);

        int paidCount = 0;
        int unpaidCount = 0;

        // Input for first 10 students only
        System.out.println("Enter fee status for first 10 students (true = paid, false = unpaid):");

        for (int i = 0; i < 10; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            feesPaid[i] = sc.nextBoolean();

            // Counting logic
            if (feesPaid[i]) {
                paidCount++;
            } else {
                unpaidCount++;
            }
        }

        // Calculate percentage
        double percentagePaid = (paidCount / 10.0) * 100;

        // Output results
        System.out.println("\n--- Fee Summary ---");
        System.out.println("Paid Students: " + paidCount);
        System.out.println("Unpaid Students: " + unpaidCount);
        System.out.println("Percentage Paid: " + percentagePaid + "%");

        sc.close();
    }
}
