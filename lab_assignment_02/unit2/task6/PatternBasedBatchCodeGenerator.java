package lab_assignment_02.unit2.task6;
import java.util.Scanner;

public class PatternBasedBatchCodeGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Course: ");
        String course = sc.next();
        sc.nextLine();

        System.out.print("Enter Year: ");
        String year = sc.nextLine();

        System.out.print("Enter Number of Students: ");
        int totalStudents = sc.nextInt();

        for (int i = 1; i <= totalStudents; i++) {
            System.out.println(course + year + "_STU_" + i);
        }

        sc.close();
    }
}
