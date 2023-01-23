import session1.Circle;
import session1.Rectangle;
import session1.TV;

public class Main {
    public static void main(String[] args) {
        //instantiate
        Circle circle1 = new Circle();
        double area = circle1.getArea();

        Circle circle2 = new Circle();
        circle2.setRadius(2);
        area = circle2.getArea();

        Circle circle3 = new Circle(3);
        area = circle3.getArea();

        //Rectangle example
        Rectangle rectangle1 = new Rectangle(1, 2);
        rectangle1.getArea();

        Rectangle rectangle2 = new Rectangle();
        rectangle1.getArea();

        ///TV simulation
        TV tvObjectRef = new TV();
        tvObjectRef.turnOn();
        tvObjectRef.setVolume(8);

//        TV.turnOn();
        System.out.println("tv1's channel is " + tvObjectRef.channel
                + " and volume level is " + tvObjectRef.volumeLevel);



        TV.print(); // it is a static method
        Math.random();

        //object and objectRef
    }

    public static void printX(){
        //do something
    }
}