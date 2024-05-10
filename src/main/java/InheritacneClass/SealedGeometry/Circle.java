package InheritacneClass.SealedGeometry;

// sealed 는 상속 받는 경우가, final, non-sealed, sealed 만 가능하다.
// final은 가장 마지막임을 알림
public final class Circle extends Geometry {
    private int radius;

    public Circle (Point origim, int radius) {
        super(origim);
        this.radius = radius;
    }

    public void draw() {
        System.out.printf("원형 - 원점: (%d, %d), 반지름: %d\n",
                super.origin.getX(), super.origin.getY(), radius);
    }
}
