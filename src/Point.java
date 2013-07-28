public class Point {

    private float mX, mY;

    public Point() {

    }

    // Using copy constructo in all classes is not a good thing. 
    // This is Ok in C++ (becouse C++ create copy constructor in auto mode) but in Java usualy try not to implenet it everywere
    // i will recheck logic but not today =(, PS: i this tommorrow morning
    // and in this case better to call another constructor:
    /*
        public Point(Point aPoint) {
            this(aPoint.getX(), aPoint.getY());
        }   
    */
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
