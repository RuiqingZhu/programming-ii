package session3;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person("Aa", "Bb", "111", "a@b.c");
        System.out.println(p.toString());

        Student0 s = new Student0("Cc", "Dd", "222", "c@d.e");
        System.out.println(s.toString());

        Employee0 e = new Employee0(
                "Ee", "Ff", "333", "e@f.g","office303", 50000);
        System.out.println(e.toString());

        Faculty0 f = new Faculty0(
                "Gg", "Hh", "444", "g@h.i",
                "office404",60000, 8, "dean");
        System.out.println(f.toString());

        Staff0 sta = new Staff0(
                "Ii", "Jj", "555", "i@j.k",
                "office505", 40000, "Secretary");
        System.out.println(sta.toString());

    }
}
