package AbstractClass.AnonymousInterface;

public interface Swiming {
    default void record() {
        System.out.println("record for Swimming");
    }
}
