public class SquareListItem {

    private static int mSID;
    private int mID;
    private Square mSquare;
    private SquareListItem mNext;

    public SquareListItem() {
        // what this counter is for? Just instance counting?
        mID = mSID++;
    }

    public SquareListItem setSquare(Square aSquare) {

        aSquare.validate();
        // why we need copy constructor here? 
        // i thinsk is better to setup direct mSquare = aSquare;
        // PS: in Java style this string should be simething like this: this.square = square;  
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
