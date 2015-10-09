
public class Point {

    private float x, y;

    public Point() {

    }

    public Point(Point point) {

        this(point.getX(), point.getY());
    }

    public Point(float x, float y) {

        set(x, y);
    }

    public void set(float x, float y) {

        this.x = x;
        this.y = y;
    }

    public float getX() {

        return x;
    }

    public float getY() {

        return y;
    }

    @Override
    public String toString() {

        return  "{x = " + x + "; y = " + y + "}";
    }

}
