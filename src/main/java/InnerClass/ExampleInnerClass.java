package InnerClass;

public class ExampleInnerClass {
    private String outerValue = "외부 필드값";
    private String value = "외부 필드 값이지만 변수명이 value이다";
    public class InnerClass {
        public String innerValue = "내부 필드값";
        private String value = "내부 필드 값이지만 변수명이 value이다";

        void display() {
            System.out.printf("outerValue = %s, innerValue = %s\n", outerValue, innerValue);
        }

        // 외부 클래스와 내부 클래스의 인스턴스 멤버가 같은 명을 가지는 경우에 구분을 명확하게 할 수 있다.
        void display2() {
            System.out.printf("outerValue = %s, innerValue = %s\n", ExampleInnerClass.this.value, InnerClass.this.value);
        }
    }
    void test() {
        InnerClass inner = new InnerClass();
        inner.display();
    }
    void test2() {
        InnerClass inner = new InnerClass();
        inner.display2();
    }
}
