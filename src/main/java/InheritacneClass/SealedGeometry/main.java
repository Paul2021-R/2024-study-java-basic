package InheritacneClass.SealedGeometry;

public class main {

    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Geometry r1 = new Rectangle(p1, 10, 10);
        r1.draw();

        Point p2 = new Point(1, 5);
        Point p3 = new Point(2, 4);

        Geometry t1 = new Triangle(p1, p2, p3);
        t1.draw();

        Geometry c1 = new Circle(p1, 15);
        c1.draw();
    }
}
