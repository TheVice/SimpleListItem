
public class Main {

    public static void main(String... args) {

        System.out.print("Testing point\n");

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
    }

}
