package lesson10.logging.model;

import lesson10.logging.core.LogEvent;
import lesson10.logging.enums.OperationType;

public class Transfer extends LogEvent {

    private Long amount;
    private String txId;

    public Transfer(OperationType operationType, Long amount, String txId) {
        super(operationType);
        this.amount = amount;
        this.txId = txId;
    }

    @Override
    public String getDetails() {
        return "amount= " + amount + " | txId= " + txId;
    }
}
