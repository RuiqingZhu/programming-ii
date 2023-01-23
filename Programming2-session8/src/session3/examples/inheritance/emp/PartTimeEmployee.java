package session3.examples.inheritance.emp;

import java.util.Date;

public class PartTimeEmployee extends Employee {
    private double hourlySalary;

    public PartTimeEmployee(String empId, Date hireDate, Address address, double hourlySalary) {
        super(empId, hireDate, address); // call the constructor of parent class
        this.hourlySalary = hourlySalary;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                super.toString() + //super is for calling the reference of parent class
                " and hourlySalary=" + hourlySalary +
                '}';
    }
}
