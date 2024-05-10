package InheritacneClass.SealedGeometry;

// Sealed 된 Rectangle에서 다시 물려 받음.
// final이 아니라면 또 다시 상속해줘야한다.
public final class Rect extends Rectangle{
    public Rect(Point pt, int width, int height) {
        super(pt, width, height);
    }
}
