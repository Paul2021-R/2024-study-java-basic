public class ExampleSingleton {
    private static ExampleSingleton instance = null;
    private String value;
    private ExampleSingleton() {
        value = "";
    }
    public static ExampleSingleton getInstance() {
        if (instance == null)
            instance = new ExampleSingleton();
        return instance;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
