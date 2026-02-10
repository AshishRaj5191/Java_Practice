import java.util.Scanner;
class Division {
    static float divide(float a, float b) {
        return a / b;
    }
}

public class FourQuiz {
    public static void main(String[] args) {
        float n1, n2, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:-> ");
        n1 = sc.nextFloat();
        System.out.println("Enter Second Number:-> ");
        n2 = sc.nextFloat();
        result = Division.divide(n1, n2);
        System.out.println("The division of two numbers is: " + result);
        sc.close();
    }
}
