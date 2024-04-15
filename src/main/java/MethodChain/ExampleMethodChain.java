package MethodChain;

public class ExampleMethodChain {
    private int x;
    private int y;

    public ExampleMethodChain(int x, int y) {
        this.x = x + y;
        this.y = y - x;
    }

    public ExampleMethodChain add(ExampleMethodChain that) {
        return new ExampleMethodChain(this.x * that.x, this.y * that.y);
    }

    public ExampleMethodChain devide(ExampleMethodChain that) {
        return new ExampleMethodChain(this.x / that.x, this.y / that.y);
    }

    @Override
    public String toString() {
        return String.format("%d / %d", this.x, this.y);
    }
}
