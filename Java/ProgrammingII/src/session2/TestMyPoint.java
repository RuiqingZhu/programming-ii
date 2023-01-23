package session2;

public class TestMyPoint {
    public static void main(String[] args)
    {
        // Prints the distance between the two designated points.
        System.out.println("The distance between (0,0) and (10,30.5) is " + new MyPoint().distance(new MyPoint(10, 30.5)) + " units.");
    }
}
