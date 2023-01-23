package session3.examples.inheritance.emp;

import java.util.Date;

public class Employee {
    private String empId;
    private Date hireDate;
    private Address address; //composition

    public Employee(String empId, Date hireDate, Address address) {
        this.empId = empId;
        this.hireDate = hireDate;
        this.address = address;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", hireDate=" + hireDate +
                ", address=" + address +
                '}';
    }
}
