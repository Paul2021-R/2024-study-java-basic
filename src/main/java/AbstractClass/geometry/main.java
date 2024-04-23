package AbstractClass.geometry;

public class main {

    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Rectangle r1 = new Rectangle(p1, 10, 10);

        Point p2 = new Point(1, 5);
        Point p3 = new Point(2, 4);

        Triangle t1 = new Triangle(p1, p2, p3);

        Circle c1 = new Circle(p1, 15);


//        다형성(Polymorhism)의 특징을 나타내는 핵심 구문
//        추상클래스를 통해서도 구현이 가능하다.
//        Geometry[] arr = new Geometry[3];
//        arr[0] = r1;
//        arr[1] = c1;
//        arr[2] = t1;
//
//        다형성의 특징을 나타내는 핵심 구문
//        for (Geometry g : arr) {
//            g.draw();
//        }

        // 다형성(Polymorhism)의 특징을 나타내는 핵심 구문
        // 추상클래스를 통해서도 구현이 가능하다.
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
