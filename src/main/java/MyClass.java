import org.jetbrains.annotations.Nullable;

public class MyClass {
    int x;
    int y;
    int z;
    final String finalKeyword = "this is an only read-only String value";
    MyClass(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    MyClass() {
        this(-1, -1, -1);
    }

    void setValues(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void printMyClass() {
        System.out.println("print values: " + this.x + " / " + this.y + " / " + this.z);
    }

    void printArgs(int ... v) {
        System.out.print("가변인자를 출력합니다.(" + v.length + ")");

        for (int x: v) {
            System.out.print(" " + x);
        }
        System.out.print('\n');
    }

    void printArgs(long k, int ... v) {
        System.out.print("가변인자를 출력합니다.(" + v.length + " / k : " + k + " )");

        for (int x: v) {
            System.out.print(" " + x);
        }
        System.out.print('\n');

    }
}