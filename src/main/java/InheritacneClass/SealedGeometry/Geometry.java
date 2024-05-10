package InheritacneClass.SealedGeometry;

// sealed class
public sealed class Geometry permits Rectangle, Triangle, Circle{
    protected Point origin;

    public Geometry(Point origin) {
        this.origin = origin;
    }

    public void draw(){
        System.out.printf("도형 - %s\n", this.toString());
    }

    public String toString(){
        return String.format("원점: (%d, %d)", this.origin.getX(), this.origin.getY());
    }
}
