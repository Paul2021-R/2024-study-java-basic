package InheritacneClass.SealedGeometry;

// non-sealed 는 sealed 의 연속을 끊어낼 수 있음
public non-sealed class Triangle extends Geometry {
    private Point p1;
    private Point p2;

    public Triangle(Point pt, Point p1, Point p2) {
        super(pt);
        this.p1 = p1;
        this.p2 = p2;
    }

    public void draw() {
        System.out.printf("삼각형 - 원점: (%d, %d), 꼭지점1: (%d, %d), 꼭지점2: (%d, %d)\n",
                super.origin.getX(), super.origin.getY(), p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
}
