package session5.example.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayUtils {
    public static void main(String[] args) {
        //array to arrayList
        String[] array = {"red", "green", "blue"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));


        //arrayList to array
        String[] array1 = new String[list.size()];
        String[] converted = list.toArray(array1);

        //sort a list
        Integer[] arrayNum = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> listNumber = new ArrayList<>(Arrays.asList(arrayNum));
        Collections.sort(listNumber); //collections in the java.util
        Collections.max(listNumber); //Max of a list
        Collections.min(listNumber); // Min of a list


    }
}
