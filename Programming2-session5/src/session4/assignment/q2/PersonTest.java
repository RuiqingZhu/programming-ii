package session4.assignment.q2;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class PersonTest
    {
        public static void main(String[] args)
            {
                Person person = new Person("Peppa", "Montreal", "5140001000", "2292018@qq.com");
                System.out.println(person);

                Student student = new Student("George", "Montreal", "5140002000", "2121678@163.com", Student.Status.JUNIOR);
                System.out.println(student);

                Employee employee = new Employee("Daddy", "Montreal", "5140003000", "78976@qq.com", "room101", 40000, new MyDate());
                System.out.println(employee);

                Faculty faculty = new Faculty("Mummy", "Montreal", "5140004000", "48500@qq.com", "room201", 60000, new MyDate(2021, 11, 1), 40, "leader");
                System.out.println(faculty);

                Staff staff = new Staff("Grandpa", "Montreal", "5140005000", "7489@qq.com", "room001", 29000, new MyDate(2022, 10, 1),"monitor");
                System.out.println(staff);

            }
    }
