package session3.examples.inheritance;

//Create 3 classes
//Employee

// FullTimeEmployee

// PartTimeEmployee

//use inheritance by creativity
public class Rectangle extends Shape {
//    private String color;
    private int width;
    private int height;

    public Rectangle(){

    }

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        setColor(color);
    }

    public void printRectangle(){
        System.out.println(this.height + " " + this.width + " " + getColor());
    }
}
