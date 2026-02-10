import java.util.Scanner;
class Division1 {
    static void divide(int a, int b) {
        int div = a / b;
        System.out.println("The division of two number is: " + div);
    }
}

public class NineQuiz {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:-> ");
        n1 = sc.nextInt();
        System.out.println("Enter Second Number:-> ");
        n2 = sc.nextInt();
        Division1.divide(n1, n2);
        sc.close();
    }
}
