package session3;

import java.util.*;

public class Person {
    String name;
    String address;
    String phone_number;
    String email_address;

    public Person() {

    }
    public Person(
            String n, String a, String p, String e) {
        name = n;
        address = a;
        phone_number = p;
        email_address = e;
    }

    public String toString() {
        return  name + " Person";
    }
}


class Student0 extends Person {
    final String status1 = "Freshman";
    final String status2 = "Sophomore";
    final String status3 = "Junior";
    final String status4 = "Senior";
    public Student0(String n, String a, String p, String e) {
        super(n, a, p, e);
    }

    public String toString() {
        return name + " Student";
    }



}

class Employee0 extends Person {
    String office;
    double salary;
    Date date_hired = new Date();
    public Employee0(
            String n, String a, String p, String e, String o, double s) {
        super(n, a, p, e);
        this.office = o;
        this.salary = s;
    }

    public String toString() {
        return name + " Employee";
    }

}

class Faculty0 extends Employee0 {

    double work_hour;
    String rank;
    public Faculty0(
            String n, String a, String p, String e, String o, double s, double w, String r) {
        super(n, a, p, e, o, s);
        this.work_hour = w;
        this.rank = r;
    }

    public String toString() {
        return name + " Faculty";
    }

}
class Staff0 extends Employee0 {
    String title;

    public Staff0(String n, String a, String p, String e, String o, double s, String t) {
        super(n, a, p, e, o, s);
        title = t;
    }

    public String toString() {
        return name + " Staff";
    }
    
}
