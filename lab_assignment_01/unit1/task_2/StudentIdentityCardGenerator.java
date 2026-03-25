package lab_assignment_01.unit1.task_2;
import java.util.Scanner;

public class StudentIdentityCardGenerator {
    public static void main(String[] args){
        String name;
        String program;
        int age;
        String regNo;
        boolean isValid = true;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        sc.nextLine();
        if (age < 17) {
            System.out.println("Error: you are not eligible.");
            isValid = false;
            sc.close();
            return;
        }

        System.out.println("Enter your Program (MCA/BCA/MBA): ");
        program = sc.nextLine().toUpperCase();
        System.out.println("Enter your Registration No.: ");
        regNo = sc.nextLine();


        

        if (!(program.equals("MCA") || program.equals("BCA") || program.equals("MBA"))) {
            System.out.println("Error: Program must be MCA, BCA, or MBA.");
            isValid = false;
        }

        while (String.valueOf(regNo).isEmpty()) {
        
            System.out.println("Error: Registration number cannot be empty.");
            isValid = false;
            System.out.println("Enter your Registration No.: ");
            regNo = sc.nextLine();
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
