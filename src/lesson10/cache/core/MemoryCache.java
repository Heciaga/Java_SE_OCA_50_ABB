package lesson10.cache.core;

public class MemoryCache<T> implements Cache<T> {
    private T value;

    @Override
    public void save(T value) {
        this.value = value;
    }

    @Override
    public T get() {
        return value;
    }

    @Override
    public void remove() {
        value = null;
    }
}
