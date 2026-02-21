package Function_Quiz;
import java.util.Scanner;
class Subtraction1 {
    static void subtract(int a, int b) {
        int sub = a - b;
        System.out.println("The subtraction of two number is: " + sub);
    }
}

public class SevenQuiz {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:-> ");
        n1 = sc.nextInt();
        System.out.println("Enter Second Number:-> ");
        n2 = sc.nextInt();
        Subtraction1.subtract(n1, n2);
        sc.close();
    }
}
