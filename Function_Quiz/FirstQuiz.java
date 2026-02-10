import java.util.Scanner;
public class FirstQuiz {
    static int addTwoNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int n1, n2, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:-> ");
        n1 = sc.nextInt();
        System.out.println("Enter Second Number:-> ");
        n2 = sc.nextInt();
        result = addTwoNumbers(n1, n2);
        System.out.println("The sum of two numbers is: " + result);
        sc.close();
    }
}
