package lesson11.firsr;

public class Main {
    public static void main(String[] args) {
        MathOperation sum = Integer::sum;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        MathOperation.calculate(2, 5, sum);
        MathOperation.calculate(2, 5, multiplication);
        MathOperation.calculate(2, 5, division);
    }
}
