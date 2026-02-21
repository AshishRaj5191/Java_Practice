package Function_Quiz;
import java.util.Scanner;
class Project {
    // [Checking Palindrome Number]
    int palindrome(int n) {
        int temp = n;
        int reverse = 0;

        while(n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        if(temp == reverse) {
            return 1;
        } else {
            return 0;
        }
    }


    // [Checking Armstrong Number]
    void armstrong(int n) {
        int temp = n;
        int result = 0;

        while(n > 0) {
            int digit = n % 10;
            result = result + digit * digit * digit;    //Math.pow(digit, 3);
            n /= 10;
        }

        if(temp == result) {
            System.out.println("Number is Armstrong Number");
        } else {
            System.out.println("Number is not Armstrong Number");
        }
    }


    // [Checking Perfect Number]
    int perfect(int n) {
        int sum = 0;

        for(int i = 1; i<=n/2; i++) {
            sum += i;
        }

        if(sum == n) {
            return 1;
        } else {
            return 0;
        }
    }


    // [Checking Niven Number]
    void niven(int n) {
        int temp = n;
        int sum = 0;

        while(n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }

        if(temp % sum == 0) {
            System.out.println("Number is Niven Number");
        } else {
            System.out.println("Number is NOT Niven Number");
        }
    }


    // [Checking Neon Number]
    int neon(int n) {
        int square = n * n;
        int sum = 0;

        while(square > 0) {
            int digit = square % 10;
            sum += digit;
            square /= 10;
        }

        if(sum == n) {
            return 1;
        } else {
            return 0;
        }
    }

    // [Checking Twisted Prime Number]
    void twistedprime(int n) {
        int temp = n, reverse = 0, count1 = 0, count2 = 0;

        while(n > 0) {
            int digit =  n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        for(int i=1; i<=temp; i++) {
            if(temp % i == 0) {
                count1++;
            }
        }

        for(int i=1; i<=reverse; i++) {
            if(reverse % i == 0) {
                count2++;
            }
        }

        if(count1 == 2 && count2 == 2) {
            System.out.println("Number is Twisted Prime Number");
        } else {
            System.out.println("Number is NOT Twisted Prime Number");
        }
    }


}

public class Problem_015 {
    public static void main(String[] args) {
        int n1;
        char choice;
        Scanner sc = new Scanner(System.in);
        Project obj = new Project();
        
        do {
            System.out.println("Enter the Number:-> ");
            n1 = sc.nextInt();


            System.out.println("\n1. Palindrome Number\n2. Armstrong Number\n3. Perfect Number\n4. Niven Number\n5. Neon Number\n6. Twisted Prime Number");

            System.out.println("\nEnter your choice:-> ");
            int ch = sc.nextInt();

            switch(ch) {
                case 1 -> {
                    if(obj.palindrome(n1) == 1) {
                        System.out.println("Number is Palindrome Number");
                    } else {
                        System.out.println("Number is NOT Palindrome Number");
                    }
                }
                case 2 -> {
                    obj.armstrong(n1);
                }
                case 3 -> {
                    if(obj.perfect(n1) == 1) {
                        System.out.println("Number is Perfect Number");
                    } else {
                        System.out.println("Number is NOT Perfect Number");
                    }
                }
                case 4 -> {
                    obj.niven(n1);
                }
                case 5 -> {
                    if(obj.neon(n1) == 1) {
                        System.out.println("Number is Neon Number");
                    } else {
                        System.out.println("Number is NOT Neon Number");
                    }
                }
                case 6 -> {
                    obj.twistedprime(n1);
                }
                default -> {
                    System.out.println("Invalid choice");
                }
            }
            System.out.println("\nDo you want to continue (y/n):-> ");
            choice = sc.next().charAt(0);
        }while(choice == 'y' || choice == 'Y');

        sc.close();
    }
}
