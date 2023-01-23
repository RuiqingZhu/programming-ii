package session1.staticexample;

public class Sample {
    String name; //instance variable
    static int numberOfObjects = 0; // class variable

    public Sample(){
        numberOfObjects++;
    }

    static void printNumberOfObjects(){
        System.out.println(numberOfObjects);
    }
}
