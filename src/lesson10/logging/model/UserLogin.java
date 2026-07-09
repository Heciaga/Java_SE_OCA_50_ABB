package lesson10.logging.model;

import lesson10.logging.core.LogEvent;
import lesson10.logging.enums.OperationType;
import lesson10.logging.enums.Status;

public class UserLogin extends LogEvent {
    private Long userId;
    private Status status;

    public UserLogin(OperationType operationType, Status status, Long userId) {
        super(operationType);
        this.status = status;
        this.userId = userId;
    }

    @Override
    public String getDetails() {
        return "userId= "+ userId + " | status= " + status;
    }
}
