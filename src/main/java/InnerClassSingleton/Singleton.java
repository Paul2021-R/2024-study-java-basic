package InnerClassSingleton;

public class Singleton {
    private String value;
    private Singleton(){
        value = "";
    }
    private static class InnerSingleton {
        static final Singleton instance = new Singleton();
    }
    private static Singleton getInstance() {
        return InnerSingleton.instance;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
