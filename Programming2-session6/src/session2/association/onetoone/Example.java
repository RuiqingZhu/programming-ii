package session2.association.onetoone;

public class Example {
    public static void main(String[] args) {
        Passenger passenger1 = new Passenger("Reza", 21, new Passport("1111111", "Canada"));

        Passport passportForPassenger2 = new Passport("22222", "USA");
        Passenger passenger2 = new Passenger("Jack", 20, passportForPassenger2);
    }
}
