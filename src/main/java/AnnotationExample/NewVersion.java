package AnnotationExample;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 어노테이션 직접 만들 때 필요한 것은
 * 어노테이션 보유 정책(retention policy) 이다.
 * RetentionPolicy.SOURCE : 소스 코드 안에서만 보유하고, 컴파일이 끝나면 폐기
 * RetentionPolicy.CLASS : 컴파일, .class 파일 안에 어노테이션을 보유 하나, 실행 시 사용 할수 없게 된다.
 * RetentionPolicy.RUNTIME : 실행 시간 동안 JVM을 통해서 사용할 수 있게 된다.
 * 기본적으로 어떠한 보유 정책을 가지지 않으면 CLASS 가 기본으로 설정된다.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface NewVersion {
    String version();
    String os();
    String arch();
}
