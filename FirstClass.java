import java.util.Scanner;
public class FirstClass {
    public static void main(String[] args) {
        // float subject1 = 45;
        // float subject2 = 95;
        // float subject3 = 48;
        // float cgpa = (subject1 + subject2 + subject3)/30;
        // System.out.println(cgpa);


        // System.out.println("What is your name");
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // System.out.println("Hello " + name + " have a good day!");
        

        System.out.println("Enter Your number");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(sc.hasNextInt());
        sc.close();

    }
}