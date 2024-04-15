package InnerClass;

public class ExampleInnerStaticClass {
    // Inner 클래스에 static 예약어를 사용하여 정적 클래스를 정의하고, 이럴 땐 inner 클래스는 정적 클래스로 구성되어야 한다.
    private static String outerValue = "외부 필드값";
    public static class InnerClass {
        public String innerValue = "내부 필드값";

        void display() {
            System.out.printf("outerValue = %s, innerValue = %s\n", outerValue, innerValue);
        }

    }
}
