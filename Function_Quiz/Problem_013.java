import java.util.Scanner;
class Calculator {
    int add(int n1, int n2) {
        return n1 + n2;
    }

    int sub(int n1, int n2) {
        return n1 - n2;
    }

    int multiply(int n1, int n2) {
        return n1 * n2;
    }

    double que(int n1, int n2) {
        if(n1 > n2) {
            return (double) n1 / n2;
        } else {
            return (double) n2 / n1;
        }
    }

    int rem(int n1, int n2) {
        return n1 % n2;
    }
}

public class Problem_013 {
    public static void main(String[] args) {
        int n1, n2;
        char choice;
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();
        do {
            System.out.print("\nEnter First Number:-> ");
            n1 = sc.nextInt();
            System.out.println("\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Remainder");
            System.out.print("\nEnter your choice:-> ");
            int ch = sc.nextInt();
            System.out.print("\nEnter Second Number:-> ");
            n2 = sc.nextInt();

            switch(ch) {
                case 1 -> {
                    System.out.println("\nResult-> " + cal.add(n1, n2));
                }
                case 2 -> {
                    System.out.println("\nResult-> " + cal.sub(n1, n2));
                }
                case 3 -> {
                    System.out.println("\nResult-> " + cal.multiply(n1, n2));
                }
                case 4 -> {
                    if(n2 != 0) {
                        System.out.println("\nResult-> " + cal.que(n1, n2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                }
                case 5 -> {
                    System.out.println("\nResult-> " + cal.rem(n1, n2));
                }
                default -> {
                    System.out.println("Invalid Choice");
                }
            }
            System.out.println("\nDo you want to continue? (y/n): ");
            choice = sc.next().charAt(0);
        }while(choice == 'y' || choice == 'Y');

        sc.close();
    }
}
