package ushtrime;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    public double distanceTo(Point otherPoint) {
        double diffX = otherPoint.x - this.x;
        double diffY = otherPoint.y - this.y;
        return Math.sqrt(diffX * diffX + diffY * diffY);
    }

    public static double distanceBetween(Point p1, Point p2) {
        double diffX = p2.x - p1.x;
        double diffY = p2.y - p1.y;
        return Math.sqrt(diffX * diffX + diffY * diffY);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
