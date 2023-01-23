package session2;

public class MyPoint {
    // Declare variables to store coordinates.
    private double x;
    private double y;

    // Get method that returns the X coordinate.
    private double getX()
    {
        return x;
    }

    // Get method that returns the Y coordinate.
    private double getY()
    {
        return y;
    }

    // No-Arg Constructor that creates point (0,0).
    public MyPoint()
    {
        x = 0;
        y = 0;
    }

    // Constructor that will construct a point with specified coordinates.
    public MyPoint(double newX, double newY)
    {
        x = newX;
        y = newY;
    }

    // Method that returns the distance from this point
    //  to a specified point of the MyPoint type.
    public double distance(MyPoint otherPoint)
    {
        return distance(otherPoint.getX(), otherPoint.getY());
    }

    // Method that returns the distance from this point
    //  to another point with specified x- and y- coordinates.
    public double distance(double specifiedX, double specifiedY)
    {
        return Math.sqrt((Math.pow((x - specifiedX), 2) + Math.pow((y - specifiedY), 2)));
    }

}
