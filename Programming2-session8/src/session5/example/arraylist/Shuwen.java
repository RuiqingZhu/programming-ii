package session5.example.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Shuwen Ju
 */
public class Shuwen {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter integer, stops with 0");


        int num;

        do{
            num = input.nextInt();
            if (num != 0 && !intList.contains(num)){
                intList.add(num);
            }
        }while(num != 0);

        for (Integer number : intList) {
            System.out.print(number+ " ");
        }
    }
}