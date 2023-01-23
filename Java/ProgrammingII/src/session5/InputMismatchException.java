package session5;

import java.util.Scanner;

public class InputMismatchException {

    public static void main(String[] args) {
        boolean isInt = false;
        System.out.print("Enter two Integer: ");
        Scanner input = new Scanner(System.in);
        while (!isInt) {
            try {
                int a = input.nextInt();
                int b = input.nextInt();
                System.out.println(a + " + " + b + " = " + (a + b));
                isInt = true;
            } catch (java.util.InputMismatchException exception) {
                System.out.print("Try again. Enter two Integer: ");
            }
            input.nextLine();
        }
    }
}
