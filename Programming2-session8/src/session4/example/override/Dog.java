package session4.example.override;

public class Dog extends Animal{

    //override
    @Override
    public void sound(){
        System.out.println("woof");
    }


    //overload when count or/and of the arguments are changing but the name is the same
    public void sound(String name){
        System.out.println(name +"has a woop sound");
    }

    public void sound(String name, int childCount){
        System.out.println(name +"has a woop sound");
    }

    public void sound(int childCount){
        System.out.println("he has " + childCount + " children");
    }

    @Override
    public String toString() {
        return "Dog{}";
    }
}
