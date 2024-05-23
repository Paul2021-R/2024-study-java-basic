package Generic;

public interface Stack<T> {
    void push(T item);
    T pop();
    int size();
    int maxSize();
    boolean isEmpty();
}
