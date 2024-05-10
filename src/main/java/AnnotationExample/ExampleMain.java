package AnnotationExample;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ExampleMain {
    /**
     * 어노테이션은 소스 코드에 추가된 보충 정보로,
     * 메타데이터라고도 한다.
     * 또한 설정된 어노테이션의 데이터를 읽기 위해
     * 리플렉션이란 기능을 통해 읽을 수 있다.
     */

    public static void main(String[] args) {
        // 유용한 내장 어노테이션 사용 예시
        // SubClass obj = new SubClass();
        //
        // obj.foo();

        // 리플렉션 사용하기 1. 클래스 객체 파악하기
//        Class cls = Foo.class;
//        Method[] methods = cls.getMethods();
//        for (Method method : methods) {
//            System.out.println(method);
//            Annotation[] annotations = method.getAnnotations();
//            for (Annotation annotation : annotations) {
//                System.out.printf("\t%s\n", annotation);
//            }
//        }

        // proxy 객체를 통해 확인하기, 2. 특정 어노테이션을 검출하기
        Proxy proxy = new Proxy();
        try {
            proxy.method8();
            proxy.method11();
            proxy.method17();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //3. 어노테이션 새롭게 정의하기
    }
}
