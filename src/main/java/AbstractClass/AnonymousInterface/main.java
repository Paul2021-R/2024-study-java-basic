package AbstractClass.AnonymousInterface;




public class main {
    public static void main(String[] args) {
        Flyable plain = new Flyable() {
            @Override
            public void Fly() {
                System.out.println("I'm flying");
            }
        };

        Flyable plain2 = new Flyable() {

            @Override
            public void Fly() {
                System.out.println("I'm flying222");
            }
        };

        plain.Fly();
        plain2.Fly();

        수륙양용 obj = new 수륙양용();
        obj.record();

    }
}
