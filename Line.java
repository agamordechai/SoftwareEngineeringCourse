public class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double calcLength() {
        return start.calcDist(end);
    }

    public String toString() {
        return "Line from " + start.toString() + " to " + end.toString();
    }
}
