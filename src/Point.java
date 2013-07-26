
public class Point {

    private float mX, mY;

    public Point() {

    }

    public Point(Point aPoint) {

        set(aPoint.getX(), aPoint.getY());
    }

    public Point(float aX, float aY) {

        set(aX, aY);
    }

    public void set(float aX, float aY) {

        mX = aX;
        mY = aY;
    }

    public float getX() {

        return mX;
    }

    public float getY() {

        return mY;
    }

    @Override
    public String toString() {

        return  "{x = " + mX + "; y = " + mY + "}";
    }

}
