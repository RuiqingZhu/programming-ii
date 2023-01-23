package session3.assignment;

public class MyPointCaller {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(0,0);
        MyPoint point2 = new MyPoint(10,3.5);
        MyPoint point3 = new MyPoint(20,13.5);
//        System.out.println(point1.distance(point2));
//
//        System.out.println(point1.distance(point3));
//        System.out.println(point2.distance(point3));

//        System.out.printf("the distance of point with (%.2f,%.2f) and (%.2f,%.2f) is %.2f", point1.getX(), point1.getY(),
//                point2.getX(), point2.getY(), point1.distance(point2) );

        System.out.printf("\nthe distance of point with (%.2f,%.2f) and (%.2f,%.2f) is %.2f", point2.getX(), point2.getY(),
                point3.getX(), point3.getY(), point2.distance(point3) );

    }
}
