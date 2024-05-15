package Generic;

public class GenericMain {
    public static void main(String[] args) {
        StackImpl<Integer> arr = new StackImpl<Integer>(10);
        System.out.println(arr.size());
        arr.push(10);
        arr.push(20);
        arr.push(30);
        arr.push(40);
        System.out.println(arr.pop());
        System.out.println(arr.pop());
        System.out.println(arr.pop());
        System.out.println(arr.pop());

        System.out.println(arr.isMax());
        System.out.println(arr.maxSize());
        System.out.println(arr.size());
    }
}
