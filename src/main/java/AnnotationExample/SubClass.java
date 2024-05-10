package AnnotationExample;

public class SubClass extends SuperClass{
    @Override
    public void overridemethod() {}

    SubClass(){
        SuperClass a = new SuperClass();
        a.deprecatedmethod(); // 사용은 가능하나 Deprecated가 표시된다.
    }

    @SuppressWarnings("deprecation")// 이렇게 설정함으로써 컴파일러가 발생될 에러를 억제한다.
    void foo() {
        SuperClass a = new SuperClass();
        a.deprecatedmethod();
    }
}
