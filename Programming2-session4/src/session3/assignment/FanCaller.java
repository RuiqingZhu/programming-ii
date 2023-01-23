package session3.assignment;

public class FanCaller {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        fan2.setSpeed(Fan.FAST);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println("Fan 1 toString: " + fan1.toString());
        System.out.println("Fan 2 toString: " + fan2.toString());

        Fan fan3 = new Fan(Fan.MEDIUM, true, 3.2, "red");
        System.out.println(fan3);

        Fan fan4 = new Fan(true, 3.2, "red");
        System.out.println(fan3);
    }
}
