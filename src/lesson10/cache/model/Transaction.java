package lesson10.cache.model;

public class Transaction {
    private String txId;

    public Transaction(String txId) {
        this.txId = txId;
    }

    @Override
    public String toString() {
        return "Transaction{txId='" + txId + "'}";
    }
}
