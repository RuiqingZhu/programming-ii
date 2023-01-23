package session5;

import java.util.Scanner;
import java.util.Random;

public class ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = creatNumberArray();
        while (true) {
            try {
                System.out.print("Enter an index to find the number: ");
                int index = input.nextInt();
                System.out.println(numbers[index]);
            } catch (Throwable exception) {
                System.out.println("Out of Bounds. Enter an index between 0 and 99");
            }
            input.nextLine();
        }

    }

    public static int[] creatNumberArray() {
        Random num = new Random(9);
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = num.nextInt(100) + 1;
        }

        return numbers;
    }
}

