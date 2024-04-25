package AbstractClass.AnonymousInterface;

public class 수륙양용 implements Driving, Swiming{

    public 수륙양용() {
    }

    public void record() {
        Driving.super.record();
        Swiming.super.record();
        System.out.println("record for 수륙양용");
    }

}
