package session4.assignment.q2;

public class Student extends Person {
    private Status status;

    public Student(String name, String address, String phoneNumber, String emailAddress, Status status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    public Student(Person person, Status status) {
        super(person.getName(), person.getAddress(), person.getPhoneNumber(), person.getEmailAddress());
        this.status = status;
    }

    enum Status {
        FRESHMAN,
        SOPHOMORE,
        JUNIOR,
        SENIOR
    }
}


