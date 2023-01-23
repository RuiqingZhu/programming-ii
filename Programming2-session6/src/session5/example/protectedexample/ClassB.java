package session5.example.protectedexample;

public class ClassB {
    private void myMethod(){
        ClassA classA = new ClassA();
        String nameInClassA = classA.name; //It it accisble when we have default(Package) access or public
    }
}
