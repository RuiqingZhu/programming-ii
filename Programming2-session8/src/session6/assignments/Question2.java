package session6.assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 integers: ");
        int num1 = 0;
        int num2 = 0;
//        boolean isInValid = false;
        boolean isValid = false;

        while (!isValid) {
            try {
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();
                isValid = true;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Invalid input...");
                System.out.println("Please enter 2 integers:");
            }
        }

//        do{
//            try {
//                num1 = scanner.nextInt();
//                num2 = scanner.nextInt();
//                isInValid = false;
//            } catch (InputMismatchException e) {
//                scanner.nextLine();
//                System.out.println("Invalid input...");
//                System.out.println("Please enter 2 integers:");
//                isInValid = true;
//            }
//        }while (isInValid);



        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
