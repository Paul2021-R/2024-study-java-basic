package AbstractClass.InterfaceGeometry;

public abstract class AbstractGeometry implements Geometry {
    protected Point origin;

    public AbstractGeometry(Point origin) {
        this.origin = origin;
    }

    public Point getOrigin() {
        return origin;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
    }
}
