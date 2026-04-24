package inClass_assignment_1.bank_app.model;

public class CurrentAccount extends BankAccount {

    private final double OVERDRAFT = 5000;

    public CurrentAccount(String name, String dob) {
        super(name, dob);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        addTransaction(amount, "Deposit");
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= -OVERDRAFT) {
            setBalance(getBalance() - amount);
            addTransaction(amount, "Withdraw");
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Balance: ₹" + getBalance());
    }
}
