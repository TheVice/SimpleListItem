
public class SquareListItem {

    private static int sid;
    private int id;
    private Square square;
    private SquareListItem next;

    public SquareListItem() {
        // what this counter is for? Just instance counting?
        id = sid++;
    }

    public SquareListItem setSquare(Square square) {

        square.validate();
        this.square = square;
        next = new SquareListItem();
        return next;
    }

    @Override
    public String toString() {

        //TODO: this recursion may be overload, so count of List is limited now
        String str = super.toString() +
                "= {id = " + id + "; Square = " + square + "}\n";
        if(square != null && next != null) {

            str += next;
        }

        return str;
    }

}
