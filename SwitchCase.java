import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your Age-: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        // switch (age) {
        //     case 12:
        //         System.out.println("You are 12 years old");
        //         break;
                
        //     case 15:
        //         System.out.println("You are 15 years old");
        //         break;
        //     case 18:
        //         System.out.println("You are 18 years old");
        //         break;
        //     default:
        //         System.out.println("Your age is not special");
        // }

        switch (age) {
            case 7 -> {
                System.out.println("Your Age is 7 Year old");
            }
            case 12 -> {System.out.println("Your Age is 12 Year old");}
            case 15 -> System.out.println("Your Age is 15 Year old");
            case 18 -> System.out.println("Your Age is 18 Year old");
            default -> System.out.println("Your Age is not Special");
        }
        sc.close();
    }
}