
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

    }
}
