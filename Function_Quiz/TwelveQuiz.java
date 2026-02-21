package Function_Quiz;
import java.util.Scanner;
class Check2 {
    // [Return Type]

    // boolean niven(int n) {
    //     int sum = 0;
    //     int temp = n;

    //     while(n > 0) {
    //         int digit = n % 10;
    //         sum = sum + digit; // (n % 10)
    //         n /= 10;
    //     }
    //     return temp % sum == 0;
    // }


    // [Void Type]
    void niven(int n) {
        int sum = 0;
        int temp = n;

        while(n > 0) {
            sum = sum + (n % 10);
            n /= 10;
        }

        if(temp % sum == 0) {
            System.out.println("Number is Niven Number");
        } else {
            System.out.println("Number is NOT Niven Number");
        }
    }
}



public class TwelveQuiz {
    public static void main(String[] args) {
        int n1;
        Check2 obj = new Check2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:-> ");
        n1 = sc.nextInt();

        // [Return Type]
        // if(obj.niven(n1)) {
        //     System.out.println("Number is Niven Number");
        // } else {
        //     System.out.println("Number is NOT Niven Number");
        // }

        // [Void Type]
        obj.niven(n1);
        sc.close();
    }
}
