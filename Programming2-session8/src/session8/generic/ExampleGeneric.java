package session8.generic;

import java.util.ArrayList;

public class ExampleGeneric {
    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<>();

        //Type safety at compile time
//        intArray.add("a string"); //it is not possible


        //Elimination of casts
        ArrayList list = new ArrayList();
        list.add("hello");
        String s1 = (String) list.get(0); //I have to cast

        ArrayList<String> list2 = new ArrayList<String>();
        list.add("hello");
        String s2 = list2.get(0);   // no cast
    }
}
