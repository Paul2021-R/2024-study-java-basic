package MethodChain;

public class ExampleMethodChainMain {
    public static void main(String[] args) {
        ExampleMethodChain data1 = new ExampleMethodChain(3, 10);
        ExampleMethodChain data2 = data1.add(data1).devide(data1);

        System.out.println(data1);
        System.out.println(data2.toString());
    }
}
