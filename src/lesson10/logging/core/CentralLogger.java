package lesson10.logging.core;

public class CentralLogger {
    public <T extends LogEvent> void log(T event) {
        System.out.println(event.getOperationType() + " | " + event.getDetails());
    }
}
