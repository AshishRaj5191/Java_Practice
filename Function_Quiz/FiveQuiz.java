package Function_Quiz;
import java.util.Scanner;

class Remainder {
    static int modulus(int a, int b) {
        return a % b;
    }
}
public class FiveQuiz {
    public static void main(String[] args) {
        int n1, n2, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:-> ");
        n1 = sc.nextInt();
        System.out.println("Enter Second Number:-> ");
        n2 = sc.nextInt();
        result = Remainder.modulus(n1, n2);
        System.out.println("The subtraction of two numbers is: " + result);
        sc.close();
    }
}
