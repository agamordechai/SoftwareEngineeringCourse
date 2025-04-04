package lesson1;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        System.out.println("lesson1.Point 1: " + p1.toString());
        Point p2 = new Point(3, 4);
        System.out.println("lesson1.Point 2: " + p2.toString());
        System.out.println("Distance between lesson1.Point 1 and lesson1.Point 2: " + p1.calcDist(p2));
        System.out.println("Distance between lesson1.Point 2 and lesson1.Point 1: " + p2.calcDist(p1));

        Line l1 = new Line(p1, p2);
        System.out.println("lesson1.Line 1: " + l1.toString() + " of length " + l1.calcLength());
    }
}
