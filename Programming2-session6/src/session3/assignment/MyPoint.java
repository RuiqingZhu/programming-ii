package session3.assignment;

public class MyPoint {
    private double x;
    private double y;

    MyPoint() {
        this(0, 0);
    }

    MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint myPoint) {
        return distance(myPoint.x, myPoint.y);
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) +
                Math.pow(this.y - y, 2));
    }


}
