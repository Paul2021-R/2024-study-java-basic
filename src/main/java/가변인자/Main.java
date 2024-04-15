package 가변인자;

public class Main {
    public static void main(String[] argv) {
        MyClass obj1 = new MyClass(3, 2, 1);
        obj1.printMyClass();

        obj1.printArgs(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0);

        long k = 242324513l;
        obj1.printArgs(k, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0);
        System.out.println(obj1.finalKeyword);

        obj1.setValues(10, 12, 13);
        obj1.printMyClass();

        final MyClass obj2 = new MyClass();
    }
}
