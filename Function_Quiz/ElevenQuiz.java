package Function_Quiz;
import java.util.Scanner;
class Check {
    // Return Type

    // boolean palin(int n) {
    //     int temp = n;
    //     int reverse = 0;

    //     while(n > 0) {
    //         int digit = n % 10;
    //         reverse = reverse * 10 + digit;
    //         n /= 10;
    //     }
    //     return temp == reverse;
    // }


    // Void Type
    void palin(int n) {
        int temp = n;
        int reverse = 0;

        while(n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        if(temp == reverse) {
            System.out.println("Numbers is Palindrome");
        } else {
            System.out.println("Numbers is NOT Palindrome");

        }
    }
}

public class ElevenQuiz {
    public static void main(String[] args) {
        int n1;
        Check obj = new Check();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:-> ");
        n1 = sc.nextInt();

        // Return Type

        // if(obj.palin(n1)) {
        //     System.out.println("Numbers is Palindrome");
        // } else {
        // System.out.println("Numbers is NOT palindrome");
        // }

        // Void Type
        obj.palin(n1);
        
        sc.close();
    }
}
