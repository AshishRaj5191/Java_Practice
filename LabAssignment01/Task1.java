package LabAssignment01;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        String name;
        String program;
        int age;
        String regNo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your Program (MCA/BCA/MBA): ");
        program = sc.nextLine().toUpperCase();
        System.out.println("Enter your Registration No.: ");
        regNo = sc.nextLine();

        boolean isValid = true;

        if (age <= 17) {
            System.out.println("Error: Age must be 17 or above.");
            isValid = false;
        }

        if (!(program.equals("MCA") || program.equals("BCA") || program.equals("MBA"))) {
            System.out.println("Error: Program must be MCA, BCA, or MBA.");
            isValid = false;
        }

        if (String.valueOf(regNo).isEmpty()) {
            System.out.println("Error: Registration number cannot be empty.");
            isValid = false;
        }

        if (isValid) {
            System.out.println("\n====================================");
            System.out.println("        STUDENT IDENTITY CARD");
            System.out.println("====================================");
            System.out.println("Name             : " + name);
            System.out.println("Age              : " + age);
            System.out.println("Program          : " + program);
            System.out.println("Registration No. : " + regNo);
            System.out.println("====================================");
            System.out.println("        Authorized Signature");
            System.out.println("====================================");
        }
        sc.close();
    }
}
