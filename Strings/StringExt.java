package Strings;
import java.util.Scanner;

class StringExt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter Your Name: ");
        name = sc.nextLine();

        // System.out.println(name);

        for(int i = 0; i < name.length(); i++)
        {
            char ch = name.charAt(i);
            System.out.print(ch);
        }
        sc.close();
    }
}
/*Write a program a string from the user and display each in a list*/
