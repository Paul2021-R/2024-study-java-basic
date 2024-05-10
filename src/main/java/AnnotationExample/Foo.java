package AnnotationExample;

public class Foo {
    @Deprecated
    public void method8() {
        System.out.println("method8");
    }

    @NewVersion(version = "11", os = "Windows 10", arch = "amd64")
    public void method11() {
        System.out.println("method11");
    }

    @NewVersion(version = "21", os = "Windows 11", arch = "amd64")
    public void method21() {
        System.out.println("method21");
    }

    @NewVersion(version = "17", os = "Mac OS X", arch = "aarch64")
    public void method17() {
        System.out.println("method17");
    }
}
