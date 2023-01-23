package session4.equal;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Chris");
        Person person2 = new Person("Chris");

        //== is only for primitives
//        if (person1 == person2){
//
//        }
        if(person1.equals(person2)){
            System.out.println("Two persons are the same");
        }
        else{
            System.out.println("they are not !");
        }

    }
}
