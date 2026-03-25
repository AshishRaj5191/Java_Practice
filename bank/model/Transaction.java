package bank.model;

import java.time.LocalDate;

public class Transaction {

    private LocalDate date;
    private double amount;
    private String type;

    public Transaction(double amount, String type) {
        this.date = LocalDate.now();
        this.amount = amount;
        this.type = type;
    }

    @Override
    public String toString() {
        return date + " | " + type + " | ₹" + amount;
    }
}