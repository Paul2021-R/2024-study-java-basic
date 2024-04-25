package AbstractClass.AnonymousInterface;

public interface Driving {
    default void record() {
        System.out.println("record for Driving");
    }
}
