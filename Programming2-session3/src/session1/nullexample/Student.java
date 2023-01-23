package session1.nullexample;

public class Student {
    String name;
    int age;
    boolean isScienceMajor;
    char gender;

    public Student(){

    }
    //overload constructor
    public Student(String name){
        this.name = name;
    }

    public Student(String name, char gender){
        this(name); //you can use this() to call another constructor
        this.gender = gender;
        this.register();
    }

    public void register(){

    }
}
