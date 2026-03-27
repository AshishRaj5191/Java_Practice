package bank.model;
import bank.service.BankServices;
import java.util.*;

public abstract class BankAccount implements BankServices {

    private static int totalAccounts = 0;

    private int accountNumber;
    private String fullName;
    private String firstName;
    private String dob;
    private int age;
    private String guardianName;
    private String guardianRelation;
    private double balance;

    private String nickname; // Flair Feature

    protected String password;
    protected String pin;

    protected ArrayList<Transaction> transactions = new ArrayList<>();

    // Default Constructor
    public BankAccount() {
        this.accountNumber = new Random().nextInt(100000);
        totalAccounts++;
    }

    // Parameterized Constructor
    public BankAccount(String fullName, String dob) {
        this();
        this.fullName = fullName;
        this.firstName = fullName.split(" ")[0];
        this.dob = dob;
        this.age = calculateAge(dob);
        this.balance = 0;
    }

    private int calculateAge(String dob) {
        int year = Integer.parseInt(dob.split("/")[2]);
        return 2026 - year;
    }

    public void setGuardian(String name, String relation) {
        this.guardianName = name;
        this.guardianRelation = relation;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        if (balance >= -5000) {
            this.balance = balance;
        }
    }

    // Flair Feature Methods
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getDisplayName() {
        return (nickname != null && !nickname.isEmpty()) ? nickname : firstName;
    }

    // Abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void checkBalance();

    // Overloading
    public void deposit(double amount, String desc) {
        deposit(amount);
        transactions.add(new Transaction(amount, "Deposit: " + desc));
    }

    public void withdraw(double amount, String purpose) {
        withdraw(amount);
        transactions.add(new Transaction(amount, "Withdraw: " + purpose));
    }

    @Override
    public void changePassword() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new password: ");
        password = sc.nextLine();
    }

    @Override
    public void changePin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new PIN: ");
        pin = sc.nextLine();
    }

    public void addTransaction(double amount, String type) {
        transactions.add(new Transaction(amount, type));
    }

    public void showTransactions() {
        int count = 0;
        for (int i = transactions.size() - 1; i >= 0 && count < 5; i--) {
            System.out.println(getDisplayName() + " -> " + transactions.get(i));
            count++;
        }
    }
}