package session3.employee;

public class PartTimeEmployee extends Employee {
    private String daysOffOfTheWeek;

    public PartTimeEmployee() {

    }

    public PartTimeEmployee(String newDaysOffOfTheWeek) {
        this.daysOffOfTheWeek = newDaysOffOfTheWeek;
        setCompanyName("Apple");
    }
}
