package InheritacneClass.SealedGeometry;

// sealed 클래스는 반드시 하위 클래스가 존재해야함.
public sealed class Rectangle extends Geometry permits Rect{
    private int width;
    private int height;

    public Rectangle(Point pt, int width, int height) {
        super(pt);
        this.width = width;
        this.height = height;
    }

    public void draw() {
        System.out.printf("사각형 - 원점: (%d, %d), 크기: (%d, %d)\n",
                super.origin.getX(), super.origin.getY(), width, height);
    }

}
