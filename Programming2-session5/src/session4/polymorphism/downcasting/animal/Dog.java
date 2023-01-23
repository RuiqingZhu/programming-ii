package session4.polymorphism.downcasting.animal;

public class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("woof");
    }

    public void bark(){
        System.out.println("this is the sound of bark !!!!");
    }
}
