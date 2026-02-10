import java.util.Scanner;
class Merchant {
    void profit(int cp, int sp) {
        double prof = sp - cp;
        double profitPercentage = (prof / cp) * 100;
        System.out.println("\nProfit Percentage is:-> " + profitPercentage + "%");
    }

    void loss(int cp, int sp) {
        double los = cp - sp;
        double lossPercentage = (los / cp) * 100;
        System.out.println("\nLoss Percentage is:-> " + lossPercentage + "%");
    }
}

public class Problem_014 {
    public static void main(String[] args) {
        int n1, n2, ch;
        Merchant obj = new Merchant();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost Price:-> ");
        n1 = sc.nextInt();
        System.out.print("Enter Selling Price:-> ");
        n2 = sc.nextInt();
        System.out.println("\n1. Profit\n2. Loss");
        System.out.print("\nEnter your choice:-> ");
        ch = sc.nextInt();

        switch(ch) {
            case 1 -> {
                if(n2 > n1) {
                    obj.profit(n1, n2); 
                } else {
                    System.out.println("No Profit Made");
                }
            }
            case 2 -> {
                if(n1 > n2) {
                    obj.loss(n1, n2);
                } else {
                    System.out.println("No Loss Made");
                }
            }
            default -> {
                System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
