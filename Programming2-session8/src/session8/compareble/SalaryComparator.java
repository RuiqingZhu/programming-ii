package session8.compareble;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSalary() < o2.getSalary()) return -1;
        if (o1.getSalary() > o2.getSalary()) return 1;
        else return 0;    }
}
