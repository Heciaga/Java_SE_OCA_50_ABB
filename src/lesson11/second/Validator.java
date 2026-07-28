package lesson11.second;
@FunctionalInterface
public interface Validator<T> {
    boolean validate(T value);
}
