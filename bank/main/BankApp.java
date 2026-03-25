package bank.main;

import bank.model.*;
import bank.util.Validator;
import java.util.*;

public class BankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Full Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Nickname (optional): ");
        String nickname = sc.nextLine();

        System.out.print("Enter DOB (dd/mm/yyyy): ");
        String dob = sc.nextLine();

        System.out.println("1. Savings\n2. Current");
        int choice = sc.nextInt();
        sc.nextLine();

        BankAccount acc;

        if (choice == 1)
            acc = new SavingsAccount(name, dob);
        else
            acc = new CurrentAccount(name, dob);
        acc.setNickname(nickname);

        // Password setup
        String password;
        do {
            System.out.print("Set Password: ");
            password = sc.nextLine();
        } while (!Validator.isValidPassword(password));

        // PIN setup
        String pin;
        do {
            System.out.print("Set PIN: ");
            pin = sc.nextLine();
        } while (!Validator.isValidPin(pin, dob));

        System.out.println("Account Created!");
        System.out.println("Account No: " + acc.getAccountNumber());

        while (true) {
            System.out.println("\n1.Deposit 2.Withdraw 3.Balance 4.Transactions 5.Account Details 6.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Amount: ");
                    acc.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Amount: ");
                    acc.withdraw(sc.nextDouble());
                    break;

                case 3:
                    acc.checkBalance();
                    break;

                case 4:
                    acc.showTransactions();
                    break;

                case 5:
                    System.out.println("Name: " + acc.getDisplayName());
                    System.out.println("Account No: " + acc.getAccountNumber());
                    break;

                case 6:
                    System.exit(0);
            }
            sc.close();
        }
    }
}
