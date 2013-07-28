
public class Square {

    private Point position;
    private float length;

    public Square() {

    }

    public Square(Square square) {

        this(square.getPosition().getX(), square.getPosition().getY(), square.getLength());
    }

    public Square(float x, float y, float length) {

        set(new Point(x, y), length);
    }

    public void set(Point point, float length) {

        this.position = point;
        this.length = length;
    }

    public Point getPosition() {

        return position;
    }

    float getLength() {

        return length;
    }

    public Point getOppositePosition() {

        Point position = new Point(this.position.getX() + length, this.position.getY() + length);
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
        //TODO: is this method really need?
        Point position = getOppositePosition();
        return isPositionValid(this.position) && isLengthValid() &&
                isPositionValid(position);
    }

    public void validate() {

        if(isPositionValid(position) && isLengthValid()) {

            float deltaX = position.getX() + length - MAX_X;
            float deltaY = position.getY() + length - MAX_Y;

            if(deltaX > 0) {

                position.set(position.getX() - deltaX, position.getY());
            }
            if(deltaY > 0) {

                position.set(position.getX(), position.getY() - deltaY);
            }
            return;
        }
        else if(isPositionValid(position)) {

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

        length = min(MAX_X, MAX_Y) - max(position.getX(), position.getY());
    }

    private void validatePosition() {

        position.set(max(MAX_X - length, MIN_X),
                max(MAX_Y - length, MAX_Y));
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

        return "{Position = " + position + "; Length = " + length +
                "; Opposite Position = " + getOppositePosition()  + "}";
    }

    private static float MIN_X = 0.0f;
    private static float MAX_X = 100.0f;

    private static float MIN_Y = 0.0f;
    private static float MAX_Y = 100.0f;

}
