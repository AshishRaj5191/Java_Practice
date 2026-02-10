import java.util.Scanner;
public class PracticeSet4 {
    public static void main(String[] args) {
        // Problem 1
        // int a = 10;
        
        // if(a=11){ // Compilation Error: cannot convert from int to boolean
        //     System.out.println("I am 11");
        // } else{
        //     System.out.println("I am not 11");
        // }

        // Problem 2

        // byte math;
        // byte phy;
        // byte chem;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter marks of Maths-: ");
        // math = sc.nextByte();
        // System.out.println("Enter marks of Physics-: ");
        // phy = sc.nextByte();
        // System.out.println("Enter marks of Chemistry-:");
        // chem = sc.nextByte();
        // float avg = (math + phy + chem) / 3.0f;
        // System.out.println("Your overall percentage is-: " + avg);
        // if (avg >= 40 && math >= 33 && phy >= 33 && chem >= 33){
        //     System.out.println("Congratulations! You have been promoted.");
        // } else {
        //     System.out.println("Sorry! You have not been promoted.");
        // }

        // Problem 3

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your Income in LPA-: ");
        // float income = sc.nextFloat();
        // float tax = 0;

        // if (income <= 2.5f){
        //     tax = tax + 0;
        // } else if (income > 2.5f && income <= 5f){
        //     tax = tax + 0.05f * (income - 2.5f);
        // } else if (income > 5f && income <= 10f){
        //     tax = tax + 0.05f * (5f - 2.5f);
        //     tax = tax + 0.2f * (income - 5f);
        // } else if (income > 10f){
        //     tax = tax + 0.05f * (5f - 2.5f);
        //     tax = tax + 0.2f * (10f - 5f);
        //     tax = tax + 0.3f * (income - 10f);
        // }

        // System.out.println("The total tax paid by the employee is-: " + tax);

        // Problem 4

        // int day;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter day number-: ");
        // day = sc.nextInt();
        // switch (day) {
        //     case 1 -> {
        //         System.out.println("Monday");
        //     }
        //     case 2 -> {
        //         System.out.println("Tuesday");
        //     }
        //     case 3 -> {
        //         System.out.println("Wednesday");
        //     }
        //     case 4 -> {
        //         System.out.println("Thursday");
        //     }
        //     case 5 -> {
        //         System.out.println("Friday");
        //     }
        //     case 6 -> {
        //         System.out.println("Saturday");
        //     }
        //     case 7 -> {
        //         System.out.println("Sunday");
        //     }
        // }



        // Problem 5
        String website;
        System.out.println("Enter website URL-: ");
        Scanner sc = new Scanner(System.in);
        website = sc.next();
        if (website.endsWith(".org")) {
            System.out.println("This is an Organizational Website");
        } else if (website.endsWith(".com")) {
            System.out.println("This is a Commercial Website");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an Indian Website");
        } else if (website.endsWith(".gov")) {
            System.out.println("This is a Government Website");
        } else if(website.endsWith(".edu")) {
            System.out.println("This is an Educational Website");
        } else if(website.endsWith(".net")) {
            System.out.println("This is a Network Website");
        } else if(website.endsWith(".mil")) {
            System.out.println("This is a military Website");
        } else if(website.endsWith(".info")) {
            System.out.println("This is an Informational Website");
        } else if(website.endsWith(".biz")) {
            System.out.println("This is a Business Website");
        } else if(website.endsWith(".co")) {
            System.out.println("This is a Company Website");
        } else if(website.endsWith(".us")) {
            System.out.println("This is a United States Website");
        } else if(website.endsWith(".uk")) {
            System.out.println("This is a United Kingdom Website");
        } else if(website.endsWith(".ca")) {
            System.out.println("This is a Canadian Website");
        } else if(website.endsWith(".au")) {
            System.out.println("This is an Australian Website");
        } else {
            System.out.println("Unknown Website Type");
        }

    }
}
