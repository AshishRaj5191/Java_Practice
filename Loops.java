import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        // int i=0;
        // while(i<=10) {
        //     System.out.println(i);
        //     i+=1;
        // }

        // int i=0;
        // do {
        //     System.out.println(i);
        //     i+=1;
        // } while(i<10);

        int n;
        System.out.println("Enter a Number -> ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        //for (int i = 0; i < n; i++) {
            // if(i%2 == 0) {
            //     System.out.println("\nEven Number ->");
            //     System.out.println("This is a Even Number-> "+i);
            // }
            // else {
            //     System.out.println("\nODD Number ->");
            //     System.out.println("This is a ODD Numbers-> "+i);
            // }

            //System.out.println(2 * i + 1);
        //}

        // for (int i = n; i !=0; i--) {
        //     System.out.println(i);
            
        // }

        // for(int i = n; i > 0; i--) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.print("\n");
        // }

        // int total = 0;
        // for(int i=0; i<n; i++) {
        //     total += (2*i);
        // }
        // System.out.print("Sum of even numbers is -> ");
        // System.out.println(total);


        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n*i); 
        }


    }
}