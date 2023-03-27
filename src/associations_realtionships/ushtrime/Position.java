package associations_realtionships.ushtrime;

public class Position {
    private double x;
    private double y;

    public Position(double x, double y) {
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

    public double distanceTo(Position position) {
        double xDiff = position.x - this.x;
        double yDiff = position.y - this.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

}











