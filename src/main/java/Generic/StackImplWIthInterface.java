package Generic;

public class StackImplWIthInterface<T> implements Stack<T> {
    T[] buffer;
    int size;
    int maxSize;

    public StackImplWIthInterface(int maxSize) {
        this.buffer = (T[]) new Object[maxSize];
        this.maxSize = maxSize;
        this.size = 0;
    }

    @Override
    public void push(T item) {
        buffer[size++] = item;
    }

    @Override
    public T pop() {
        return this.buffer[--size];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public int maxSize() {
        return this.maxSize;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }
}
