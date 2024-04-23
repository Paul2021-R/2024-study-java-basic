package AbstractClass.geometry;


public abstract class AbstractGeometry {

    protected Point origin;

    public AbstractGeometry(Point origin) {
        this.origin = origin;
    }

    public abstract void draw();

}
