package session3;

import java.util.*;

public class TestTriangle {
    public static void main(String[] args) {
        System.out.println("enter three sides: a, b, c: ");
        Scanner input = new Scanner(System.in);
        double a, b, c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        System.out.println("set the color: ");
        String color;
        color = input.next();

        System.out.println();
        System.out.println("set filled: ");
        boolean filled = input.nextBoolean();

        Triangle triangle = new Triangle(a, b, c);

        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println("area is " + triangle.getArea());
        System.out.println("Perimeter is " + triangle.getPerimeter());
        System.out.println("toString is " +
                triangle.toString());
        System.out.println("the color is " + triangle.getColor());
        System.out.println("the filled is " + triangle.isFilled());
    }
}
