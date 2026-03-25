package ClassAssignment;
import java.util.*;
import java.text.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

// Interface
interface BankServices {
    void changePassword();
    void changePin();
}

// Transaction Class
class Transaction {
    String date;
    double amount;
    String type;

    Transaction(String type, double amount) {
        this.date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
        this.amount = amount;
        this.type = type;
    }

    public String toString() {
        return date + " | " + type + " | ₹" + amount;
    }
}

// Abstract Class
abstract class BankAccount implements BankServices {
    private static int totalAccounts = 0;

    private int accountNumber;
    private String fullName;
    private String firstName;
    private String dob;
    private int age;
    private String guardianName;
    private String guardianRelation;
    private double balance;
    private String password;
    private String pin;

    protected ArrayList<Transaction> transactions = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    // Constructor
    BankAccount() {
        this.accountNumber = new Random().nextInt(900000) + 100000;
        totalAccounts++;
    }

    BankAccount(String fullName, String dob) {
        this();
        this.fullName = fullName;
        this.firstName = fullName.split(" ")[0];
        this.dob = dob;
        this.age = calculateAge(dob);

        if (age < 18) {
            System.out.print("Enter Guardian Name: ");
            this.guardianName = sc.nextLine();
            System.out.print("Enter Relation: ");
            this.guardianRelation = sc.nextLine();
        }
    }

    // Age Calculation
    private int calculateAge(String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter);
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    // Encapsulation
    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        if (balance >= -5000) {
            this.balance = balance;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    // Password Setup
    public void setupPassword() {
        int attempts = 0;
        while (attempts < 3) {
            System.out.print("Set Password: ");
            String pass = sc.nextLine();

            if (pass.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$")) {
                this.password = pass;
                break;
            } else {
                System.out.println("Invalid Password!");
                attempts++;
            }
        }
    }

    // PIN Setup
    public void setupPin() {
        while (true) {
            System.out.print("Set 4-digit PIN: ");
            String p = sc.nextLine();

            if (p.matches("\\d{4}") && !dob.contains(p)) {
                this.pin = p;
                break;
            } else {
                System.out.println("Invalid PIN!");
            }
        }
    }

    // Login
    public boolean login() {
        int attempts = 3;
        while (attempts-- > 0) {
            System.out.print("Enter Password: ");
            String p = sc.nextLine();
            if (p.equals(password)) return true;
            System.out.println("Wrong Password!");
        }
        System.out.println("Account Locked!");
        return false;
    }

    // Interface Methods
    public void changePassword() {
        setupPassword();
    }

    public void changePin() {
        setupPin();
    }

    // Abstract Methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void checkBalance();

    // Overloading
    public void deposit(double amount, String desc) {
        deposit(amount);
        transactions.add(new Transaction("Deposit (" + desc + ")", amount));
    }

    public void withdraw(double amount, String purpose) {
        withdraw(amount);
        transactions.add(new Transaction("Withdraw (" + purpose + ")", amount));
    }

    // Show Transactions
    public void showTransactions() {
        System.out.println("\nLast Transactions:");
        int count = 0;
        for (int i = transactions.size() - 1; i >= 0 && count < 5; i--) {
            System.out.println(transactions.get(i));
            count++;
        }
    }

    public void showDetails() {
        System.out.println("Name: " + firstName);
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

// Savings Account
class SavingsAccount extends BankAccount {

    private final double MIN_BALANCE = 500;

    SavingsAccount(String name, String dob) {
        super(name, dob);
    }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            transactions.add(new Transaction("Deposit", amount));
        } else {
            System.out.println("Invalid amount!");
        }
    }

    // Withdraw (STRICT minimum balance rule)
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }

        if (getBalance() - amount >= MIN_BALANCE) {
            setBalance(getBalance() - amount);
            transactions.add(new Transaction("Withdraw", amount));
        } else {
            System.out.println("❌ Cannot withdraw! Minimum balance ₹500 must be maintained.");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: ₹" + getBalance());
    }

    // Interest (required feature)
    public void calculateInterest() {
        double interest = getBalance() * 0.04;
        setBalance(getBalance() + interest);
        System.out.println("Interest Added: ₹" + interest);
    }
}

// Current Account
class CurrentAccount extends BankAccount {

    CurrentAccount(String name, String dob) {
        super(name, dob);
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        transactions.add(new Transaction("Deposit", amount));
    }

    public void withdraw(double amount) {
        if (getBalance() - amount >= -5000) {
            setBalance(getBalance() - amount);
            transactions.add(new Transaction("Withdraw", amount));
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: ₹" + getBalance());
    }
}

// Main Class
public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Full Name: ");
        String name = sc.nextLine();

        System.out.print("Enter DOB (dd/MM/yyyy): ");
        String dob = sc.nextLine();

        System.out.println("1. Savings\n2. Current");
        int choice = sc.nextInt();
        sc.nextLine();

        BankAccount acc;

        if (choice == 1) {
            acc = new SavingsAccount(name, dob);
        } else {
            acc = new CurrentAccount(name, dob);
        }

        System.out.println("Account Created! No: " + acc.getAccountNumber());

        acc.setupPassword();
        acc.setupPin();

        if (!acc.login()) return;

        while (true) {
            System.out.println("\n1.Deposit\n2.Withdraw\n3.Balance\n4.Change Pass\n5.Change PIN\n6.Details\n7.Exit");
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
                    acc.changePassword();
                    break;
                case 5:
                    acc.changePin();
                    break;
                case 6:
                    acc.showDetails();
                    break;
                case 7:
                    acc.showTransactions();
                    System.exit(0);
            }
            sc.close();
        }
    }
}
