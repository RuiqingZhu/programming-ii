package session4.assignment.q1;

public class Triangle extends GeometricObject{
    private double side1;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle()
    {
        setSide2(1.0);
        setSide3(1.0);
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled); // for calling ONLY the constrcutor of the parent class
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double perimeter = getPerimeter();
        return Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
    }

    public double getPerimeter()
    {
        return side1 + side2 + side3;
    }

    @Override
    public String toString()
    {
        return " Triangle: Side 1 = " + side1 + " Side 2 = " + side2 + " Side 3 = " + side3  + " and the color is "
                + super.getColor();
    }
}
