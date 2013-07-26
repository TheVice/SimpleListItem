
public class SquareListItem {

    private static int mSID;
    private int mID;
    private Square mSquare;
    private SquareListItem mNext;

    public SquareListItem() {

        mID = mSID++;
    }

    public SquareListItem setSquare(Square aSquare) {

        aSquare.validate();
        mSquare = new Square(aSquare);
        mNext = new SquareListItem();
        return mNext;
    }

    @Override
    public String toString() {

        //TODO: this recursion may be overload, so count of List is limited now
        String str = super.toString() +
                "= {id = " + mID + "; Square = " + mSquare + "}\n";
        if(mSquare != null && mNext != null) {

            str += mNext;
        }

        return str;
    }

}
