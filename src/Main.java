
public class Main {

    public static void main(String... args) {

        System.out.print("Testing Point\n");

        Point pn = new Point();
        pn.set(1.2f, 3.4f);
        System.out.println(pn.getX() + pn.getY());
        System.out.println(pn.getX() + " " + pn.getY());
        System.out.println(pn);

        Point pn2 = new Point(pn);
        System.out.println(pn2.getX() + pn2.getY());
        System.out.println(pn2.getX() + " " + pn2.getY());
        System.out.println(pn2);

        pn = new Point(pn2.getX(), pn2.getY());
        System.out.println(pn.getX() + pn.getY());
        System.out.println(pn.getX() + " " + pn.getY());
        System.out.println(pn);

        System.out.print("Testing Square\n");
        Square sq = new Square();
        sq.set(pn, 110.0f);
        System.out.println(sq);
        System.out.println(sq.isValid() ? "Valid" : "Not valid");
        sq.validate();

        Square sq1 = new Square(sq);
        System.out.println(sq1);
        System.out.println(sq1.isValid() ? "Valid" : "Not valid");

        sq = new Square(5.6f, 7.8f, 9.1f);
        if(!sq.isValid()) {

            sq.validate();
        }
        System.out.println(sq);

        System.out.print("Testing SquareListItem\n");
        SquareListItem rootItem = new SquareListItem();
        SquareListItem item = rootItem;

        for(float x = -45.0f; x < 105.0f; x += 15.0f) {

            for(float y = -45.0f; y < 105.0f; y += 15.0f) {

                for (float length = -45.0f; length < 105.0f; length += 15.0f) {

                    item = item.setSquare(new Square(x, y, length));
                }
            }
        }

        System.out.println("One item only - " + item);
        System.out.print(rootItem);
    }

}
