package session3.examples.inheritance.emp;

import session2.Employee;

import java.util.Date;

public class EmployeeTest {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("1111", new Date(), new Address("beauharnois"), 80000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("222", new Date(), new Address("vincent"), 40);

        System.out.println(fullTimeEmployee);
        System.out.println(partTimeEmployee);
    }
}
