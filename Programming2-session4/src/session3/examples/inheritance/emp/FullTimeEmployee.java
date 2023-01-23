package session3.examples.inheritance.emp;

import java.util.Date;

public class FullTimeEmployee extends Employee{
    private double annualSalary;

    public FullTimeEmployee(String empId, Date hireDate, Address address, double annualSalary) {
        super(empId, hireDate, address); //constructor of parent class
        this.annualSalary = annualSalary;

//        setEmpId(empId);
//        setHireDate(hireDate);
//        setAddress(address);
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                super.toString() + getAddress() +
                "and annualSalary=" + annualSalary +
                '}';
    }
}
