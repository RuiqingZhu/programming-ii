package session4.assignment.q2;

import java.util.Date;

public class Staff extends Employee {
    private final String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    public String toString() {
        return super.getName() + " " + getClass().getName();
    }
}
