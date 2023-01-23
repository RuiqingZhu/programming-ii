package session4.example.override;

public class Animal extends Object {
    public void sound(){
        System.out.println("NOTHING");
    }

    @Override
    public String toString() {
        return "Animal{}";
    }
}
