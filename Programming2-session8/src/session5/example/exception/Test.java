package session5.example.exception;

import java.io.File;
import java.io.FileInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[2];
//        arr[3] = 2;
//        System.out.println("ddddd");

        System.out.println("please enter a number");
        Scanner input = new Scanner(System.in);
        int x = 0;
        do {
            try {
                x = input.nextInt();
                System.out.println(x + 2);
            } catch (InputMismatchException exception) {
                System.out.println("please enter a correct input Integer like 0 , 1, 2 .. Please enter again");
                input.nextLine(); //Discard input !!!!
            }
        }while (x != 0);
//        x = 12/0; arithmetic exception -> RunTime exception (UncheckedException)_
//        FileInputStream fin=new FileInputStream("D:\\testout.txt"); //checkedException

    }
}
