package session8.compareble;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Person> al=new ArrayList<>();
        al.add(new Person("A2", 2000));
        al.add(new Person("A1", 1000));
        al.add(new Person("A3", 4000));

        System.out.println("after sort by salary");

        Collections.sort(al); // we use this class for operation like sort on an arraylist

        for(Person p : al){
            System.out.println(p);
        }

        System.out.println("after sort by name");

        al.sort(new NameComparator());
        for(Person p : al){
            System.out.println(p);
        }

        System.out.println("after sort by salary");

        Collections.sort(al, new SalaryComparator());
        for(Person p : al){
            System.out.println(p);
        }
    }
}
