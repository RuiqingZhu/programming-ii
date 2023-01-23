package session4.polymorphism.downcasting.animal;

public class Test {
    public static void main(String[] args) {
        Animal dog = new Dog(); //upcasting
        trainerOperation(dog);

        Animal cat = new Cat(); //upcasting
        trainerOperation(cat);
    }

    public static void trainerOperation(Animal animal){
        animal.sound();
        //DownCasting
        if(animal instanceof Dog){
            Dog dog = (Dog) animal; //explicit casting
            dog.bark();
        }

        //I want to check the bark
    }
}
