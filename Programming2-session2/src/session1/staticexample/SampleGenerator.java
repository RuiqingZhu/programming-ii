package session1.staticexample;

public class SampleGenerator {
    public static void main(String[] args) {
        Sample sample1 = new Sample();
        Sample sample2 = new Sample();
        Sample sample3 = new Sample();
        Sample sample4 = new Sample();

//        sample1.name = "test1";
        //encapsulation does not let you to have direct access

        System.out.println("the number of generated objects are =  " + Sample.numberOfObjects);
    }
}
