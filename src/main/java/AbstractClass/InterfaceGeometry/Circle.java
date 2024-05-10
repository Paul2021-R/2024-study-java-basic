package AbstractClass.InterfaceGeometry;

public class Circle extends AbstractGeometry{
    private int radius;

    public Circle (Point origim, int radius) {
        super(origim);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("원형 - 원점: (%d, %d), 반지름: %d\n",
                super.origin.getX(), super.origin.getY(), radius);
    }
}
