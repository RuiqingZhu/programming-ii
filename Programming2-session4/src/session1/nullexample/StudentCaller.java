package session1.nullexample;

public class StudentCaller {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("the name -> "+ student.name + " the age -> " + student.age + " isScienceMajor -> " + student.isScienceMajor
        + " gender -> " + student.gender );

        System.out.println("the name -> "+ student.name.charAt(0) + " the age -> " + student.age + " isScienceMajor -> " + student.isScienceMajor
                + " gender -> " + student.gender );

    }
}
