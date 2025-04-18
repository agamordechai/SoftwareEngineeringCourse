package lesson1;

public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(int y) {
        this.x = 0;
        this.y = y;
    }
    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public int[] getXY() {
        return new int[] {this.x, this.y};
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double calcDist(Point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
