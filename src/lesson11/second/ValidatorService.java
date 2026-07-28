package lesson11.second;

public class ValidatorService {
    public static <T> void check(T value, Validator<T> validator) {
        if (validator.validate(value)) {
            System.out.println("Valid value");
        } else {
            System.out.println("Invalid value");
        }
    }
}
