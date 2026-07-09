package lesson10.logging.model;

import lesson10.logging.core.LogEvent;
import lesson10.logging.enums.OperationType;
import lesson10.logging.enums.RiskStatus;

public class RiskCheck extends LogEvent {
    private Integer score;
    private RiskStatus riskStatus;

    public RiskCheck(OperationType operationType, Integer score, RiskStatus riskStatus) {
        super(operationType);
        this.score = score;
        this.riskStatus = riskStatus;
    }

    @Override
    public String getDetails() {
        return "score= " + score + " | status= " + riskStatus;
    }
}
