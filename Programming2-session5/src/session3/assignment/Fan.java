package session3.assignment;

public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    //default constructor fan
    Fan() {
        speed = SLOW;
        on = false;
        radius = 5.0;
        color = "blue";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public Fan(boolean on, double radius, String color) {
        this.speed = SLOW;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    //Mutator methods

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setSpeed(int Speed) {
        this.speed = Speed;
    }

    public void setColor(String Color) {
        this.color = Color;
    }

    public void setRadius(double Radius) {
        this.radius = Radius;
    }

    //Accessor methods

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    //Return a string description for the fan
    @Override
    public String toString() {
        if (on) {
            return "\nFan speed: " + getSpeed() + ", color: " + color +
                    ", radius: " + radius + "\n";
        } else {
            return "Fan color: " + color + ", radius: " + radius +
                    " fan is off";
        }
    }

}
