
public class Square {

    private Point mPosition;
    private float mLength;

    private static float MIN_X = 0.0f;
    private static float MAX_X = 100.0f;

    private static float MIN_Y = 0.0f;
    private static float MAX_Y = 100.0f;

    public Square() {

    }

    public Square(Square aSquare) {

        set(new Point(aSquare.getPosition()), aSquare.getLength());
    }

    public Square(float aX, float aY, float aLength) {

        set(new Point(aX, aY), aLength);
    }

    public void set(Point aPoint, float aLength) {

        mPosition = new Point(aPoint);
        mLength = aLength;
    }

    public Point getPosition() {

        return mPosition;
    }

    float getLength() {

        return mLength;
    }

    public Point getOppositePosition() {

        Point position = new Point(mPosition.getX() + mLength, mPosition.getY() + mLength);
        return position;
    }

    public static boolean isPositionValid(Point aPosition) {

        float x = aPosition.getX();
        float y = aPosition.getY();
        return MIN_X <= x && x <= MAX_X &&
               MIN_Y <= y && y <= MAX_Y;
    }

    public boolean isLengthValid() {

        return isPositionValid(getOppositePosition());
        //TODO:It also may be like, then this method may be static
        //max(MIN_X, MIN_Y) <= mLength && mLength <= min(MAX_X, MAX_Y)
    }

    public boolean isValid() {

        //TODO: is it really need?
        Point position = getOppositePosition();
        return isPositionValid(mPosition) && isLengthValid() &&
                isPositionValid(position);
    }

    public void validate() {

        if(isPositionValid(mPosition) && isLengthValid()) {

            float deltaX = mPosition.getX() + mLength - MAX_X;
            float deltaY = mPosition.getY() + mLength - MAX_Y;

            if(deltaX > 0) {

                mPosition.set(mPosition.getX() - deltaX, mPosition.getY());
            }
            if(deltaY > 0) {

                mPosition.set(mPosition.getX(), mPosition.getY()- deltaY);
            }
            return;
        }
        else if(isPositionValid(mPosition)) {

            validateLength();
        }
        else if(isLengthValid()) {

            validatePosition();
        }
        else {

            validateLength();
            validatePosition();
        }
        validate();
    }

    private void validateLength() {

        mLength = min(MAX_X, MAX_Y) - max(mPosition.getX(), mPosition.getY());
    }

    private void validatePosition() {

        mPosition.set(max(MAX_X - mLength, MIN_X),
                      max(MAX_Y - mLength, MAX_Y));
    }

    private float min(float aA, float aB) {

        return aA < aB ? aA : aB;
    }

    private float max(float aA, float aB) {

        return aA > aB ? aA : aB;
        //TODO: also it may call min and change return value to opposite
    }

    @Override
    public String toString() {

        return "{Position = " + mPosition + "; Length = " + mLength +
                "; Opposite Position = " + getOppositePosition()  + "}";
    }

}
