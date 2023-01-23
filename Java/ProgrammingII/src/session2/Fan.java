package session2;

public class Fan {
    public final static int SLOW = 1;
    public final static int MEDIUM = 2;
    public final static int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean newOn) {
        on = newOn;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public String toString() {
        String resultOn = "speed " + speed + "\n" + "color " + color + "\n" + "radius " + radius + "\n";
        String resultOff = "color " + color + "\n" + "radius " + radius + "\n";

        if (isOn()) {
            return resultOn;
        }
        else {
            resultOff += "fan is off";
            return resultOff;
        }
    }
}
