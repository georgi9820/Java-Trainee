package Arrays;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int rotations = Integer.parseInt(scan.nextLine());

        int[] array = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }

        // Perform the rotations
        for (int i = 0; i < rotations; i++) {
            int firstElement = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = firstElement;
        }

        // Print the resulting array
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
