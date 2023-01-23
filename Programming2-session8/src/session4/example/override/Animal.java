package session4.example.override;

public class Animal {
    public void sound(){
        System.out.println("NOTHING");
    }

    @Override
    public String toString() {
        return "Animal{}";
    }
}
