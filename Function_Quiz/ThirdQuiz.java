import java.util.Scanner;
class Multiplication {
    static int multiply(int a, int b) {
        return a * b;
    }
}

public class ThirdQuiz {
    public static void main(String[] args) {
        int n1, n2, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:-> ");
        n1 = sc.nextInt();
        System.out.println("Enter Second Number:-> ");
        n2 = sc.nextInt();
        result = Multiplication.multiply(n1, n2);
        System.out.println("The multiplication of two numbers is: " + result);
        sc.close();
    }
}
