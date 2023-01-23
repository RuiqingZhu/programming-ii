package session3.employee;

public class FullTimeEmployee extends Employee {
    private int vacationBalance;

    public FullTimeEmployee() {

    }

    public FullTimeEmployee(int newVacationBalance) {
        this.vacationBalance = newVacationBalance;
        setCompanyName("Apple");
    }


}
