package Singleton;

public class mainSingleton {
    public static void main(String[] args) {
        ExampleSingleton data1 = ExampleSingleton.getInstance();
        ExampleSingleton data2 = ExampleSingleton.getInstance();

        data1.setValue("hello world!");

        System.out.println(data1.getValue());
        System.out.println(data2.getValue());


        data2.setValue("hello down world");

        System.out.println(data2.getValue());
        System.out.println(data1.getValue());
    }
}
