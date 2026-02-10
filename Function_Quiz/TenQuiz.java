import java.util.Scanner;
class Remainder1 {
    static void modulus(int a, int b) {
        int mod = a % b;
        System.out.println("The modulus of two number is: " + mod);
    }
}

public class TenQuiz {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:-> ");
        n1 = sc.nextInt();
        System.out.println("Enter Second Number:-> ");
        n2 = sc.nextInt();
        Remainder1.modulus(n1, n2);
        sc.close();
    }
}
