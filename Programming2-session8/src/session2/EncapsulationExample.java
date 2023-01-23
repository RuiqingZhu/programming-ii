package session2;

public class EncapsulationExample {
    public static void main(String[] args) {
        Person person = new Person(10, "reza");
        //by encapsulation you LIMIT the user from doing wrong action
//        person.name = "reza";
//        person.age = -5;
//        person.countryName = "Germany";
//        person.setAge(10);
//        person.setName("reza");

//        person = new Person(11, "reza");

        int age = person.getAge();
        String name = person.getName();
        String countryName = person.getCountryName();

        //abstraction : you create a class/method or a function and give it to the users
        // and ask them to use it
        //the user should NOT worry about wrong usage of system or HOW the system works

        System.out.println("test");
    }
}
