package InnerClass;

public class InnerClassMain {
    public static void main(String[] args) {
        ExampleInnerClass obj = new ExampleInnerClass();
        obj.test();
        obj.test2();

        // 이런 식으로 초기화도 가능하다. inner 클래스에 접근이 가능해지고,
        ExampleInnerClass.InnerClass innerObj = new ExampleInnerClass().new InnerClass();
        innerObj.display2();
    }
}
