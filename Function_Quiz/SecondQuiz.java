package Function_Quiz;
import java.util.Scanner;
class Subtraction {
        static int subtract(int a, int b) {
            return a - b;
        }
    }
public class SecondQuiz {
    public static void main(String[] args) {
        int n1, n2, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:-> ");
        n1 = sc.nextInt();
        System.out.println("Enter Second Number:-> ");
        n2 = sc.nextInt();
        result = Subtraction.subtract(n1, n2);
        
        System.out.println("The subtraction of two numbers is: " + result);
        sc.close();
    }
}

