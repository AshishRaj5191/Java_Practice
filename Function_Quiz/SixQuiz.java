package Function_Quiz;
import java.util.Scanner;
class Addition1 {
    static void add(int a, int b) {
        int sum = a + b;
        System.out.println("The addition of two number is: " + sum);
    }
}

public class SixQuiz {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:-> ");
        n1 = sc.nextInt();
        System.out.println("Enter Second Number:-> ");
        n2 = sc.nextInt();
        Addition1.add(n1, n2);
        sc.close();
    }
}
