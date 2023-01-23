package session4.example.override;

public class Test {
    public static void main(String[] args) {
        System.out.println(new Animal());
        System.out.println(new Dog());
        new Dog().sound();
        new Dog().sound("max");

        //upcasting
        System.out.println("UPCASTING RESULT");
        Animal animal = new Dog(); //upcasting
        animal.sound();

        Animal animal2 = new Cat(); //upcasting
        animal2.sound();
    }

}
