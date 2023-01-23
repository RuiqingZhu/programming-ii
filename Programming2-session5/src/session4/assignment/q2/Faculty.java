package session4.assignment.q2;

import java.util.Date;

public class Faculty extends Employee {
    private double workHour;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, double workHour, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.workHour = workHour;
        this.rank = rank;
    }

    public double getWorkHour() {
        return workHour;
    }

    public void setWorkHour(double workHour) {
        this.workHour = workHour;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

}
