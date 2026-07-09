package lesson10.logging;


import lesson10.logging.core.CentralLogger;
import lesson10.logging.enums.OperationType;
import lesson10.logging.enums.RiskStatus;
import lesson10.logging.enums.Status;
import lesson10.logging.model.RiskCheck;
import lesson10.logging.model.Transfer;
import lesson10.logging.model.UserLogin;

public class Main {
    public static void main(String[] args) {
        CentralLogger logger = new CentralLogger();

        logger.log(new UserLogin(OperationType.UserLoginLog, Status.SUCCESS, 250L));
        logger.log(new Transfer(OperationType.TransferLog,1400L,"txt1"));
        logger.log(new RiskCheck(OperationType.RiskCheckLog,15, RiskStatus.APPROVED));
    }
    //create new branch
}