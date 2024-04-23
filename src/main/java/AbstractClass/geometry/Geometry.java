package AbstractClass.geometry;

public class Geometry {

    protected Point origin;

    public Geometry(Point origin) {
        this.origin = origin;
    }

//    public void draw(){
//        System.out.printf("도형 - %s\n", this.toString());
//    }

    public void draw(){
        ;
    }

    public String toString(){
        return String.format("원점: (%d, %d)", this.origin.getX(), this.origin.getY());
    }
}
