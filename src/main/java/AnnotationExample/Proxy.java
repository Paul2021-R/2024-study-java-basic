package AnnotationExample;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Proxy {
    private Foo foo = new Foo();
    private Class cls;
    public Proxy(){
        this.cls = Foo.class;
    }

    public void method8() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = cls.getMethod("method8");
        if (method.isAnnotationPresent(Deprecated.class)) {
            System.out.println("이 메서드는 더이상 사용할 수 없습니다.");
            Method newMethod = this.findMethod();
            if (newMethod != null) {
                System.out.println("대체 메서드를 호출합니다.");
                newMethod.invoke(foo);
            } else
                foo.method8();
        }
        foo.method8();
    }
    public void method11() {
        foo.method11();
    }
    public void method21() {
        foo.method21();
    }
    public void method17() {
        foo.method17();
    }
    private Method findMethod() {
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            NewVersion newVersion = method.getAnnotation(NewVersion.class);
            String version = System.getProperty("java.vm.specification.version");
            String os = System.getProperty("os.name");
            String arch = System.getProperty("os.arch");
//            System.out.println(version);
//            System.out.println(os);
//            System.out.println(arch);
            if (method.isAnnotationPresent(NewVersion.class) &&
            newVersion.version().equals(version) &&
            newVersion.os().equals(os) &&
            newVersion.arch().equals(arch)) {
                return method;
            }
        }
        return null;
    }

}
