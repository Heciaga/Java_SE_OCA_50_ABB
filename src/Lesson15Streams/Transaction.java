package Lesson15Streams;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private int id;
    private String customerName;
    private TransactionType transactionType;
    private double amount;
    private Priority priority;
    private final int sequenceNumber;
    private final LocalDateTime createdAt;

    public Transaction(int id, String customerName, TransactionType transactionType,
                       double amount, Priority priority,
                       int sequenceNumber) {
        this.customerName = customerName;
        this.id = id;
        this.transactionType = transactionType;
        this.amount = amount;
        this.priority = priority;
        this.sequenceNumber = sequenceNumber;
        this.createdAt = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        return String.format(
                "%d | %s | %s | %.2f AZN | %s | sequence=%d | %s",
                id,
                customerName,
                transactionType,
                amount,
                priority,
                sequenceNumber,
                createdAt.format(formatter)
        );
    }
}
