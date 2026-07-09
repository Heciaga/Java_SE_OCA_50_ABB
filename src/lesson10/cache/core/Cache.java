package lesson10.cache.core;

public interface Cache<T> {
    void save(T value);

    T get();

    void remove();
}
