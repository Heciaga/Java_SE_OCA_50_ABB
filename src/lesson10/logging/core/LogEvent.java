package lesson10.logging.core;

import lesson10.logging.enums.OperationType;

public abstract class LogEvent {
    private final OperationType operationType;

    protected LogEvent(OperationType operationType) {
        this.operationType = operationType;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public abstract String getDetails();
}
