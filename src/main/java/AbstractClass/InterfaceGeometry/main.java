package AbstractClass.InterfaceGeometry;

import AbstractClass.InterfaceGeometry.AbstractGeometry;
import AbstractClass.InterfaceGeometry.Circle;
import AbstractClass.InterfaceGeometry.Rectangle;
import AbstractClass.InterfaceGeometry.Triangle;

public class main {

    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Rectangle r1 = new Rectangle(p1, 10, 10);

        Point p2 = new Point(1, 5);
        Point p3 = new Point(2, 4);

        Triangle t1 = new Triangle(p1, p2, p3);

        Circle c1 = new Circle(p1, 15);

        AbstractGeometry[] arr = new AbstractGeometry[3];
        arr[0] = r1;
        arr[1] = c1;
        arr[2] = t1;

        // 다형성의 특징을 나타내는 핵심 구문
        for (AbstractGeometry g : arr) {
            g.draw();
        }
    }
}
