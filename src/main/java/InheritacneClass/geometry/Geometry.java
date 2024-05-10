package InheritacneClass.geometry;

// public final class Geometry {
// class 자체에 final을 붙이면 상속이 불가능한 구조로 만들 수 있다.
public class Geometry {
//    private Point origin;
    protected Point origin;

    public Geometry(Point origin) {
        this.origin = origin;
    }

//    public final void draw(){
//    만약 final 키워드를 붙이면 상속 받은 클래스에서 수정이 불가능하다.
    public void draw(){
        System.out.printf("도형 - %s\n", this.toString());
    }

    public String toString(){
        return String.format("원점: (%d, %d)", this.origin.getX(), this.origin.getY());
    }
}
