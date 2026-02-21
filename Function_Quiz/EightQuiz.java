package Function_Quiz;
import java.util.Scanner;
class Multiplication1 {
    static void multiply(int a, int b) {
        int mul = a * b;
        System.out.println("The multiplication of two number is: " + mul);
    }
}

public class EightQuiz {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:-> ");
        n1 = sc.nextInt();
        System.out.println("Enter Second Number:-> ");
        n2 = sc.nextInt();
        Multiplication1.multiply(n1, n2);
        sc.close();
    }
}
