package session6.assignments;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = getArray();
        System.out.println("Please enter the index of the array:");
        try {
            System.out.println("The corresponding element value is " +
                    array[scanner.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds." );
        }
    }

    private static int[] getArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
            System.out.println("Index." + i + " -> " + array[i]);
        }
        return array;
    }
}
