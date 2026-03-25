package bank.model;

public class SavingsAccount extends BankAccount {

    private final double MIN_BALANCE = 500;

    public SavingsAccount(String name, String dob) {
        super(name, dob);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        addTransaction(amount, "Deposit");
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= MIN_BALANCE) {
            setBalance(getBalance() - amount);
            addTransaction(amount, "Withdraw");
        } else {
            System.out.println("Minimum balance ₹500 required");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Balance: ₹" + getBalance());
    }

    public void calculateInterest() {
        double interest = getBalance() * 0.04;
        System.out.println("Interest: ₹" + interest);
    }
}