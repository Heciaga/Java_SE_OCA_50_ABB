package Lesson15Streams;

import java.util.*;

public class TransactionService {
    private final PriorityQueue<Transaction> processingQueue;
    private final Deque<Transaction> history;

    public TransactionService() {
        processingQueue = new PriorityQueue<>(
                Comparator
                        .comparing(Transaction::getPriority)
                        .thenComparing(Transaction::getSequenceNumber)
        );
        history = new ArrayDeque<>();
    }

    public void addTransaction(Transaction transaction) {
        processingQueue.offer(transaction);
    }

    public void processTransactions() {
        while (!processingQueue.isEmpty()) {
            Transaction transaction = processingQueue.poll();
            System.out.println(transaction);
            history.addFirst(transaction);
        }
    }

    public void showHistory() {
        for (Transaction transaction : history) {
            System.out.println(transaction);
        }
    }

    public List<Transaction> findAboveAmount(double amount) {
        return history.stream()
                .filter(transaction -> transaction.getAmount() > amount)
                .sorted(Comparator
                        .comparing(Transaction::getPriority)
                        .thenComparing(Transaction::getSequenceNumber))
                .toList();
    }

    public List<Transaction> findTransfers() {
        return history.stream()
                .filter(transaction -> transaction.getTransactionType() == TransactionType.TRANSFER)
                .toList();
    }

    public List<Transaction> sortByAmount() {
        return history.stream()
                .sorted(Comparator.comparing(Transaction::getAmount))
                .toList();
    }

    public double getTotalAmount() {
        return history.stream()
                .mapToDouble(Transaction::getAmount)
                .sum();
    }

    public Optional<Transaction> getLargestTransaction() {
        return history.stream()
                .max(Comparator.comparing(Transaction::getAmount));
    }

    public void browseHistory() {
        Iterator<Transaction> iterator = history.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
