package Generic;

public class StackImpl<T> {
    private T[] buffer;
    private int maxSize;
    private int count;
    public StackImpl(int count) {
        this.buffer = (T[]) new Object[count];
        this.maxSize = count;
        this.count = 0;
    }

    public T pop() {
        return this.buffer[--this.count];
    }

    public void push(T item) {
        this.buffer[this.count++] = item;
    }

    public int size() {
        return this.count;
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public boolean isMax() {
        return this.maxSize == this.count;
    }

    public int maxSize() {
        return this.maxSize;
    }
}
